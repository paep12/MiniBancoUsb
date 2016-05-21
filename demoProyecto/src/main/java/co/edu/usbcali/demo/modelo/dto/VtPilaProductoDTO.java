package co.edu.usbcali.demo.modelo.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

import java.sql.*;

import java.util.Date;


/**
*
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public class VtPilaProductoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(VtPilaProductoDTO.class);
    private String activo;
    private String descripcion;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String nombre;
    private Long pilaCodigo;
    private Long usuCreador;
    private Long usuModificador;
    private Long proyCodigo_VtProyecto;

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getPilaCodigo() {
        return pilaCodigo;
    }

    public void setPilaCodigo(Long pilaCodigo) {
        this.pilaCodigo = pilaCodigo;
    }

    public Long getUsuCreador() {
        return usuCreador;
    }

    public void setUsuCreador(Long usuCreador) {
        this.usuCreador = usuCreador;
    }

    public Long getUsuModificador() {
        return usuModificador;
    }

    public void setUsuModificador(Long usuModificador) {
        this.usuModificador = usuModificador;
    }

    public Long getProyCodigo_VtProyecto() {
        return proyCodigo_VtProyecto;
    }

    public void setProyCodigo_VtProyecto(Long proyCodigo_VtProyecto) {
        this.proyCodigo_VtProyecto = proyCodigo_VtProyecto;
    }
}
