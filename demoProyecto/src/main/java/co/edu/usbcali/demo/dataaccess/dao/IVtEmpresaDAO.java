package co.edu.usbcali.demo.dataaccess.dao;

import co.edu.usbcali.demo.dataaccess.api.Dao;
import co.edu.usbcali.demo.modelo.VtEmpresa;


/**
* Interface for   VtEmpresaDAO.
*
*/
public interface IVtEmpresaDAO extends Dao<VtEmpresa, Long> {
	
	public Long getConsecutivo();
}
