
package com.core.farmacia.dao;

import com.core.farmacia.model.BusquedaCombo;
import com.core.farmacia.model.Producto;
import java.util.List;


public interface DAOProducto extends DAOGenerico<Producto,Long>{
    public List<Producto> getPaginacion(int ini, int max) throws DAOException;
    public List<BusquedaCombo> getBusquedaProducto(String nom) throws DAOException;
    public List<Producto> getBusqueda(String nom) throws DAOException;
}
