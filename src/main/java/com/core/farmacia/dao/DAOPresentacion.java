/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.dao;

import com.core.farmacia.model.Presentacion;
import java.util.List;

/**
 *
 * @author nuevo
 */
public interface DAOPresentacion extends DAOGenerico<Presentacion, Integer>{
    public List<Presentacion> vw_presentacion(int ini, int lim, String value) throws DAOException;;
}
