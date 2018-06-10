/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.mysql;

import com.core.farmacia.dao.DAOException;
import com.core.farmacia.dao.DAOLaboratorio;
import com.core.farmacia.dao.DAOManager;
import com.core.farmacia.model.Laboratorio;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author nuevo
 */
public class LaboratorioMysqlDaoImpl implements DAOLaboratorio{

    Connection conn;
    
    public LaboratorioMysqlDaoImpl(Connection conn ){
        this.conn = conn;
    }
    
    @Override
    public void ingresar(Laboratorio o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Laboratorio o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Laboratorio o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Laboratorio> getAll() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Laboratorio getOne(Long o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
