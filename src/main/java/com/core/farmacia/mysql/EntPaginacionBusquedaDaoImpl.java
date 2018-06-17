/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.mysql;

import com.core.farmacia.dao.DAOException;
import com.core.farmacia.dao.DAOPaginacionBs;
import com.core.farmacia.model.Ent_paginacion_bs;
import java.sql.CallableStatement;
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
public class EntPaginacionBusquedaDaoImpl implements DAOPaginacionBs {

    private String GETSEARCH = "{call ps_paginacion_bs(?, ?, ?)}";
    private String NPAGES = "SELECT FOUND_ROWS() AS cnt";
    
    
    Connection conn;

    public EntPaginacionBusquedaDaoImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void ingresar(Ent_paginacion_bs o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Ent_paginacion_bs o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Ent_paginacion_bs o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ent_paginacion_bs> getAll() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ent_paginacion_bs getOne(Integer o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ent_paginacion_bs> paginacion_producto(int limite_ini, int limite_superior, String value) throws DAOException {

        List<Ent_paginacion_bs> list = new ArrayList<>();
        CallableStatement stact = null;
        ResultSet rs = null;

        try {
            stact = conn.prepareCall(GETSEARCH);
            stact.setInt(1, limite_ini);
            stact.setInt(2, limite_superior);
            stact.setString(3, value);

            stact.execute();
            rs = stact.getResultSet();

            
            while (rs.next()) {
                Ent_paginacion_bs paginacionOb= new Ent_paginacion_bs(rs.getInt("id"), 
                       rs.getString("nombre_producto") , rs.getInt("cantidad"), rs.getDouble("iva"),
                        rs.getDouble("precio_uds_venta"), rs.getDouble("margen_de_ganancia"),
                        rs.getString("NombrePresentacion"), rs.getString("Laboratorio"), rs.getString("invima"), rs.getString("Linea"));
               
                list.add(paginacionOb);
            }

        } catch (SQLException ex) {
            new DAOException("Error al llamar el procedimiento", ex);

        } finally {
            if (stact != null) {
                try {
                    stact.close();
                } catch (SQLException ex) {
                    new DAOException("Error al cerrar stact", ex);
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    new DAOException("Error al cerrar stact", ex);
                }
            }

        }

        return list;
    }

    @Override
    public int cantidadRegistros() {
        int nPages = 0;
        PreparedStatement stact = null;
        ResultSet rs = null;

        try {
            stact = conn.prepareStatement(NPAGES);            
            rs = stact.executeQuery();
            if (rs.next()) {
                nPages = rs.getInt("cnt");
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

        return nPages;
    }

}
