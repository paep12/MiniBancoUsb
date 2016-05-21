package co.edu.usbcali.demo.presentation.backingBeans;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
public class VtEmpresaVista implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private VtEmpresa vtEmpresa;
	
	private List<VtEmpresa> lasEmpresas;

	private final static Logger log = LoggerFactory.getLogger(VtEmpresaVista.class);

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

	
	public CommandButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(CommandButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}


	//  crear empresa y  primerUsuario
	public  String crearAction(){

		try {

			vtEmpresa = new VtEmpresa();


			vtEmpresa.setNombre(txtEmpresaNombre.getValue().toString().trim());
			vtEmpresa.setIdentificacion(txtEmpresaIdentificacion.getValue().toString().trim());
			vtEmpresa.setActivo("S");
			vtEmpresa.setFechaCreacion(new Date());
			vtEmpresa.setFechaModificacion(new Date());
			vtEmpresa.setUsuCreador(0L);
			vtEmpresa.setUsuModificador(0L);



			businessDelegatorView.saveVtEmpresa(vtEmpresa);


			lasEmpresas.add(vtEmpresa);

			FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYSAVED);


//			return "/XHTML/vtLogin.xhtml";


		} catch (Exception e) {

		
			
			FacesMessage mensaje=new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "");
			FacesContext.getCurrentInstance().addMessage("", mensaje);
//			 FacesUtils.addErrorMessage(e.getMessage());
		

		}

		return "";
	}

	public List<VtEmpresa> getLasEmpresas() {
		
		if (lasEmpresas==null) {
		
			try {
				lasEmpresas  = businessDelegatorView.getVtEmpresa();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
		return lasEmpresas;
	}

	public void setLasEmpresas(List<VtEmpresa> lasEmpresas) {
		this.lasEmpresas = lasEmpresas;
	}




}
