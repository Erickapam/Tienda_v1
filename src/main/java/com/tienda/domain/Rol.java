
package com.tienda.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data //clase de datos//
@Entity //base de datos (Workbench)
@Table(name="rol")
public class Rol implements Serializable {

 private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //identidifique valor de la llave primaria, ese ID sea el mismo y se autoincremente//
    @Column(name="id_rol")// referencia al primary key    
    
    private Long idRol;
    private String nombre;
     @Column(name="id_rol")
    private Long idUsuario;
}
