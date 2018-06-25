/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.dao;

import com.core.farmacia.model.LineaProducto;
import java.util.List;

/**
 *
 * @author nuevo
 */
public interface DAOLineaProducto extends DAOGenerico<LineaProducto, Long>{
    public List<LineaProducto> vw_linea_produc(int lim, int end, String value) throws DAOException;
}
