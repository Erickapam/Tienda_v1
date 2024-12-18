package com.tienda.dao;

import com.tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
//tiene un codigo como librerias, que son metodos para poder crear el CRUD

public interface CategoriaDao extends JpaRepository <Categoria,Long> {
    
}