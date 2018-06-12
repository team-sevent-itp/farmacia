/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.mysql;

import com.core.farmacia.dao.DAOException;
import com.core.farmacia.dao.DAOManager;
import com.core.farmacia.dao.DAOMunicipio;
import com.core.farmacia.model.Departamento;
import com.core.farmacia.model.LineaProducto;
import com.core.farmacia.model.Municipio;
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
public class MunicipioMysqlDaoImpl implements DAOMunicipio {

    private String GETALL = "SELECT id, nombre, id_departamento FROM municipio ORDER BY nombre ASC";
    private String GETONE = "SELECT id, nombre, id_departamento FROM municipio WHERE id = ?";
    private String GETALLWHERE = "SELECT id, nombre, id_departamento FROM municipio WHERE id_departamento = ?";

    Connection conn;
    DAOManager manager;

    public MunicipioMysqlDaoImpl(Connection conn, DAOManager manager) {
        this.conn = conn;
        this.manager = manager;
    }

    @Override
    public void ingresar(Municipio o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Municipio o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Municipio o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Municipio> getAll() throws DAOException {
        List<Municipio> lista = new ArrayList<>();
        PreparedStatement stact = null;
        ResultSet rs = null;

        try {
            stact = conn.prepareStatement(GETALL);
            rs = stact.executeQuery();

            while (rs.next()) {
                Departamento depaTmp = manager.crearDepartamento().getOne(rs.getLong("id_departamento"));
                lista.add(new Municipio(rs.getLong("id"), rs.getString("nombre"), depaTmp));
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
    public Municipio getOne(Long o) throws DAOException {
        Municipio municipio = null;
        PreparedStatement stact = null;
        ResultSet rs = null;

        try {
            stact = conn.prepareStatement(GETONE);
            stact.setLong(1, o);
            rs = stact.executeQuery();
            if (rs.next()) {
                Departamento depar = manager.crearDepartamento().getOne(rs.getLong("id_departamento"));
                municipio = new Municipio(rs.getLong("id"), rs.getString("nombre"), depar);
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
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    new DAOException("Error al cerrar rs", ex);
                }
            }
        }
        return municipio;
    }

    public List<Municipio> getAllWhere(long id_departamento) throws DAOException {
        List<Municipio> lista = new ArrayList<>();
        PreparedStatement stact = null;
        ResultSet rs = null;

        try {
            stact = conn.prepareStatement(GETALL);
            stact.setLong(1, id_departamento);
            rs = stact.executeQuery();

            while (rs.next()) {
                Departamento depar = manager.crearDepartamento().getOne(rs.getLong("id_departamento"));
                lista.add(new Municipio(rs.getLong("id"), rs.getString("nombre"), depar));
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
}
