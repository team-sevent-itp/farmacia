/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.dao;

import com.core.farmacia.model.Ent_paginacion_bs;
import java.util.List;

/**
 *
 * @author nuevo
 */
public interface DAOPaginacionBs extends DAOGenerico<Ent_paginacion_bs, Integer>{
    public List<Ent_paginacion_bs> paginacion_producto(int limite_ini, int limite_superior, String value) throws DAOException;
    public int cantidadRegistros();

}
