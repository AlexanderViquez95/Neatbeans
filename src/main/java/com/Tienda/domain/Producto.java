
package com.Tienda.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="producto")
    public class Producto implements Serializable {
    
    //version de serializacion
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idProducto; 
    private Long idCategoria;
    private String descripcion;
    private String detalle;
    private String rutaImagen;
    private double precio;
    private int existencias;
    private boolean activo;

    public Producto() {
    }

    public Producto(Long idProducto, Long idCategoria, String descripcion, String detalle, String rutaImagen, double precio, int existencias, boolean activo) {
   
    }  

    public Producto(Long idCategoria, String descripcion, String detalle, String rutaImagen, double precio, int existencias, boolean activo) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.rutaImagen = rutaImagen;
        this.precio = precio;
        this.existencias = existencias;
        this.activo = activo;
    }
    
    @ManyToOne
    @JoinColumn(name="id_categoria")
    private Categoria categoria;
   
    
}


