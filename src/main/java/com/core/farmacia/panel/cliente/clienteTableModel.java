/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.panel.cliente;

import com.core.farmacia.dao.DAOClienteBs;
import com.core.farmacia.dao.DAOException;
import com.core.farmacia.model.Ent_cliente_bs;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author edin-
 */
public class clienteTableModel extends AbstractTableModel{

    
    
     DAOClienteBs page = null;
    List<Ent_cliente_bs> listAN = new ArrayList<>();

    public clienteTableModel(DAOClienteBs page) {
        this.page = page;
    }

    public void update(int ini, int fin, String value) throws DAOException {
        listAN = page.paginacion_clinte(ini, fin, value);
    }
     @Override

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nombres";
            case 1:
                return "Apellidos";
            case 2:
                return "Sexo";
            case 3:
                return "Telefóno1";
            case 4:
                return "Telefóno2";
            case 5:
                return "municipio";
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
       return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      Ent_cliente_bs pagination = listAN.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return pagination.getNombres();
            case 1:
                return pagination.getApellidos();
           
            case 2:
                return pagination.getSexo();
            case 3:
                return pagination.getTelefono1();
            case 4:
                return pagination.getTelefono2();
            case 5:
                return pagination.getMunicipio();
            default:
                return "";
        }
    }
    
    
    
}
