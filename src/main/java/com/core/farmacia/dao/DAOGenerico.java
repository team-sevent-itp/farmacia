/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.dao;

import java.util.List;

/**
 *
 * @author nuevo
 */
public interface DAOGenerico<T,K> {

    void ingresar(T o) throws DAOException;
    
    void actualizar(T o) throws DAOException;
    
    void eliminar(T o) throws DAOException;
    
    List<T> getAll() throws DAOException; 
    
    T getOne(K o) throws DAOException;
    
}
