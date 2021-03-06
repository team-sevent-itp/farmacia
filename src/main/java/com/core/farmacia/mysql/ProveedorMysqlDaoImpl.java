/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.mysql;
/*
import com.core.farmacia.dao.DAOException;
import com.core.farmacia.dao.DAOManager;
import com.core.farmacia.model.LineaProducto;
import com.core.farmacia.model.Municipio;
import com.core.farmacia.model.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
*/
/**
 *
 * @author nuevo
 */
/*
public class ProveedorMysqlDaoImpl implements DAOProveedor {

    private String INSERT = "INSERT INTO provedor(nombre, telefono1, telefono2, id_municipio) VALUES(?, ?, ?, ?)";
    private String DELETE = "DELETE FROM provedor WHERE id = ?";
    private String UPDATE = "UPDATE provedor SET nombre = ?, telefono1 = ?, telefono2 = ?, id_municipio = ? WHERE id = ?";
    private String GETALL = "SELECT id, nombre, telefono1, telefono2, id_municipio FROM provedor";
    private String GETONE = "SELECT id, nombre, telefono1, telefono2, id_municipio FROM provedor WHERE id = ?";

    Connection conn;
    DAOManager manager;

    public ProveedorMysqlDaoImpl(Connection conn, DAOManager manager) {
        this.conn = conn;
        this.manager = manager;
    }

    @Override
    public void ingresar(Proveedor o) throws DAOException {
        PreparedStatement stact = null;
        ResultSet autoGenerated = null;
        try {
            stact = conn.prepareStatement(INSERT);
            stact.setString(1, o.getNombre());
            stact.setString(2, o.getTelefono1());
            stact.setString(3, o.getTelefono2());
            stact.setLong(4, o.getIdMunicipio().getId());
            
            if (stact.executeUpdate() == 0) {
                new DAOException("Puede que no guarde la transaccion");
            }
            autoGenerated = stact.getGeneratedKeys();
            if (autoGenerated.next()) {
                o.setId(autoGenerated.getLong(1));
            } else {
                throw new DAOException("Error");
            }

        } catch (SQLException ex) {
            new DAOException("Se produjo algun error al relaizar la transaccion", ex);
        } finally {
            if (stact != null) {
                try {
                    stact.close();
                } catch (SQLException ex) {
                    new DAOException("Error al cerrar el PreparedStatemetn", ex);
                }
            }
        }
    }

    @Override
    public void actualizar(Proveedor o) throws DAOException {
        PreparedStatement stact = null;

        try {
            stact = conn.prepareStatement(UPDATE);
            stact.setString(1, o.getNombre());
            stact.setString(2, o.getTelefono1());
            stact.setString(3, o.getTelefono2());
            stact.setLong(4, o.getIdMunicipio().getId());          
            stact.setLong(5, o.getId());
            if (stact.executeUpdate() == 0) {
                new DAOException("Error al subir datos");
            }
        } catch (SQLException ex) {
            new DAOException("Error al actualizar", ex);
        } finally {
            if (stact != null) {
                try {
                    stact.close();
                } catch (SQLException ex) {
                    new DAOException("Error al cerrar");
                }
            }
        }
    }

    @Override
    public void eliminar(Proveedor o) throws DAOException {
        PreparedStatement stact = null;
        
        try {
            stact = conn.prepareStatement(DELETE);
            stact.setLong(1, o.getId());

            if (stact.executeUpdate() == 0) {
                new DAOException("Error al enviar query");
            }

        } catch (SQLException ex) {
            new DAOException("Error al eliminar");
        } finally {
            if (stact != null) {
                try {
                    stact.close();
                } catch (SQLException ex) {
                    new DAOException("Error al cerra stact");
                }
            }
        }
    }

    @Override
    public List<Proveedor> getAll() throws DAOException {
          List<Proveedor> lista = new ArrayList<>();
        PreparedStatement stact = null;
        ResultSet rs = null;

        try {
            stact = conn.prepareStatement(GETALL);
            rs = stact.executeQuery();

            while (rs.next()) {
                Municipio muni = manager.crearMunicipio().getOne(rs.getLong("id_municipio"));
                lista.add(new Proveedor(rs.getLong("id"), rs.getString("nombre"), rs.getString("telefono1"), rs.getString("telefono2"), muni));
            }

        } catch (SQLException ex) {
            new DAOException("Error al llamar Datos", ex);
        } finally {
            if (stact != null) {
                try {
                    stact.close();
                } catch (SQLException ex) {
                    new DAOException("Error al cerrar estact");
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    new DAOException("Error al cerrar rs", ex);
                }
            }
        }
        return lista;
    }

    @Override
    public Proveedor getOne(Long o) throws DAOException {
        Proveedor proveedor = null;
        PreparedStatement stact = null;
        ResultSet rs = null;

        try {
            stact = conn.prepareStatement(GETONE);
            stact.setLong(1, o);
            rs = stact.executeQuery();
            if (rs.next()) {
                
                Municipio muni = manager.crearMunicipio().getOne(o);
                proveedor = new Proveedor(rs.getLong("id"), rs.getString("nombre"), rs.getString("telefono1"), rs.getString("telefono2"), muni);
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

        return proveedor;
    }

}*/
