/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.mysql;

import com.core.farmacia.dao.DAODepartamento;
import com.core.farmacia.dao.DAOException;
import com.core.farmacia.model.Departamento;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author nuevo
 */
public class DepartamentoMysqlDaoImpl implements DAODepartamento{

    Connection conn;

    public DepartamentoMysqlDaoImpl(Connection conn) {
        this.conn = conn;
    }    
    
    @Override
    public void ingresar(Departamento o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Departamento o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Departamento o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Departamento> getAll() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Departamento getOne(Long o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
