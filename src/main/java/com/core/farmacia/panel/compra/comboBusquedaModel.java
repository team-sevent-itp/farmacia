
package com.core.farmacia.panel.compra;

import com.core.farmacia.dao.DAOException;
import com.core.farmacia.dao.DAOPaginacionBs;
import com.core.farmacia.model.Ent_paginacion_bs;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class comboBusquedaModel extends DefaultComboBoxModel<Ent_paginacion_bs>{
    
    private DAOPaginacionBs comboBusqueda=null;
    private List<Ent_paginacion_bs> list;

    public comboBusquedaModel(DAOPaginacionBs comboBusqueda) {
        this.comboBusqueda = comboBusqueda;
        this.list = new ArrayList<>();
    }

    public void update(int ini, int fin, String value) throws DAOException{
        if(comboBusqueda != null){
            list = comboBusqueda.paginacion_producto(ini, fin, value);
            removeAllElements();
            list.stream().forEach(ob->{
                addElement(ob);
            });
        }
    }
    
 
    
    
}
