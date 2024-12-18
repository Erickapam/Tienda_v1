package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data //clase de datos//
@Entity //base de datos (Workbench)
@Table(name="categoria")// hay una tabla que se llama categoria
//que sirve para mapear y traerse los datos

public class Categoria implements Serializable {
  //almacenar o transmitir datos*(seralizable) //modificar objetos 
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //identidifique valor de la llave primaria, ese ID sea el mismo y se autoincremente//
    @Column(name="id_categoria")// referencia al primary key
    private Long idCategoria; //llave primaria
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
    @OneToMany
    @JoinColumn(name="id_categoria", updatable = false)
    List<Producto> productos;

    public Categoria() {
    }

    public Categoria(String categoria, boolean activo) {
        this.descripcion = categoria;
        this.activo = activo;
        
        //instancia//
    }
}
