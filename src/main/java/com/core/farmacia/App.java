package com.core.farmacia;

import com.core.farmacia.dao.DAOException;
import com.core.farmacia.dao.DAOManager;
import com.core.farmacia.model.BusquedaCombo;
import com.core.farmacia.model.Ent_compra_bs;
import com.core.farmacia.model.Ent_paginacion_bs;
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
            //manager.crearLineaProducto().ingresar(tipo);
            //manager.crearLineaProducto().actualizar(tipo);
            //manager.crearLineaProducto().eliminar(tipo);
            //tipo = manager.crearLineaProducto().getOne(1L);
            //System.out.println(tipo.toString());
            /*tipoList = manager.crearLineaProducto().getAll();
            tipoList.stream().forEach(ob -> {
                System.out.println(ob.toString());
            });*/

 /*lab = manager.crearLaboratorio().getOne(2L);
            pre = manager.crearPresentacion().getOne(2L);

            System.out.println(lab.toString());
            System.out.println(pre.toString());

            productList = manager.crearProducto().getPaginacion(20,10);
            productList.stream().forEach(ob -> {
                System.out.println(ob.toString());
            });*/

 /* listCombo = manager.crearProducto().getBusquedaProducto("ZIFLUVIS");
            listCombo.stream().forEach(ob -> {
                System.out.println(ob.toString());
            });
            
            producto = manager.crearProducto().getOne(listCombo.get(0).getId());
            System.out.println(producto.toString());
             */
            long startTime = System.nanoTime();

            prinPnl principal = new prinPnl(manager);
            principal.setVisible(true);
            /*List<Presentacion> present = manager.crearPresentacion().vw_presentacion(0, 10, "");
           present.stream().forEach(ob->{
               System.out.println(ob.toString());
           
           });*/

 /*Ent_compra_bs compra = new Ent_compra_bs();
            compra.setProveedor("1");
            compra.setFactura("111-1");
            manager.crearCompraBs().ingresar(compra);
             */
 /* list_page = manager.crearPaginacion().p    long startTime = System.nanoTime();

            prinPnl principal = new prinPnl(manager);
            principal.setVisible(true);
            
           /* list_page = manager.crearPaginacion().aginacion_producto(0, 10, "ACEITE");
            list_page.stream().forEach(ob -> {
                System.out.println(ob.toString());
            });
             */
 /*  p = manager.crearProducto().getBusqueda("ZIFLUVIS");
            p.stream().forEach(ob -> {
                System.out.println(ob.toString());
            });*/
            //producto = productList.get(0);
            //System.out.println(producto.toString());
            long endTime = System.nanoTime() - startTime;
            System.out.println(endTime);

        } catch (SQLException ex) {
            new DAOException("Error al iniciar la conexion", ex);
        }

    }

}
