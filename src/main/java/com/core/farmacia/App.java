package com.core.farmacia;

import com.core.farmacia.dao.DAOException;
import com.core.farmacia.dao.DAOManager;
import com.core.farmacia.model.BusquedaCombo;
import com.core.farmacia.model.Ent_compra_bs;
import com.core.farmacia.model.Ent_paginacion_bs;
import com.core.farmacia.model.Ent_reg_comp;
import com.core.farmacia.model.Laboratorio;
import com.core.farmacia.model.LineaProducto;
import com.core.farmacia.model.Presentacion;
import com.core.farmacia.model.Producto;
import com.core.farmacia.mysql.ManagerDaoImpl;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javafx.util.converter.LocalDateStringConverter;
import principal.prinPnl;

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
        List<Producto> productList = new ArrayList<>();

        Laboratorio lab = new Laboratorio();
        Presentacion pre = new Presentacion();
        List<BusquedaCombo> listCombo = new ArrayList<>();
        Producto producto = new Producto();

        List<Producto> p = new ArrayList<>();

        List<Ent_paginacion_bs> list_page = new ArrayList<>();

        try {
            
           //DAOManager manager = new ManagerDaoImpl("localhost:3306", "farmacia_popular", "root", "123456789");
           DAOManager manager = new ManagerDaoImpl("192.168.1.10:3306", "farmacia_popular_d", "kelium", "kelium");
     
            long startTime = System.nanoTime();

            prinPnl principal = new prinPnl(manager);
            principal.setVisible(true);
           /* List<Ent_reg_comp>reg_comp = manager.crearRegistroCompra().vw_compra_productos(0, 10, "B");
            reg_comp.stream().forEach(ob->{
                System.out.println(ob.toString());
            });*/
            
             long endTime = System.nanoTime() - startTime;
            System.out.println(endTime);

        } catch (SQLException ex) {
            new DAOException("Error al iniciar la conexion", ex);
        }

    }

}
