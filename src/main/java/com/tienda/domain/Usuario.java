/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data //clase de datos//
@Entity //base de datos (Workbench)
@Table(name="usuario")
public class Usuario implements Serializable{
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //identidifique valor de la llave primaria, ese ID sea el mismo y se autoincremente//
    @Column(name="id_usuario")// referencia al primary key
    private Long idUsuario; 
    private String username;
    private String password; 
    private String nombre; 
    private String apellidos; 
    private String correo; 
    private String telefono; 
    private String rutaImagen;
    private boolean activo;
    
    @OneToMany
    @JoinColumn (name= "id_usuario")
    List<Rol>roles;
    }