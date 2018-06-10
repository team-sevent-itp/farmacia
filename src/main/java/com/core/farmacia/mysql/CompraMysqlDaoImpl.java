/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.mysql;

import com.core.farmacia.dao.DAOCompra;
import com.core.farmacia.dao.DAOException;
import com.core.farmacia.dao.DAOManager;
import com.core.farmacia.model.Compra;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author nuevo
 */
public class CompraMysqlDaoImpl implements DAOCompra{

    Connection conn;
    DAOManager manager;
    
    public CompraMysqlDaoImpl(Connection conn, DAOManager manager) {
        this.conn = conn;
        this.manager = manager;
    }
    
    @Override
    public void ingresar(Compra o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Compra o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Compra o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Compra> getAll() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Compra getOne(Long o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
