/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.panel.compra;

import com.core.farmacia.dao.DAOCompraProducBs;
import com.core.farmacia.dao.DAOException;
import com.core.farmacia.model.Ent_paginacion_bs;
import com.core.farmacia.model.Ent_reg_comp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nuevo
 */
public class PageTableModel extends AbstractTableModel {

    int contador = 0;
    DAOCompraProducBs page = null;
    List<Ent_reg_comp> listAN = new ArrayList<>();

    public PageTableModel(DAOCompraProducBs page) {
        this.page = page;
    }

    public void update(int ini, int fin, String value) throws DAOException {
        listAN = page.vw_compra_productos(ini, fin, value);
    }

    @Override

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Producto";
            case 1:
                return "Proveedor";
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
        Ent_reg_comp pagination = listAN.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return pagination.getNombreProducto();
            case 1:
                return pagination.getNombreProveedor();
            case 2:
                return pagination.getIva();
            default:
                return "";
        }
    }

}
