/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.dao;

/**
 *
 * @author nuevo
 */
public interface DAOManager {
    
    DAOCompra comprar();
    DAORegistroCompra registrarCompra();
    DAORegistroVenta registrarVenta();
    DAOVenta crearVenta();
    DAOProducto crearProducto();
    DAOCliente crearCliente();
    DAOProveedor crearProveedor();
    DAOLaboratorio crearLaboratorio();
    DAOPresentacion crearPresentacion();
    DAOGenero crearGenero();
    DAOMunicipio crearMunicipio();
    DAODepartamento crearDepartamento();
    DAOLineaProducto crearLineaProducto();
    DAOPaginacionBs crearPaginacion();
    DAOCompra_bs crearCompraBs();
}
