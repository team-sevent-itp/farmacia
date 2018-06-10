/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.mysql;

import com.core.farmacia.dao.DAOException;
import com.core.farmacia.dao.DAOLineaProducto;
import com.core.farmacia.model.LineaProducto;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author nuevo
 */
public class LineaProductoMysqlDaoImpl implements DAOLineaProducto{
    
    private String INSERT = "INSERT INTO linea_producto(nombre) VALUES(?)";
    private String DELETE = "DELETE FROM linea_producto WHERE id = ?";
    private String UPDATE = "UPDATE linea_producto SET nombre = ? WHERE id = ?";
    private String GETALL = "SELECT id, nombre FROM linea_producto";
    private String GETONE = "SELECT id, nombre FROM linea_producto WHERE id = ?";    
    
    Connection conn;

    public LineaProductoMysqlDaoImpl(Connection conn) {
        this.conn = conn;
    }
    
    
    
    @Override
    public void ingresar(LineaProducto o) throws DAOException {
        
    }

    @Override
    public void actualizar(LineaProducto o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(LineaProducto o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LineaProducto> getAll() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LineaProducto getOne(Long o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
