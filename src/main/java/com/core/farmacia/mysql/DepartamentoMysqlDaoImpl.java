/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.mysql;

import com.core.farmacia.dao.DAODepartamento;
import com.core.farmacia.dao.DAOException;
import com.core.farmacia.model.Departamento;
import com.core.farmacia.model.LineaProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nuevo
 */
public class DepartamentoMysqlDaoImpl implements DAODepartamento {

    
    private String GETALL = "SELECT id, nombre FROM departamento ORDER BY nombre ASC";
    private String GETONE = "SELECT id, nombre FROM departamento WHERE id = ?";

    Connection conn;

    public DepartamentoMysqlDaoImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void ingresar(Departamento o) throws DAOException {
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
          List<Departamento> lista = new ArrayList<>();
        PreparedStatement stact = null;
        ResultSet rs = null;

        try {
            stact = conn.prepareStatement(GETALL);
            rs = stact.executeQuery();

            while (rs.next()) {
                lista.add(new Departamento(rs.getLong("id"), rs.getString("nombre")));
            }

        } catch (SQLException ex) {
            new DAOException("Error al llamar Datos", ex);
        } finally {
            if (stact != null) {
                try {
                    stact.close();
                } catch (SQLException ex) {
                    new DAOException("Error al cerrar estact");
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    new DAOException("Error al cerrar rs", ex);
                }
            }
        }
        return lista;
    }

    @Override
    public Departamento getOne(Long o) throws DAOException {
        Departamento departamento = null;
        PreparedStatement stact = null;
        ResultSet rs = null;

        try {
            stact = conn.prepareStatement(GETONE);
            stact.setLong(1, o);
            rs = stact.executeQuery();
            if (rs.next()) {
                departamento = new Departamento(rs.getLong("id"), rs.getString("nombre"));
            }

        } catch (SQLException ex) {
            new DAOException("Error al traer el elemento", ex);
        } finally {
            if (stact != null) {
                try {
                    stact.close();
                } catch (SQLException ex) {
                    new DAOException("Error al cerrar el stact");
                }
            }
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException ex) {
                    new DAOException("Error al cerrar rs", ex);
                }
            }
        }

        return departamento;
    }

}
