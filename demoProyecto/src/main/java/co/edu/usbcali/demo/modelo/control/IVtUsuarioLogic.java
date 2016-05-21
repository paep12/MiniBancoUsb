package co.edu.usbcali.demo.modelo.control;

import co.edu.usbcali.demo.modelo.VtUsuario;
import co.edu.usbcali.demo.modelo.dto.VtUsuarioDTO;

import java.math.BigDecimal;

import java.util.*;
import java.util.Date;
import java.util.List;
import java.util.Set;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface IVtUsuarioLogic {
    public List<VtUsuario> getVtUsuario() throws Exception;

    /**
         * Save an new VtUsuario entity
         */
    public void saveVtUsuario(VtUsuario entity) throws Exception;

    /**
         * Delete an existing VtUsuario entity
         *
         */
    public void deleteVtUsuario(VtUsuario entity) throws Exception;

    /**
        * Update an existing VtUsuario entity
        *
        */
    public void updateVtUsuario(VtUsuario entity) throws Exception;

    /**
         * Load an existing VtUsuario entity
         *
         */
    public VtUsuario getVtUsuario(Long usuaCodigo) throws Exception;
    
    public List<VtUsuario> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<VtUsuario> findPageVtUsuario(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberVtUsuario() throws Exception;

    public List<VtUsuarioDTO> getDataVtUsuario() throws Exception;
    	
    
    public VtUsuario findByEmail(String email);
    
}
