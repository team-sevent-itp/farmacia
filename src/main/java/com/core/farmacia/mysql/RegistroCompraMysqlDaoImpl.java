/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.mysql;

import com.core.farmacia.dao.DAOException;
import com.core.farmacia.dao.DAOManager;
import com.core.farmacia.dao.DAORegistroCompra;
import com.core.farmacia.model.RegistroCompra;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author nuevo
 */
public class RegistroCompraMysqlDaoImpl implements DAORegistroCompra{
    
    Connection conn;
    DAOManager manager;

    public RegistroCompraMysqlDaoImpl(Connection conn, DAOManager manager) {
        this.conn = conn;
        this.manager = manager;
    }    
    
    
    @Override
    public void ingresar(RegistroCompra o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(RegistroCompra o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(RegistroCompra o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<RegistroCompra> getAll() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RegistroCompra getOne(Long o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
