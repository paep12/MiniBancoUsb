package co.edu.usbcali.demo.presentation.backingBeans;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.component.inputtext.InputText;
import org.primefaces.component.selectonemenu.SelectOneMenu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.edu.usbcali.demo.exceptions.ZMessManager;
import co.edu.usbcali.demo.modelo.VtEmpresa;
import co.edu.usbcali.demo.modelo.VtUsuario;
import co.edu.usbcali.demo.presentation.businessDelegate.IBusinessDelegatorView;
import co.edu.usbcali.demo.utilities.FacesUtils;



@ManagedBean
@ViewScoped
public class VtUsuarioVista implements Serializable{

	
	private VtUsuario  vtUsuario ;
	private List<VtUsuario> losUsuarios;
	private final static Logger log = LoggerFactory.getLogger(VtUsuarioVista.class);

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
	private InputText txtUsuarioPasswordCon;
	private InputText txtUsuarioNombre;

	
	

	private CommandButton btnGuardar;

	private SelectOneMenu somEmpresas;
	private List<SelectItem> lasEmpresasItems;


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

	

		try {

			System.out.println("try");
			vtUsuario = new VtUsuario();


			vtUsuario.setActivo("S");
			

			FacesUtils facesUtils=  new FacesUtils();
			

			vtUsuario.setFechaCreacion(new Date());
			vtUsuario.setFechaModificacion(new  Date());
			vtUsuario.setLogin(txtUsuarioEmail.getValue().toString());
			vtUsuario.setNombre(txtUsuarioNombre.getValue().toString().trim());
			
	
			
			if (txtUsuarioPassword.getValue().toString().equals(txtUsuarioPasswordCon.getValue().toString())) {
				vtUsuario.setClave(txtUsuarioPassword.getValue().toString());
			}
			
			
			vtUsuario.setUsuCreador(0L);
			vtUsuario.setUsuModificador(0L);

			if (somEmpresas.getValue().toString().trim()!="-1") {
			
				Long codigoEmpresa =Long.parseLong(somEmpresas.getValue().toString().trim());
				VtEmpresa empresa = businessDelegatorView.getVtEmpresa(codigoEmpresa);
				vtUsuario.setVtEmpresa(empresa);
			}
			

			businessDelegatorView.saveVtUsuario(vtUsuario);


			losUsuarios.add(vtUsuario);
			FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYSAVED);



		} catch (Exception e) {
		
			FacesMessage mensaje=new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "");
			FacesContext.getCurrentInstance().addMessage("", mensaje);
		}

		return "";
	}


	public SelectOneMenu getSomEmpresas() {
		return somEmpresas;
	}

	public void setSomEmpresas(SelectOneMenu somEmpresas) {
		this.somEmpresas = somEmpresas;
	}

	public List<SelectItem> getLasEmpresasItems() {
		
		
		if (lasEmpresasItems==null) {
			
			lasEmpresasItems = new ArrayList<SelectItem>();
			
			try {
				
				List<VtEmpresa> empresas = businessDelegatorView.getVtEmpresa();
				
				for (VtEmpresa vtEmpresa : empresas) {
					lasEmpresasItems.add(new SelectItem(vtEmpresa.getEmprCodigo(),vtEmpresa.getNombre()));
					
					
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
		return lasEmpresasItems;
	}

	public void setLasEmpresasItems(List<SelectItem> lasEmpresasItems) {
		this.lasEmpresasItems = lasEmpresasItems;
	}

	public List<VtUsuario> getLosUsuarios() {
		
		if (losUsuarios==null) {
		
			try {
				
				losUsuarios = businessDelegatorView.getVtUsuario();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return losUsuarios;
	}

	public void setLosUsuarios(List<VtUsuario> losUsuarios) {
		this.losUsuarios = losUsuarios;
	}


	

}
