package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data //clase de datos//
@Entity //base de datos (Workbench)
@Table(name="producto")// hay una tabla que se llama producto
//que sirve para mapear y traerse los datos

public class Producto implements Serializable {
  //almacenar o transmitir datos*(seralizable) //modificar objetos 
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //identidifique valor de la llave primaria, ese ID sea el mismo y se autoincremente//
    @Column(name="id_producto")// referencia al primary key
    private Long idProducto; //llave primaria
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    private String detalle;
    private double precio;
    private int existencias;
    //private Long idCategoria;-> reemplazar con el ManyToOne
    
    @ManyToOne
    @JoinColumn(name="id_categoria")
    Categoria categoria;
    

    public Producto() {
    }

    public Producto(String producto, boolean activo) {
        this.descripcion = producto;
        this.activo = activo;
        
        //instancia//
    }
}
