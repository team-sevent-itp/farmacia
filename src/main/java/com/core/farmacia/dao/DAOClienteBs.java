
package com.core.farmacia.dao;

import com.core.farmacia.model.Ent_cliente_bs;
import java.util.List;

/**
 *
 * @author desconocido
 */
public interface DAOClienteBs extends DAOGenerico<Ent_cliente_bs, Integer>{
      public List<Ent_cliente_bs> paginacion_clinte(int limite_ini, int limite_superior, String value) throws DAOException;
    public int cantidadRegistrosCliente();
    
}
