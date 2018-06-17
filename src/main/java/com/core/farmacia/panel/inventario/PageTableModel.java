/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.panel.inventario;

import com.core.farmacia.dao.DAOException;
import com.core.farmacia.dao.DAOPaginacionBs;
import com.core.farmacia.model.Ent_paginacion_bs;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nuevo
 */
public class PageTableModel extends AbstractTableModel {

    DAOPaginacionBs page = null;
    List<Ent_paginacion_bs> listAN = new ArrayList<>();

    public PageTableModel(DAOPaginacionBs page) {
        this.page = page;
    }

    public void update(int ini, int fin, String value) throws DAOException {
        listAN = page.paginacion_producto(ini, fin, value);
    }

    @Override

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nombre";
            case 1:
                return "cantidad";
            case 2:
                return "iva";
            case 3:
                return "precio de venta";
            case 4:
                return "margen de ganancia";
            case 5:
                return "Nombre Presentacion";
            case 6:
                return "Laboratorio";
            case 7:
                return "invima";
            case 8: 
                return "linea";
            default:
                return "NN";
        }
    }

    @Override
    public int getRowCount() {
        return listAN.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ent_paginacion_bs pagination = listAN.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return pagination.getNombre_producto();
            case 1:
                return pagination.getCantidad();
            default:
                return "";
        }
    }

}
