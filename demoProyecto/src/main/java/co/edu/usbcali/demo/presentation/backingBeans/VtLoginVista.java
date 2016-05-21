package co.edu.usbcali.demo.presentation.backingBeans;


import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.component.inputtext.InputText;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.edu.usbcali.demo.exceptions.ZMessManager;
import co.edu.usbcali.demo.modelo.VtEmpresa;
import co.edu.usbcali.demo.modelo.VtUsuario;
import co.edu.usbcali.demo.presentation.businessDelegate.IBusinessDelegatorView;
import co.edu.usbcali.demo.utilities.FacesUtils;



@ManagedBean
@ViewScoped
public class VtLoginVista {

	private final static Logger log = LoggerFactory.getLogger(VtLoginVista.class);

	@ManagedProperty(value="#{BusinessDelegatorView}")
	private IBusinessDelegatorView businessDelegatorView;

	
	public IBusinessDelegatorView getBusinessDelegatorView() {
		return businessDelegatorView;
	}

	public void setBusinessDelegatorView(IBusinessDelegatorView businessDelegatorView) {
		this.businessDelegatorView = businessDelegatorView;
	}



	private InputText txtUsuarioEmail;
	private InputText txtUsuarioPassword;
	
	private CommandButton btnIniciarSesion;






	public InputText getTxtUsuarioEmail() {
		return txtUsuarioEmail;
	}

	public void setTxtUsuarioEmail(InputText txtUsuarioEmail) {
		this.txtUsuarioEmail = txtUsuarioEmail;
	}

	public InputText getTxtUsuarioPassword() {
		return txtUsuarioPassword;
	}

	public void setTxtUsuarioPassword(InputText txtUsuarioPassword) {
		this.txtUsuarioPassword = txtUsuarioPassword;
	}
	public CommandButton getBtnIniciarSesion() {
		return btnIniciarSesion;
	}

	public void setBtnIniciarSesion(CommandButton btnIniciarSesion) {
		this.btnIniciarSesion = btnIniciarSesion;
	}


	//  Ingresar Login
	public  String ingresarAction(){

		System.out.println("crear D:");

		try {
			
		
			FacesUtils facesUtils=  new FacesUtils();
			
			if (txtUsuarioEmail.getValue().toString().trim()==null  || txtUsuarioEmail.getValue().toString().trim()=="") {
				throw new Exception("Debe ingresar su cuenta");
			}
			
			if (!facesUtils.checkEmail(txtUsuarioEmail.getValue().toString().trim())) {
				throw new Exception("Email invalido");
			}
			
			VtUsuario Usuario = businessDelegatorView.findByEmail(txtUsuarioEmail.getValue().toString());

			
			if (Usuario==null) {
				throw new Exception("El email no esta registrado");
			}
			
			if (txtUsuarioPassword.getValue().toString().trim()==null  || txtUsuarioPassword.getValue().toString().trim()=="") {
				throw new Exception("Debe ingresar una contraseña");
			}
			
			if (Usuario.getClave().equals(txtUsuarioPassword.getValue().toString().trim())) {
				System.out.println("entra a registrar");
				
				return "/XHTML/vtRegistro.xhtml";
			}else {
				throw new Exception("Contraseña incorrecta");
			}
			
		} catch (Exception e) {
			System.out.println("fallo");
			FacesUtils.addErrorMessage(e.getMessage());
		
		}

		return "";
	}

	


	

}
