package co.edu.usbcali.demo.modelo;
// Generated 26/02/2016 11:17:07 AM by Hibernate Tools 4.3.1.Final


import java.util.Date;

/**
 * VtUsuarioArtefacto generated by hbm2java
 */
public class VtUsuarioArtefacto  implements java.io.Serializable {


     private Long usuartCodigo;
     private VtArtefacto vtArtefacto;
     private VtInteres vtInteres;
     private VtUsuario vtUsuario;
     private Date fechaCreacion;
     private Date fechaModificacion;
     private Long usuCreador;
     private Long usuModificador;
     private String activo;

    public VtUsuarioArtefacto() {
    }

	
    public VtUsuarioArtefacto(Long usuartCodigo, VtArtefacto vtArtefacto, VtInteres vtInteres, VtUsuario vtUsuario, Date fechaCreacion, Long usuCreador, String activo) {
        this.usuartCodigo = usuartCodigo;
        this.vtArtefacto = vtArtefacto;
        this.vtInteres = vtInteres;
        this.vtUsuario = vtUsuario;
        this.fechaCreacion = fechaCreacion;
        this.usuCreador = usuCreador;
        this.activo = activo;
    }
    public VtUsuarioArtefacto(Long usuartCodigo, VtArtefacto vtArtefacto, VtInteres vtInteres, VtUsuario vtUsuario, Date fechaCreacion, Date fechaModificacion, Long usuCreador, Long usuModificador, String activo) {
       this.usuartCodigo = usuartCodigo;
       this.vtArtefacto = vtArtefacto;
       this.vtInteres = vtInteres;
       this.vtUsuario = vtUsuario;
       this.fechaCreacion = fechaCreacion;
       this.fechaModificacion = fechaModificacion;
       this.usuCreador = usuCreador;
       this.usuModificador = usuModificador;
       this.activo = activo;
    }
   
    public Long getUsuartCodigo() {
        return this.usuartCodigo;
    }
    
    public void setUsuartCodigo(Long usuartCodigo) {
        this.usuartCodigo = usuartCodigo;
    }
    public VtArtefacto getVtArtefacto() {
        return this.vtArtefacto;
    }
    
    public void setVtArtefacto(VtArtefacto vtArtefacto) {
        this.vtArtefacto = vtArtefacto;
    }
    public VtInteres getVtInteres() {
        return this.vtInteres;
    }
    
    public void setVtInteres(VtInteres vtInteres) {
        this.vtInteres = vtInteres;
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


