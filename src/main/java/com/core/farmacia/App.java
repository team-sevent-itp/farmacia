package com.core.farmacia;

import com.core.farmacia.dao.DAOException;
import com.core.farmacia.dao.DAOManager;
import com.core.farmacia.mysql.ManagerDaoImpl;
import java.sql.SQLException;

/**
 *
 * @author cracker
 */
public class App {

    public static void main(String[] args) {
        
        try {
            DAOManager manager = new ManagerDaoImpl("192.168.1.10", "farmacia_popular_d", "kelium", "123456789");
        } catch (SQLException ex) {
            new DAOException("Error al iniciar la conexion", ex);
        }        

    }

}
