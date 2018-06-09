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
public interface DAOGenerico<T, K> {

    void create() throws DAOException;

    T readOne(K id) throws DAOException;

    void update(T Objeto) throws DAOException;
    
    void delete(K id) throws DAOException;
    
    List<T> readAll() throws DAOException;
    
}
