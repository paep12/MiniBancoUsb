package co.edu.usbcali.demo.modelo.control;

import co.edu.usbcali.demo.modelo.VtArtefacto;
import co.edu.usbcali.demo.modelo.dto.VtArtefactoDTO;

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
public interface IVtArtefactoLogic {
    public List<VtArtefacto> getVtArtefacto() throws Exception;

    /**
         * Save an new VtArtefacto entity
         */
    public void saveVtArtefacto(VtArtefacto entity) throws Exception;

    /**
         * Delete an existing VtArtefacto entity
         *
         */
    public void deleteVtArtefacto(VtArtefacto entity) throws Exception;

    /**
        * Update an existing VtArtefacto entity
        *
        */
    public void updateVtArtefacto(VtArtefacto entity) throws Exception;

    /**
         * Load an existing VtArtefacto entity
         *
         */
    public VtArtefacto getVtArtefacto(Long arteCodigo)
        throws Exception;

    public List<VtArtefacto> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<VtArtefacto> findPageVtArtefacto(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberVtArtefacto() throws Exception;

    public List<VtArtefactoDTO> getDataVtArtefacto() throws Exception;
}
