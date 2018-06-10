/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.mysql;

import com.core.farmacia.dao.DAOCliente;
import com.core.farmacia.dao.DAOCompra;
import com.core.farmacia.dao.DAODepartamento;
import com.core.farmacia.dao.DAOGenero;
import com.core.farmacia.dao.DAOLaboratorio;
import com.core.farmacia.dao.DAOLineaProducto;
import com.core.farmacia.dao.DAOManager;
import com.core.farmacia.dao.DAOMunicipio;
import com.core.farmacia.dao.DAOPresentacion;
import com.core.farmacia.dao.DAOProducto;
import com.core.farmacia.dao.DAOProveedor;
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
public class ManagerDaoImpl implements DAOManager{
    
    DAOProducto productos = null;
    DAOCompra compras = null;
    DAOProveedor proveedores = null;
    DAORegistroCompra registroCompras = null;
    DAOPresentacion presentaciones = null;
    DAOLaboratorio laboratorios = null;
    DAOLineaProducto lineaProductos = null;
    DAODepartamento departamentos = null;
    DAOMunicipio municipios = null;
    
    Connection conn;
    
    public ManagerDaoImpl(String host, String db, String user, String pass) throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://" + host + "/" + db, user, pass);
    }    
    
    
    
    @Override
    public DAOCompra comprar() {
        
        if(compras == null){
            compras = new CompraMysqlDaoImpl(conn, this);
        }        
        return compras;        
    }

    @Override
    public DAORegistroCompra registrarCompra() {
        if(registroCompras == null){
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
        if(productos == null){
            productos = new ProductoMysqlDaoImpl(conn, this);
        }
        return productos;
    }

    @Override
    public DAOCliente crearCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOProveedor crearProveedor() {
        if(proveedores == null){
            proveedores = new ProveedorMysqlDaoImpl(conn, this);
        }
        return proveedores;
    }

    @Override
    public DAOLaboratorio crearLaboratorio() {
        if(laboratorios == null){
            laboratorios = new LaboratorioMysqlDaoImpl(conn);
        }
        return laboratorios;
    }

    @Override
    public DAOPresentacion crearPresentacion() {
        if(presentaciones == null){
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
        
        if(municipios == null){
            municipios = new MunicipioMysqlDaoImpl(conn, this);
        }
        
        return municipios;
    }

    @Override
    public DAODepartamento crearDepartamento() {
        if(departamentos == null){
            departamentos = new DepartamentoMysqlDaoImpl(conn);
        }
        return departamentos;
    }

    @Override
    public DAOLineaProducto crearLineaProducto() {
        
        if(lineaProductos == null){
            lineaProductos = new LineaProductoMysqlDaoImpl(conn);
        }        
        return lineaProductos;
    }
    
}