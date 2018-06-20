/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.dao;

import com.core.farmacia.model.Ent_proveedor_bs;
import java.util.List;

/**
 *
 * @author edin-
 */
public interface DAOProveedorBs extends DAOGenerico<Ent_proveedor_bs, Integer>{
    
      public List<Ent_proveedor_bs> paginacion_proveedor(int limite_ini, int limite_superior, String value) throws DAOException;
    public int cantidadRegistrosProveedor();
    
}
