/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.panel.proveedor;

import com.core.farmacia.dao.DAOException;
import com.core.farmacia.dao.DAOProveedorBs;
import com.core.farmacia.model.Ent_proveedor_bs;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author edin-
 */
public class PageTableModelProv extends AbstractTableModel{

    
    DAOProveedorBs page = null;
    List<Ent_proveedor_bs> listAN = new ArrayList<>();

    public PageTableModelProv(DAOProveedorBs page) {
        this.page = page;
    }

    public void update(int ini, int fin, String value) throws DAOException {
        listAN = page.paginacion_proveedor(ini, fin, value);
    }
    
    
     @Override

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nombre";
            case 1:
                return "Telefóno1";
            case 2:
                return "Telefóno2";
            case 3:
                return "Municipio";
            default:
                return "NN";
        }
    }

   
    @Override
    public int getRowCount() {
        return listAN.size();
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ent_proveedor_bs pagination = listAN.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return pagination.getNombre();
            case 1:
                return pagination.getNumero1();
            case 2:
                return pagination.getNumero2();
            case 3:
                return pagination.getId_municipio();
            default:
                return "";
        }
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

  
    
   
    
}
