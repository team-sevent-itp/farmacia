/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.mysql;

import com.core.farmacia.dao.DAOCompra_bs;
import com.core.farmacia.dao.DAOException;
import com.core.farmacia.model.Ent_compra_bs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author nuevo
 */
public class EntCompraBs implements DAOCompra_bs {

    private String INSERT = "INSERT INTO compra(id_proveedor, nro_factura, fecha, hora) VALUES(?,?,current_date(), current_time())";

    Connection conn;

    public EntCompraBs(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void ingresar(Ent_compra_bs o) throws DAOException {
        PreparedStatement stact = null;
        ResultSet autoGenerated = null;
        try {
            stact = conn.prepareStatement(INSERT);
            stact.setInt(1, Integer.parseInt(o.getProveedor()));
            stact.setString(2, o.getFactura());
            if (stact.executeUpdate() == 0) {
                new DAOException("Puede que no guarde la transaccion");
            }
            autoGenerated = stact.getGeneratedKeys();
            if (autoGenerated.next()) {
                o.setId(autoGenerated.getInt(1));
            } else {
                throw new DAOException("Error");
            }

        } catch (SQLException ex) {
            new DAOException("Se produjo algun error al relaizar la transaccion", ex);
        } finally {
            if (stact != null) {
                try {
                    stact.close();
                } catch (SQLException ex) {
                    new DAOException("Error al cerrar el PreparedStatemetn", ex);
                }
            }
        }

    }

    @Override
    public void actualizar(Ent_compra_bs o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Ent_compra_bs o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ent_compra_bs> getAll() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ent_compra_bs getOne(Integer o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
