/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.mysql;

import com.core.farmacia.dao.DAOException;
import com.core.farmacia.dao.DAOManager;
import com.core.farmacia.dao.DAOProducto;
import com.core.farmacia.model.BusquedaCombo;
import com.core.farmacia.model.Laboratorio;
import com.core.farmacia.model.LineaProducto;
import com.core.farmacia.model.Presentacion;
import com.core.farmacia.model.Producto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nuevo
 */
public class ProductoMysqlDaoImpl implements DAOProducto {

    private String INSERT = "INSERT INTO linea_producto(nombre) VALUES(?)";
    private String DELETE = "DELETE FROM linea_producto WHERE id = ?";
    private String UPDATE = "UPDATE linea_producto SET nombre = ? WHERE id = ?";
    private String GETALL = "SELECT id, nombre FROM linea_producto";
    private String GETPAGINATION = "{call ObtenDatosPaginados(?,?)}";
    private String GETSEARCHITEM = "{call buscar(?)}";
    private String GETONE = "{call buscarUno(?)}";
    private String GETSEARCH = "{call bs(?)}";

    Connection conn;
    DAOManager manager;

    public ProductoMysqlDaoImpl(Connection conn, DAOManager manager) {
        this.conn = conn;
        this.manager = manager;
    }

    @Override
    public void ingresar(Producto o) throws DAOException {

    }

    @Override
    public void actualizar(Producto o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Producto o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> getAll() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto getOne(Long o) throws DAOException {
        Producto product = null;
        CallableStatement stact = null;
        ResultSet rs = null;

        try {
            stact = conn.prepareCall(GETONE);
            stact.setLong(1, o);
            stact.execute();
            rs = stact.getResultSet();

            if (rs.next()) {
                Laboratorio lab = manager.crearLaboratorio().getOne(rs.getLong("id_labotatorio"));
                Presentacion tipo = manager.crearPresentacion().getOne(rs.getLong("id_presentacion"));
                LineaProducto lineaProducto = manager.crearLineaProducto().getOne(rs.getLong("id_linea_producto"));
                product = new Producto(rs.getLong("id"), rs.getString("nombre_producto"), rs.getInt("cantidad"),
                        rs.getDouble("iva"), rs.getDouble("precio_uds_venta"), rs.getDouble("margen_de_ganancia"), tipo, lab,
                        rs.getString("invima"), lineaProducto);
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
        return product;
    }

    @Override
    public List<Producto> getPaginacion(int ini, int max) throws DAOException {
        List<Producto> list = new ArrayList<>();
        CallableStatement stact = null;
        ResultSet rs = null;

        try {
            stact = conn.prepareCall(GETPAGINATION);
            stact.setInt(1, ini);
            stact.setInt(2, max);
            stact.execute();
            rs = stact.getResultSet();

            while (rs.next()) {
                Laboratorio lab = manager.crearLaboratorio().getOne(rs.getLong("id_labotatorio"));
                Presentacion tipo = manager.crearPresentacion().getOne(rs.getLong("id_presentacion"));
                LineaProducto lineaProducto = manager.crearLineaProducto().getOne(rs.getLong("id_linea_producto"));
                Producto producto = new Producto(rs.getLong("id"), rs.getString("nombre_producto"), rs.getInt("cantidad"),
                        rs.getDouble("iva"), rs.getDouble("precio_uds_venta"), rs.getDouble("margen_de_ganancia"), tipo, lab,
                        rs.getString("invima"), lineaProducto);
                producto.setNroPaginas(rs.getInt("TotalPaginas"));
                producto.setNroRegistros(rs.getInt("TotalRegistros"));
                list.add(producto);
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
    public List<BusquedaCombo> getBusquedaProducto(String nom) throws DAOException {
        List<BusquedaCombo> list = new ArrayList<>();
        CallableStatement stact = null;
        ResultSet rs = null;

        try {
            stact = conn.prepareCall(GETSEARCHITEM);
            stact.setString(1, nom);
            stact.execute();
            rs = stact.getResultSet();

            while (rs.next()) {

                list.add(new BusquedaCombo(rs.getLong("id"), rs.getString("nombre_producto")));
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
    public List<Producto> getBusqueda(String nom) throws DAOException {
        List<Producto> list = new ArrayList<>();
        CallableStatement stact = null;
        ResultSet rs = null;

        try {
            stact = conn.prepareCall(GETSEARCH);
            stact.setString(1, nom);
            stact.execute();
            rs = stact.getResultSet();

            while (rs.next()) {
                Laboratorio lab = manager.crearLaboratorio().getOne(rs.getLong("id_labotatorio"));
                Presentacion tipo = manager.crearPresentacion().getOne(rs.getLong("id_presentacion"));
                LineaProducto lineaProducto = manager.crearLineaProducto().getOne(rs.getLong("id_linea_producto"));
                Producto producto = new Producto(rs.getLong("id"), rs.getString("nombre_producto"), rs.getInt("cantidad"),
                        rs.getDouble("iva"), rs.getDouble("precio_uds_venta"), rs.getDouble("margen_de_ganancia"), tipo, lab,
                        rs.getString("invima"), lineaProducto);
                list.add(producto);
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

}
