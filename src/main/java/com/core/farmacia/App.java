package com.core.farmacia;

import com.core.farmacia.dao.DAOException;
import com.core.farmacia.dao.DAOManager;
import com.core.farmacia.model.LineaProducto;
import com.core.farmacia.mysql.ManagerDaoImpl;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cracker
 */
public class App {

    public static void main(String[] args) throws DAOException {
        
        LineaProducto tipo = new LineaProducto();
        tipo.setId(4);
        tipo.setNombre("jabon--N");
        
        List<LineaProducto> tipoList = new ArrayList<>();
        
        
        try {
            DAOManager manager = new ManagerDaoImpl("192.168.1.10:3306", "farmacia_popular_d", "kelium", "kelium");
            //manager.crearLineaProducto().ingresar(tipo);
            //manager.crearLineaProducto().actualizar(tipo);
            //manager.crearLineaProducto().eliminar(tipo);
            //tipo = manager.crearLineaProducto().getOne(1L);
            //System.out.println(tipo.toString());
            tipoList = manager.crearLineaProducto().getAll();
            tipoList.stream().forEach(ob -> {
                System.out.println(ob.toString());
            });
        } catch (SQLException ex) {
            new DAOException("Error al iniciar la conexion", ex);
        }        

    }

}
