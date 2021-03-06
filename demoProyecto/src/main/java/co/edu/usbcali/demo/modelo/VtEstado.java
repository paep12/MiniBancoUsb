package co.edu.usbcali.demo.modelo;
// Generated 26/02/2016 11:17:07 AM by Hibernate Tools 4.3.1.Final


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * VtEstado generated by hbm2java
 */
public class VtEstado  implements java.io.Serializable {


     private Long estaCodigo;
     private String nombre;
     private Date fechaCreacion;
     private Date fechaModificacion;
     private Long usuCreador;
     private Long usuModificador;
     private String activo;
     private Set<VtArtefacto> vtArtefactos = new HashSet<VtArtefacto>(0);

    public VtEstado() {
    }

	
    public VtEstado(Long estaCodigo, String nombre, Date fechaCreacion, Long usuCreador, String activo) {
        this.estaCodigo = estaCodigo;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.usuCreador = usuCreador;
        this.activo = activo;
    }
    public VtEstado(Long estaCodigo, String nombre, Date fechaCreacion, Date fechaModificacion, Long usuCreador, Long usuModificador, String activo, Set<VtArtefacto> vtArtefactos) {
       this.estaCodigo = estaCodigo;
       this.nombre = nombre;
       this.fechaCreacion = fechaCreacion;
       this.fechaModificacion = fechaModificacion;
       this.usuCreador = usuCreador;
       this.usuModificador = usuModificador;
       this.activo = activo;
       this.vtArtefactos = vtArtefactos;
    }
   
    public Long getEstaCodigo() {
        return this.estaCodigo;
    }
    
    public void setEstaCodigo(Long estaCodigo) {
        this.estaCodigo = estaCodigo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public Set<VtArtefacto> getVtArtefactos() {
        return this.vtArtefactos;
    }
    
    public void setVtArtefactos(Set<VtArtefacto> vtArtefactos) {
        this.vtArtefactos = vtArtefactos;
    }




}


