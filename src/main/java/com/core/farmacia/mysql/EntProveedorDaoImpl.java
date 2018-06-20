
package com.core.farmacia.mysql;

import com.core.farmacia.dao.DAOException;
import com.core.farmacia.dao.DAOProveedorBs;
import com.core.farmacia.model.Ent_proveedor_bs;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author desconocido
 */
public class EntProveedorDaoImpl  implements DAOProveedorBs{

     private String GETSEARCH = "{call ps_proveedor_bs(?, ?, ?)}";
    private String NPAGES = "SELECT FOUND_ROWS() AS cnt";
    
    
    Connection conn;

    public EntProveedorDaoImpl(Connection conn) {
        this.conn = conn;
    }
    
    
      @Override
    public void ingresar(Ent_proveedor_bs o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Ent_proveedor_bs o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Ent_proveedor_bs o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ent_proveedor_bs> getAll() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ent_proveedor_bs getOne(Integer o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public List<Ent_proveedor_bs> paginacion_proveedor(int limite_ini, int limite_superior, String value) throws DAOException {
        
        List<Ent_proveedor_bs> list = new ArrayList<>();
        CallableStatement stact = null;
        ResultSet rs = null;

        try {
            stact = conn.prepareCall(GETSEARCH);
            stact.setInt(1, limite_ini);
            stact.setInt(2, limite_superior);
            stact.setString(3, value);

            stact.execute();
            rs = stact.getResultSet();

            
            while (rs.next()) {
                Ent_proveedor_bs paginacionOb= new Ent_proveedor_bs(rs.getInt("id"), 
                       rs.getString("nombre") , rs.getString("telefono1"), rs.getString("telefono2"),
                        rs.getString("municipio"));
               
                list.add(paginacionOb);
            }

        } catch (SQLException ex) {
            new DAOException("Error al llamar el procedimiento", ex);

        } finally {
            if (stact != null) {
                try {
                    stact.close();
                } catch (SQLException ex) {
                    new DAOException("Error al cerrar stact", ex);
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    new DAOException("Error al cerrar stact", ex);
                }
            }

        }

        return list;
    }

    @Override
    public int cantidadRegistrosProveedor() {
        int nPages = 0;
        PreparedStatement stact = null;
        ResultSet rs = null;

        try {
            stact = conn.prepareStatement(NPAGES);            
            rs = stact.executeQuery();
            if (rs.next()) {
                nPages = rs.getInt("cnt");
            }

        } catch (SQLException ex) {
            new DAOException("Error al traer el elemento", ex);
        } finally {
            if (stact != null) {
                try {
                    stact.close();
                } catch (SQLException ex) {
                    new DAOException("Error al cerrar el stact");
                }
            }
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException ex) {
                    new DAOException("Error al cerrar rs", ex);
                }
            }
        }

        return nPages;
    }

  

  
  
    
    
}
