package co.edu.usbcali.demo.modelo;
// Generated 26/02/2016 11:17:07 AM by Hibernate Tools 4.3.1.Final


import java.util.Date;

/**
 * VtUsuarioRol generated by hbm2java
 */
public class VtUsuarioRol  implements java.io.Serializable {


     private Long usroCodigo;
     private VtRol vtRol;
     private VtUsuario vtUsuario;
     private Date fechaCreacion;
     private Date fechaModificacion;
     private Long usuCreador;
     private Long usuModificador;
     private String activo;

    public VtUsuarioRol() {
    }

	
    public VtUsuarioRol(Long usroCodigo, VtRol vtRol, VtUsuario vtUsuario, Date fechaCreacion, Long usuCreador, String activo) {
        this.usroCodigo = usroCodigo;
        this.vtRol = vtRol;
        this.vtUsuario = vtUsuario;
        this.fechaCreacion = fechaCreacion;
        this.usuCreador = usuCreador;
        this.activo = activo;
    }
    public VtUsuarioRol(Long usroCodigo, VtRol vtRol, VtUsuario vtUsuario, Date fechaCreacion, Date fechaModificacion, Long usuCreador, Long usuModificador, String activo) {
       this.usroCodigo = usroCodigo;
       this.vtRol = vtRol;
       this.vtUsuario = vtUsuario;
       this.fechaCreacion = fechaCreacion;
       this.fechaModificacion = fechaModificacion;
       this.usuCreador = usuCreador;
       this.usuModificador = usuModificador;
       this.activo = activo;
    }
   
    public Long getUsroCodigo() {
        return this.usroCodigo;
    }
    
    public void setUsroCodigo(Long usroCodigo) {
        this.usroCodigo = usroCodigo;
    }
    public VtRol getVtRol() {
        return this.vtRol;
    }
    
    public void setVtRol(VtRol vtRol) {
        this.vtRol = vtRol;
    }
    public VtUsuario getVtUsuario() {
        return this.vtUsuario;
    }
    
    public void setVtUsuario(VtUsuario vtUsuario) {
        this.vtUsuario = vtUsuario;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    public Long getUsuCreador() {
        return this.usuCreador;
    }
    
    public void setUsuCreador(Long usuCreador) {
        this.usuCreador = usuCreador;
    }
    public Long getUsuModificador() {
        return this.usuModificador;
    }
    
    public void setUsuModificador(Long usuModificador) {
        this.usuModificador = usuModificador;
    }
    public String getActivo() {
        return this.activo;
    }
    
    public void setActivo(String activo) {
        this.activo = activo;
    }




}


