/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.mysql;

import com.core.farmacia.dao.DAOCompraProducBs;
import com.core.farmacia.dao.DAOException;
import com.core.farmacia.model.Ent_reg_comp;
import com.core.farmacia.model.RegistroCompra;
import com.core.helper.UtiliesLocal;
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
public class EntRegistroCompraImpl implements DAOCompraProducBs {

    private String vw_reg_com = "{call ps_compra_producto(?,?,?)}";
    private String insert = "INSERT INTO compra_producto(compra_id, producto_id, cantidad_uds, precio_uds_compra, sub_total, iva, total, fecha_vencimiento, lote) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
   

    Connection conn;

    public EntRegistroCompraImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Ent_reg_comp> vw_compra_productos(int ini, int lim, String value) {

        List<Ent_reg_comp> list = new ArrayList<>();
        CallableStatement stact = null;
        ResultSet rs = null;
        Ent_reg_comp registroCompra;
        try {
            stact = conn.prepareCall(vw_reg_com);
            stact.setInt(1, ini);
            stact.setInt(2, lim);
            stact.setString(3, value);

            stact.execute();
            rs = stact.getResultSet();

            while (rs.next()) {

                registroCompra = new Ent_reg_comp(rs.getInt("id"), UtiliesLocal.parseLocalDate(rs.getDate("fecha_compra")), UtiliesLocal.parseLocalTime(rs.getTime("hora_compra")),
                        rs.getString("nombre_proveedor"), rs.getString("nombre_producto"),
                        rs.getDouble("cantidad"), rs.getDouble("precio"), rs.getDouble("sub_total"),
                        rs.getDouble("iva"), rs.getDouble("total"), UtiliesLocal.parseLocalDate(rs.getDate("fecha_vencimiento")), rs.getString("lote"), rs.getString("factura"));

                list.add(registroCompra);
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
    public void ingresar(RegistroCompra o) throws DAOException {
        PreparedStatement stact = null;
        ResultSet autoGenerated = null;
        try {
            stact = conn.prepareStatement(insert);
            stact.setInt(1, o.getIdCompra());
            stact.setInt(2, o.getIdProducto());
            stact.setDouble(3, o.getCantidadUnidades());
            stact.setDouble(4, o.getPrecioUnidades());
            stact.setDouble(5, o.getSubTotal());
            stact.setDouble(6, o.getIva());
            stact.setDouble(7, o.getTotal());
            stact.setDate(8, UtiliesLocal.parseDate(o.getFechaVencimiento()));
            stact.setString(9, o.getLote());
            
            
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
    public RegistroCompra getOne(Integer o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
