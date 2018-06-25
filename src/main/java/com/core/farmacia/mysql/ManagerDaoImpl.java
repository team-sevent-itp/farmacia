/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.mysql;

import com.core.farmacia.dao.DAOCliente;
import com.core.farmacia.dao.DAOClienteBs;
import com.core.farmacia.dao.DAOCompra;
import com.core.farmacia.dao.DAOCompraProducBs;
import com.core.farmacia.dao.DAOCompra_bs;
import com.core.farmacia.dao.DAODepartamento;
import com.core.farmacia.dao.DAOGenero;
import com.core.farmacia.dao.DAOLaboratorio;
import com.core.farmacia.dao.DAOLineaProducto;
import com.core.farmacia.dao.DAOManager;
import com.core.farmacia.dao.DAOMunicipio;
import com.core.farmacia.dao.DAOPaginacionBs;
import com.core.farmacia.dao.DAOPresentacion;
import com.core.farmacia.dao.DAOProducto;
import com.core.farmacia.dao.DAOProveedorBs;
import com.core.farmacia.dao.DAORegistroCompra;
import com.core.farmacia.dao.DAORegistroVenta;
import com.core.farmacia.dao.DAOVenta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nuevo
 */
public class ManagerDaoImpl implements DAOManager {

    DAOProducto productos = null;
    DAOCompra compras = null;
    DAOProveedorBs proveedores = null;
    DAORegistroCompra registroCompras = null;
    DAOPresentacion presentaciones = null;
    DAOLaboratorio laboratorios = null;
    DAOLineaProducto lineaProductos = null;
    DAODepartamento departamentos = null;
    DAOMunicipio municipios = null;
    DAOPaginacionBs paginacion = null;
    DAOCompra_bs compra_bs = null;
    DAOCompraProducBs reg_comp_bs = null;
    DAOClienteBs cliente_bs;
    
    Connection conn;

    public ManagerDaoImpl(String host, String db, String user, String pass) throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://" + host + "/" + db, user, pass);
    }

    /*@Override
    public DAOCompra comprar() {

        if (compras == null) {
            compras = new CompraMysqlDaoImpl(conn, this);
        }
        return compras;
    }*/
    @Override
    public DAORegistroCompra registrarCompra() {
        if (registroCompras == null) {
            registroCompras = new RegistroCompraMysqlDaoImpl(conn, this);
        }
        return registroCompras;
    }

    @Override
    public DAORegistroVenta registrarVenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOVenta crearVenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOProducto crearProducto() {
        if (productos == null) {
            productos = new ProductoMysqlDaoImpl(conn, this);
        }
        return productos;
    }

    @Override
    public DAOClienteBs creaCliente() {
        if (cliente_bs == null) {
            cliente_bs = new EntClienteDAOImpl(conn);
        }
        return cliente_bs;
    }

    @Override
    public DAOLaboratorio crearLaboratorio() {
        if (laboratorios == null) {
            laboratorios = new LaboratorioMysqlDaoImpl(conn);
        }
        return laboratorios;
    }

    @Override
    public DAOPresentacion crearPresentacion() {
        if (presentaciones == null) {
            presentaciones = new PresentacionMysqlDaoImpl(conn);
        }
        return presentaciones;
    }

    @Override
    public DAOGenero crearGenero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOMunicipio crearMunicipio() {

        if (municipios == null) {
            municipios = new MunicipioMysqlDaoImpl(conn, this);
        }

        return municipios;
    }

    @Override
    public DAODepartamento crearDepartamento() {
        if (departamentos == null) {
            departamentos = new DepartamentoMysqlDaoImpl(conn);
        }
        return departamentos;
    }

    @Override
    public DAOLineaProducto crearLineaProducto() {

        if (lineaProductos == null) {
            lineaProductos = new LineaProductoMysqlDaoImpl(conn);
        }
        return lineaProductos;
    }

    @Override
    public DAOPaginacionBs crearPaginacion() {
        if (paginacion == null) {
            paginacion = new EntPaginacionBusquedaDaoImpl(conn);
        }
        return paginacion;

    }

    @Override
    public DAOCompra_bs crearCompraBs() {
        if (compra_bs == null) {
            compra_bs = new EntCompraBs(conn);
        }
        return compra_bs;
    }

    @Override
    public DAOProveedorBs crearProveedor() {
        if (proveedores == null) {
            proveedores = new EntProveedorDaoImpl(conn);
        }
        return proveedores;
    }

    @Override
    public DAOCompraProducBs crearRegistroCompra() {
        if (reg_comp_bs == null) {
            reg_comp_bs = new EntRegistroCompraImpl(conn);
        }
        return reg_comp_bs;
    }

}
