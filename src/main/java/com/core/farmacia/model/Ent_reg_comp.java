/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.model;

import java.time.LocalDate;

/**
 *
 * @author nuevo
 */
public class Ent_reg_comp {

    private long id;
    private Compra idCompra;
    private Producto idProducto;
    private double cantidadUnidades;
    private double precioUnidades;
    private double subTotal;
    private double iva;
    private double total;
    private LocalDate fechaVencimiento;
    private String lote;
}
