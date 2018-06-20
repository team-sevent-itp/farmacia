/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.dao;

import com.core.farmacia.model.Laboratorio;
import java.util.List;

/**
 *
 * @author nuevo
 */
public interface DAOLaboratorio extends DAOGenerico<Laboratorio, Integer> {

    public List<Laboratorio> vw_laboratorio(int ini, int lim, String value)throws DAOException;;

}
