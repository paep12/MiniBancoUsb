package co.edu.usbcali.demo.presentation.backingBeans;


import java.io.Serializable;
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
public class VtRegistroVista implements Serializable{

	private VtEmpresa vtEmpresa;
	private VtUsuario  vtUsuario ;

	private final static Logger log = LoggerFactory.getLogger(VtRegistroVista.class);

	@ManagedProperty(value="#{BusinessDelegatorView}")
	private IBusinessDelegatorView businessDelegatorView;


	public IBusinessDelegatorView getBusinessDelegatorView() {
		return businessDelegatorView;
	}

	public void setBusinessDelegatorView(IBusinessDelegatorView businessDelegatorView) {
		this.businessDelegatorView = businessDelegatorView;
	}


	private InputText txtEmpresaNombre;
	private InputText txtEmpresaIdentificacion;
	private InputText txtUsuarioEmail;
	private InputText txtUsuarioPassword;
	private InputText txtUsuarioPasswordCon;
	private InputText txtUsuarioNombre;

	private CommandButton btnGuardar;




	public InputText getTxtEmpresaNombre() {
		return txtEmpresaNombre;
	}

	public void setTxtEmpresaNombre(InputText txtEmpresaNombre) {
		this.txtEmpresaNombre = txtEmpresaNombre;
	}

	public InputText getTxtEmpresaIdentificacion() {
		return txtEmpresaIdentificacion;
	}

	public void setTxtEmpresaIdentificacion(InputText txtEmpresaIdentificacion) {
		this.txtEmpresaIdentificacion = txtEmpresaIdentificacion;
	}

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

	public InputText getTxtUsuarioPasswordCon() {
		return txtUsuarioPasswordCon;
	}

	public void setTxtUsuarioPasswordCon(InputText txtUsuarioPasswordCon) {
		this.txtUsuarioPasswordCon = txtUsuarioPasswordCon;
	}

	public InputText getTxtUsuarioNombre() {
		log.info("holo");
		return txtUsuarioNombre;
	}

	public void setTxtUsuarioNombre(InputText txtUsuarioNombre) {
		this.txtUsuarioNombre = txtUsuarioNombre;
	}

	public CommandButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(CommandButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}


	//  crear empresa y  primerUsuario
	public  String crearAction(){

		System.out.println("crear D:");

		try {


			vtEmpresa = new VtEmpresa();


			//			vtEmpresa.setNombre(FacesUtils.checkString(txtEmpresaNombre));
			//			vtEmpresa.setIdentificacion(FacesUtils.checkString(txtEmpresaIdentificacion));

			vtEmpresa.setNombre(txtEmpresaNombre.getValue().toString().trim());
			vtEmpresa.setIdentificacion(txtEmpresaIdentificacion.getValue().toString().trim());
			vtEmpresa.setActivo("S");
			vtEmpresa.setFechaCreacion(new Date());
			vtEmpresa.setFechaModificacion(new Date());
			vtEmpresa.setUsuCreador(0L);
			vtEmpresa.setUsuModificador(0L);



			vtUsuario = new VtUsuario();


			vtUsuario.setActivo("S");
			if (FacesUtils.checkString(txtUsuarioPassword).trim().equals(FacesUtils.checkString(txtUsuarioPasswordCon).trim())) {
				vtUsuario.setClave(FacesUtils.checkString(txtUsuarioPassword).trim());
			}else {
				throw new Exception();
			}

			vtUsuario.setFechaCreacion(new Date());
			vtUsuario.setFechaModificacion(new  Date());
			vtUsuario.setLogin(FacesUtils.checkString(txtUsuarioEmail).trim());
			vtUsuario.setNombre(FacesUtils.checkString(txtUsuarioNombre).trim());
			vtUsuario.setUsuCreador(0L);
			vtUsuario.setUsuModificador(0L);

			vtUsuario.setVtEmpresa(vtEmpresa);


			VtUsuario Usuario = businessDelegatorView.findByEmail(txtUsuarioEmail.getValue().toString());

			FacesUtils facesUtils=  new FacesUtils();
			if (!facesUtils.checkEmail(vtUsuario.getLogin())) {
				throw new Exception("Email invalido");
			}
			if (Usuario!=null) {
				throw new Exception("El email esta en uso");
			}

			businessDelegatorView.saveVtEmpresa(vtEmpresa);



//			businessDelegatorView.saveVtUsuario(vtUsuario);



			FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYSAVED);


			return "/XHTML/vtLogin.xhtml";


		} catch (Exception e) {

			vtUsuario =null;
			vtEmpresa = null;
			
			FacesMessage mensaje=new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "");
			FacesContext.getCurrentInstance().addMessage("", mensaje);
//			 FacesUtils.addErrorMessage(e.getMessage());
		

		}

		return "";
	}


	public String ingresarAction(){

		return "/login.xhtml";
	}

}
