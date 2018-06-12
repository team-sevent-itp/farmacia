
package com.core.farmacia.dao;

import com.core.farmacia.model.Producto;
import java.util.List;


public interface DAOProducto extends DAOGenerico<Producto,Long>{
    public List<Producto> getPaginacion(int ini, int max) throws DAOException;
}
