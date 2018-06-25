/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.dao;

import com.core.farmacia.model.Ent_reg_comp;
import com.core.farmacia.model.RegistroCompra;
import java.util.List;

/**
 *
 * @author nuevo
 */
public interface DAOCompraProducBs extends DAOGenerico<RegistroCompra, Integer>{
    List<Ent_reg_comp> vw_compra_productos(int ini, int lim, String value);
}
