package co.edu.usbcali.demo.dataaccess.dao;

import co.edu.usbcali.demo.dataaccess.api.Dao;
import co.edu.usbcali.demo.modelo.VtUsuario;


/**
* Interface for   VtUsuarioDAO.
*
*/
public interface IVtUsuarioDAO extends Dao<VtUsuario, Long> {
	
	public Long getConsecutivo();
	
	public VtUsuario findByEmail(String email);
}
