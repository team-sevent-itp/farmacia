/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.mysql;

import com.core.farmacia.dao.DAOCompraProducBs;
import com.core.farmacia.dao.DAOException;
import com.core.farmacia.model.Ent_reg_comp;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nuevo
 */
public class EntRegistroCompraImpl implements DAOCompraProducBs {

    private String vw_reg_com = "{call ps_compra_producto(?,?,?)}";

    AttributeConverter fechaConvert;
    AttributeConverter horaConvert;

    Connection conn;

    public EntRegistroCompraImpl(Connection conn) {
        this.conn = conn;
        fechaConvert = new LocalDatePersistenceConverter();
        horaConvert = new LocalTimePersistenceConverter();
    }

    @Override
    public List<Ent_reg_comp> vw_compra_productos(int ini, int lim, String value) {

        List<Ent_reg_comp> list = new ArrayList<>();
        CallableStatement stact = null;
        ResultSet rs = null;

        try {
            stact = conn.prepareCall(vw_reg_com);
            stact.setInt(1, ini);
            stact.setInt(2, lim);
            stact.setString(3, value);

            stact.execute();
            rs = stact.getResultSet();

            while (rs.next()) {
                LocalDate fechaVen = (LocalDate) fechaConvert.convertToEntityAttribute(rs.getDate("fecha_vencimiento"));
                LocalDate fechaComp = (LocalDate) fechaConvert.convertToEntityAttribute(rs.getDate("fecha_compra"));
                LocalTime horaComp = (LocalTime) horaConvert.convertToEntityAttribute(rs.getTime("hora_compra"));
                
                Ent_reg_comp registroCompra = new Ent_reg_comp(rs.getInt("id"), fechaComp, horaComp,
                        rs.getString("nombre_proveedor"), rs.getString("nombre_producto"), 
                        rs.getDouble("cantidad"), rs.getDouble("precio"), rs.getDouble("sub_total"),
                        rs.getDouble("iva"), rs.getDouble("total"), fechaVen, rs.getString("lote"),rs.getString("factura"));
                
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
    public void ingresar(Ent_reg_comp o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Ent_reg_comp o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Ent_reg_comp o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ent_reg_comp> getAll() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ent_reg_comp getOne(Integer o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
