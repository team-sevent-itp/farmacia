/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.model;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author nuevo
 */

/*Esta clase es para operaciones basicas de insertado*/
public class RegistroCompra {

    private int id;
    private int idCompra;
    private int idProducto;
    private double cantidadUnidades;
    private double precioUnidades;
    private double subTotal;
    private double iva;
    private double total;
    private LocalDate fechaVencimiento;
    private String lote;

    public RegistroCompra(int idCompra, int idProducto, double cantidadUnidades, double precioUnidades, double subTotal, double iva, double total, LocalDate fechaVencimiento, String lote) {
        this.idCompra = idCompra;
        this.idProducto = idProducto;
        this.cantidadUnidades = cantidadUnidades;
        this.precioUnidades = precioUnidades;
        this.subTotal = subTotal;
        this.iva = iva;
        this.total = total;
        this.fechaVencimiento = fechaVencimiento;
        this.lote = lote;
    }

    public RegistroCompra() {
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.id;
        hash = 59 * hash + this.idCompra;
        hash = 59 * hash + this.idProducto;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.cantidadUnidades) ^ (Double.doubleToLongBits(this.cantidadUnidades) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.precioUnidades) ^ (Double.doubleToLongBits(this.precioUnidades) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.subTotal) ^ (Double.doubleToLongBits(this.subTotal) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.iva) ^ (Double.doubleToLongBits(this.iva) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.total) ^ (Double.doubleToLongBits(this.total) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.fechaVencimiento);
        hash = 59 * hash + Objects.hashCode(this.lote);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RegistroCompra other = (RegistroCompra) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idCompra != other.idCompra) {
            return false;
        }
        if (this.idProducto != other.idProducto) {
            return false;
        }
        if (Double.doubleToLongBits(this.cantidadUnidades) != Double.doubleToLongBits(other.cantidadUnidades)) {
            return false;
        }
        if (Double.doubleToLongBits(this.precioUnidades) != Double.doubleToLongBits(other.precioUnidades)) {
            return false;
        }
        if (Double.doubleToLongBits(this.subTotal) != Double.doubleToLongBits(other.subTotal)) {
            return false;
        }
        if (Double.doubleToLongBits(this.iva) != Double.doubleToLongBits(other.iva)) {
            return false;
        }
        if (Double.doubleToLongBits(this.total) != Double.doubleToLongBits(other.total)) {
            return false;
        }
        if (!Objects.equals(this.lote, other.lote)) {
            return false;
        }
        if (!Objects.equals(this.fechaVencimiento, other.fechaVencimiento)) {
            return false;
        }
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public double getCantidadUnidades() {
        return cantidadUnidades;
    }

    public void setCantidadUnidades(double cantidadUnidades) {
        this.cantidadUnidades = cantidadUnidades;
    }

    public double getPrecioUnidades() {
        return precioUnidades;
    }

    public void setPrecioUnidades(double precioUnidades) {
        this.precioUnidades = precioUnidades;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "RegistroCompra{" + "id=" + id + ", idCompra=" + idCompra + ", idProducto=" + idProducto
                + ", cantidadUnidades=" + cantidadUnidades + ", precioUnidades=" + precioUnidades
                + ", subTotal=" + subTotal + ", iva=" + iva + ", total=" + total
                + ", fechaVencimiento=" + fechaVencimiento.toString() + ", lote=" + lote + '}';
    }

}
