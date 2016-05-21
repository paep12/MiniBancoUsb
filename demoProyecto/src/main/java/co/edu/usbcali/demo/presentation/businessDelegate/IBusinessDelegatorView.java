package co.edu.usbcali.demo.presentation.businessDelegate;

import co.edu.usbcali.demo.modelo.VtArchivo;
import co.edu.usbcali.demo.modelo.VtArtefacto;
import co.edu.usbcali.demo.modelo.VtEmpresa;
import co.edu.usbcali.demo.modelo.VtEstado;
import co.edu.usbcali.demo.modelo.VtHistoriaArtefacto;
import co.edu.usbcali.demo.modelo.VtInteres;
import co.edu.usbcali.demo.modelo.VtPilaProducto;
import co.edu.usbcali.demo.modelo.VtPrioridad;
import co.edu.usbcali.demo.modelo.VtProyecto;
import co.edu.usbcali.demo.modelo.VtProyectoUsuario;
import co.edu.usbcali.demo.modelo.VtRol;
import co.edu.usbcali.demo.modelo.VtSprint;
import co.edu.usbcali.demo.modelo.VtTipoArtefacto;
import co.edu.usbcali.demo.modelo.VtUsuario;
import co.edu.usbcali.demo.modelo.VtUsuarioArtefacto;
import co.edu.usbcali.demo.modelo.VtUsuarioRol;
import co.edu.usbcali.demo.modelo.control.IVtArchivoLogic;
import co.edu.usbcali.demo.modelo.control.IVtArtefactoLogic;
import co.edu.usbcali.demo.modelo.control.IVtEmpresaLogic;
import co.edu.usbcali.demo.modelo.control.IVtEstadoLogic;
import co.edu.usbcali.demo.modelo.control.IVtHistoriaArtefactoLogic;
import co.edu.usbcali.demo.modelo.control.IVtInteresLogic;
import co.edu.usbcali.demo.modelo.control.IVtPilaProductoLogic;
import co.edu.usbcali.demo.modelo.control.IVtPrioridadLogic;
import co.edu.usbcali.demo.modelo.control.IVtProyectoLogic;
import co.edu.usbcali.demo.modelo.control.IVtProyectoUsuarioLogic;
import co.edu.usbcali.demo.modelo.control.IVtRolLogic;
import co.edu.usbcali.demo.modelo.control.IVtSprintLogic;
import co.edu.usbcali.demo.modelo.control.IVtTipoArtefactoLogic;
import co.edu.usbcali.demo.modelo.control.IVtUsuarioArtefactoLogic;
import co.edu.usbcali.demo.modelo.control.IVtUsuarioLogic;
import co.edu.usbcali.demo.modelo.control.IVtUsuarioRolLogic;
import co.edu.usbcali.demo.modelo.control.VtArchivoLogic;
import co.edu.usbcali.demo.modelo.control.VtArtefactoLogic;
import co.edu.usbcali.demo.modelo.control.VtEmpresaLogic;
import co.edu.usbcali.demo.modelo.control.VtEstadoLogic;
import co.edu.usbcali.demo.modelo.control.VtHistoriaArtefactoLogic;
import co.edu.usbcali.demo.modelo.control.VtInteresLogic;
import co.edu.usbcali.demo.modelo.control.VtPilaProductoLogic;
import co.edu.usbcali.demo.modelo.control.VtPrioridadLogic;
import co.edu.usbcali.demo.modelo.control.VtProyectoLogic;
import co.edu.usbcali.demo.modelo.control.VtProyectoUsuarioLogic;
import co.edu.usbcali.demo.modelo.control.VtRolLogic;
import co.edu.usbcali.demo.modelo.control.VtSprintLogic;
import co.edu.usbcali.demo.modelo.control.VtTipoArtefactoLogic;
import co.edu.usbcali.demo.modelo.control.VtUsuarioArtefactoLogic;
import co.edu.usbcali.demo.modelo.control.VtUsuarioLogic;
import co.edu.usbcali.demo.modelo.control.VtUsuarioRolLogic;
import co.edu.usbcali.demo.modelo.dto.VtArchivoDTO;
import co.edu.usbcali.demo.modelo.dto.VtArtefactoDTO;
import co.edu.usbcali.demo.modelo.dto.VtEmpresaDTO;
import co.edu.usbcali.demo.modelo.dto.VtEstadoDTO;
import co.edu.usbcali.demo.modelo.dto.VtHistoriaArtefactoDTO;
import co.edu.usbcali.demo.modelo.dto.VtInteresDTO;
import co.edu.usbcali.demo.modelo.dto.VtPilaProductoDTO;
import co.edu.usbcali.demo.modelo.dto.VtPrioridadDTO;
import co.edu.usbcali.demo.modelo.dto.VtProyectoDTO;
import co.edu.usbcali.demo.modelo.dto.VtProyectoUsuarioDTO;
import co.edu.usbcali.demo.modelo.dto.VtRolDTO;
import co.edu.usbcali.demo.modelo.dto.VtSprintDTO;
import co.edu.usbcali.demo.modelo.dto.VtTipoArtefactoDTO;
import co.edu.usbcali.demo.modelo.dto.VtUsuarioArtefactoDTO;
import co.edu.usbcali.demo.modelo.dto.VtUsuarioDTO;
import co.edu.usbcali.demo.modelo.dto.VtUsuarioRolDTO;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import java.util.Set;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface IBusinessDelegatorView {
    public List<VtArchivo> getVtArchivo() throws Exception;

    public void saveVtArchivo(VtArchivo entity) throws Exception;

    public void deleteVtArchivo(VtArchivo entity) throws Exception;

    public void updateVtArchivo(VtArchivo entity) throws Exception;

    public VtArchivo getVtArchivo(Long archCodigo) throws Exception;

    public List<VtArchivo> findByCriteriaInVtArchivo(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<VtArchivo> findPageVtArchivo(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberVtArchivo() throws Exception;

    public List<VtArchivoDTO> getDataVtArchivo() throws Exception;

    public List<VtArtefacto> getVtArtefacto() throws Exception;

    public void saveVtArtefacto(VtArtefacto entity) throws Exception;

    public void deleteVtArtefacto(VtArtefacto entity) throws Exception;

    public void updateVtArtefacto(VtArtefacto entity) throws Exception;

    public VtArtefacto getVtArtefacto(Long arteCodigo)
        throws Exception;

    public List<VtArtefacto> findByCriteriaInVtArtefacto(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<VtArtefacto> findPageVtArtefacto(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberVtArtefacto() throws Exception;

    public List<VtArtefactoDTO> getDataVtArtefacto() throws Exception;

    public List<VtEmpresa> getVtEmpresa() throws Exception;

    public void saveVtEmpresa(VtEmpresa entity) throws Exception;

    public void deleteVtEmpresa(VtEmpresa entity) throws Exception;

    public void updateVtEmpresa(VtEmpresa entity) throws Exception;

    public VtEmpresa getVtEmpresa(Long emprCodigo) throws Exception;

    public List<VtEmpresa> findByCriteriaInVtEmpresa(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<VtEmpresa> findPageVtEmpresa(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberVtEmpresa() throws Exception;

    public List<VtEmpresaDTO> getDataVtEmpresa() throws Exception;

    public List<VtEstado> getVtEstado() throws Exception;

    public void saveVtEstado(VtEstado entity) throws Exception;

    public void deleteVtEstado(VtEstado entity) throws Exception;

    public void updateVtEstado(VtEstado entity) throws Exception;

    public VtEstado getVtEstado(Long estaCodigo) throws Exception;

    public List<VtEstado> findByCriteriaInVtEstado(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<VtEstado> findPageVtEstado(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberVtEstado() throws Exception;

    public List<VtEstadoDTO> getDataVtEstado() throws Exception;

    public List<VtHistoriaArtefacto> getVtHistoriaArtefacto()
        throws Exception;

    public void saveVtHistoriaArtefacto(VtHistoriaArtefacto entity)
        throws Exception;

    public void deleteVtHistoriaArtefacto(VtHistoriaArtefacto entity)
        throws Exception;

    public void updateVtHistoriaArtefacto(VtHistoriaArtefacto entity)
        throws Exception;

    public VtHistoriaArtefacto getVtHistoriaArtefacto(Long historiaCodigo)
        throws Exception;

    public List<VtHistoriaArtefacto> findByCriteriaInVtHistoriaArtefacto(
        Object[] variables, Object[] variablesBetween,
        Object[] variablesBetweenDates) throws Exception;

    public List<VtHistoriaArtefacto> findPageVtHistoriaArtefacto(
        String sortColumnName, boolean sortAscending, int startRow,
        int maxResults) throws Exception;

    public Long findTotalNumberVtHistoriaArtefacto() throws Exception;

    public List<VtHistoriaArtefactoDTO> getDataVtHistoriaArtefacto()
        throws Exception;

    public List<VtInteres> getVtInteres() throws Exception;

    public void saveVtInteres(VtInteres entity) throws Exception;

    public void deleteVtInteres(VtInteres entity) throws Exception;

    public void updateVtInteres(VtInteres entity) throws Exception;

    public VtInteres getVtInteres(Long inteCodigo) throws Exception;

    public List<VtInteres> findByCriteriaInVtInteres(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<VtInteres> findPageVtInteres(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberVtInteres() throws Exception;

    public List<VtInteresDTO> getDataVtInteres() throws Exception;

    public List<VtPilaProducto> getVtPilaProducto() throws Exception;

    public void saveVtPilaProducto(VtPilaProducto entity)
        throws Exception;

    public void deleteVtPilaProducto(VtPilaProducto entity)
        throws Exception;

    public void updateVtPilaProducto(VtPilaProducto entity)
        throws Exception;

    public VtPilaProducto getVtPilaProducto(Long pilaCodigo)
        throws Exception;

    public List<VtPilaProducto> findByCriteriaInVtPilaProducto(
        Object[] variables, Object[] variablesBetween,
        Object[] variablesBetweenDates) throws Exception;

    public List<VtPilaProducto> findPageVtPilaProducto(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberVtPilaProducto() throws Exception;

    public List<VtPilaProductoDTO> getDataVtPilaProducto()
        throws Exception;

    public List<VtPrioridad> getVtPrioridad() throws Exception;

    public void saveVtPrioridad(VtPrioridad entity) throws Exception;

    public void deleteVtPrioridad(VtPrioridad entity) throws Exception;

    public void updateVtPrioridad(VtPrioridad entity) throws Exception;

    public VtPrioridad getVtPrioridad(Long prioCodigo)
        throws Exception;

    public List<VtPrioridad> findByCriteriaInVtPrioridad(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<VtPrioridad> findPageVtPrioridad(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberVtPrioridad() throws Exception;

    public List<VtPrioridadDTO> getDataVtPrioridad() throws Exception;

    public List<VtProyecto> getVtProyecto() throws Exception;

    public void saveVtProyecto(VtProyecto entity) throws Exception;

    public void deleteVtProyecto(VtProyecto entity) throws Exception;

    public void updateVtProyecto(VtProyecto entity) throws Exception;

    public VtProyecto getVtProyecto(Long proyCodigo) throws Exception;

    public List<VtProyecto> findByCriteriaInVtProyecto(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<VtProyecto> findPageVtProyecto(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberVtProyecto() throws Exception;

    public List<VtProyectoDTO> getDataVtProyecto() throws Exception;

    public List<VtProyectoUsuario> getVtProyectoUsuario()
        throws Exception;

    public void saveVtProyectoUsuario(VtProyectoUsuario entity)
        throws Exception;

    public void deleteVtProyectoUsuario(VtProyectoUsuario entity)
        throws Exception;

    public void updateVtProyectoUsuario(VtProyectoUsuario entity)
        throws Exception;

    public VtProyectoUsuario getVtProyectoUsuario(Long prusCodigo)
        throws Exception;

    public List<VtProyectoUsuario> findByCriteriaInVtProyectoUsuario(
        Object[] variables, Object[] variablesBetween,
        Object[] variablesBetweenDates) throws Exception;

    public List<VtProyectoUsuario> findPageVtProyectoUsuario(
        String sortColumnName, boolean sortAscending, int startRow,
        int maxResults) throws Exception;

    public Long findTotalNumberVtProyectoUsuario() throws Exception;

    public List<VtProyectoUsuarioDTO> getDataVtProyectoUsuario()
        throws Exception;

    public List<VtRol> getVtRol() throws Exception;

    public void saveVtRol(VtRol entity) throws Exception;

    public void deleteVtRol(VtRol entity) throws Exception;

    public void updateVtRol(VtRol entity) throws Exception;

    public VtRol getVtRol(Long rolCodigo) throws Exception;

    public List<VtRol> findByCriteriaInVtRol(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<VtRol> findPageVtRol(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberVtRol() throws Exception;

    public List<VtRolDTO> getDataVtRol() throws Exception;

    public List<VtSprint> getVtSprint() throws Exception;

    public void saveVtSprint(VtSprint entity) throws Exception;

    public void deleteVtSprint(VtSprint entity) throws Exception;

    public void updateVtSprint(VtSprint entity) throws Exception;

    public VtSprint getVtSprint(Long spriCodigo) throws Exception;

    public List<VtSprint> findByCriteriaInVtSprint(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<VtSprint> findPageVtSprint(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberVtSprint() throws Exception;

    public List<VtSprintDTO> getDataVtSprint() throws Exception;

    public List<VtTipoArtefacto> getVtTipoArtefacto() throws Exception;

    public void saveVtTipoArtefacto(VtTipoArtefacto entity)
        throws Exception;

    public void deleteVtTipoArtefacto(VtTipoArtefacto entity)
        throws Exception;

    public void updateVtTipoArtefacto(VtTipoArtefacto entity)
        throws Exception;

    public VtTipoArtefacto getVtTipoArtefacto(Long tparCodigo)
        throws Exception;

    public List<VtTipoArtefacto> findByCriteriaInVtTipoArtefacto(
        Object[] variables, Object[] variablesBetween,
        Object[] variablesBetweenDates) throws Exception;

    public List<VtTipoArtefacto> findPageVtTipoArtefacto(
        String sortColumnName, boolean sortAscending, int startRow,
        int maxResults) throws Exception;

    public Long findTotalNumberVtTipoArtefacto() throws Exception;

    public List<VtTipoArtefactoDTO> getDataVtTipoArtefacto()
        throws Exception;

    public List<VtUsuario> getVtUsuario() throws Exception;

    public void saveVtUsuario(VtUsuario entity) throws Exception;

    public void deleteVtUsuario(VtUsuario entity) throws Exception;

    public void updateVtUsuario(VtUsuario entity) throws Exception;

    public VtUsuario getVtUsuario(Long usuaCodigo) throws Exception;

    public List<VtUsuario> findByCriteriaInVtUsuario(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<VtUsuario> findPageVtUsuario(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberVtUsuario() throws Exception;

    public List<VtUsuarioDTO> getDataVtUsuario() throws Exception;

    public List<VtUsuarioArtefacto> getVtUsuarioArtefacto()
        throws Exception;

    public void saveVtUsuarioArtefacto(VtUsuarioArtefacto entity)
        throws Exception;

    public void deleteVtUsuarioArtefacto(VtUsuarioArtefacto entity)
        throws Exception;

    public void updateVtUsuarioArtefacto(VtUsuarioArtefacto entity)
        throws Exception;

    public VtUsuarioArtefacto getVtUsuarioArtefacto(Long usuartCodigo)
        throws Exception;

    public List<VtUsuarioArtefacto> findByCriteriaInVtUsuarioArtefacto(
        Object[] variables, Object[] variablesBetween,
        Object[] variablesBetweenDates) throws Exception;

    public List<VtUsuarioArtefacto> findPageVtUsuarioArtefacto(
        String sortColumnName, boolean sortAscending, int startRow,
        int maxResults) throws Exception;

    public Long findTotalNumberVtUsuarioArtefacto() throws Exception;

    public List<VtUsuarioArtefactoDTO> getDataVtUsuarioArtefacto()
        throws Exception;

    public List<VtUsuarioRol> getVtUsuarioRol() throws Exception;

    public void saveVtUsuarioRol(VtUsuarioRol entity) throws Exception;

    public void deleteVtUsuarioRol(VtUsuarioRol entity)
        throws Exception;

    public void updateVtUsuarioRol(VtUsuarioRol entity)
        throws Exception;

    public VtUsuarioRol getVtUsuarioRol(Long usroCodigo)
        throws Exception;

    public List<VtUsuarioRol> findByCriteriaInVtUsuarioRol(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<VtUsuarioRol> findPageVtUsuarioRol(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberVtUsuarioRol() throws Exception;

    public List<VtUsuarioRolDTO> getDataVtUsuarioRol()
        throws Exception;
    
    
    
    
    public VtUsuario findByEmail(String email);

    
}
