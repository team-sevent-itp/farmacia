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
public class RegistroCompra {
    private long id;
    private Compra idCompra;
    private Producto idProducto;
    private double cantidadUnidades;
    private double precioUnidades;
    private double subTotal;
    private double iva;
    private double total;
    private LocalDate fecha;
    private String lote;

    public RegistroCompra(long id, Compra idCompra, Producto idProducto, double cantidadUnidades,
            double precioUnidades, double subTotal, double iva, double total, 
            LocalDate fecha, String lote) {
        this.id = id;
        this.idCompra = idCompra;
        this.idProducto = idProducto;
        this.cantidadUnidades = cantidadUnidades;
        this.precioUnidades = precioUnidades;
        this.subTotal = subTotal;
        this.iva = iva;
        this.total = total;
        this.fecha = fecha;
        this.lote = lote;
    }
   
    public RegistroCompra() {
        this.id=0;
        this.idCompra=null;
        this.idProducto=null;
        this.cantidadUnidades=0D;
        this.precioUnidades=0D;
        this.iva=0D;
        this.subTotal=0D;
        this.total=0D;
        this.fecha=null;
        this.lote="";        
    }   

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 11 * hash + Objects.hashCode(this.idCompra);
        hash = 11 * hash + Objects.hashCode(this.idProducto);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.cantidadUnidades) ^ (Double.doubleToLongBits(this.cantidadUnidades) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.precioUnidades) ^ (Double.doubleToLongBits(this.precioUnidades) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.subTotal) ^ (Double.doubleToLongBits(this.subTotal) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.iva) ^ (Double.doubleToLongBits(this.iva) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.total) ^ (Double.doubleToLongBits(this.total) >>> 32));
        hash = 11 * hash + Objects.hashCode(this.fecha);
        hash = 11 * hash + Objects.hashCode(this.lote);
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
        if (!Objects.equals(this.idCompra, other.idCompra)) {
            return false;
        }
        if (!Objects.equals(this.idProducto, other.idProducto)) {
            return false;
        }
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        return true;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Compra getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Compra idCompra) {
        this.idCompra = idCompra;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "RegistroCompra{" + "id=" + id + ", idCompra=" + idCompra + ", idProducto=" 
                + idProducto + ", cantidadUnidades=" + cantidadUnidades 
                + ", precioUnidades=" + precioUnidades + ", subTotal=" + subTotal 
                + ", iva=" + iva + ", total=" + total + ", fecha=" + fecha + ", lote=" + lote + '}';
    }
    
}
