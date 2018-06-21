/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

/**
 *
 * @author nuevo
 */
public class Ent_reg_comp {

    private int id;
    private LocalDate fechaCompra;
    private LocalTime horaCompra;
    private String nombreProveedor;
    private String nombreProducto;
    private double cantidad;
    private double precioUnidad;
    private double subTotal;
    private double iva;
    private double total;
    private LocalDate fechaVencimiento;
    private String lote;
    private String factura;

    public Ent_reg_comp(int id, LocalDate fechaCompra, LocalTime horaCompra, String nombreProveedor,
            String nombreProducto, double cantidad, double precioUnidad, double subTotal,
            double iva, double total, LocalDate fechaVencimiento, String lote, String factura) {
        this.id = id;
        this.fechaCompra = fechaCompra;
        this.horaCompra = horaCompra;
        this.nombreProveedor = nombreProveedor;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
        this.subTotal = subTotal;
        this.iva = iva;
        this.total = total;
        this.fechaVencimiento = fechaVencimiento;
        this.lote = lote;
        this.factura = factura;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.fechaCompra);
        hash = 29 * hash + Objects.hashCode(this.horaCompra);
        hash = 29 * hash + Objects.hashCode(this.nombreProveedor);
        hash = 29 * hash + Objects.hashCode(this.nombreProducto);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.cantidad) ^ (Double.doubleToLongBits(this.cantidad) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.precioUnidad) ^ (Double.doubleToLongBits(this.precioUnidad) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.subTotal) ^ (Double.doubleToLongBits(this.subTotal) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.iva) ^ (Double.doubleToLongBits(this.iva) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.total) ^ (Double.doubleToLongBits(this.total) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.fechaVencimiento);
        hash = 29 * hash + Objects.hashCode(this.lote);
        hash = 29 * hash + Objects.hashCode(this.factura);
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
        final Ent_reg_comp other = (Ent_reg_comp) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.cantidad) != Double.doubleToLongBits(other.cantidad)) {
            return false;
        }
        if (Double.doubleToLongBits(this.precioUnidad) != Double.doubleToLongBits(other.precioUnidad)) {
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
        if (!Objects.equals(this.nombreProveedor, other.nombreProveedor)) {
            return false;
        }
        if (!Objects.equals(this.nombreProducto, other.nombreProducto)) {
            return false;
        }
        if (!Objects.equals(this.lote, other.lote)) {
            return false;
        }
        if (!Objects.equals(this.factura, other.factura)) {
            return false;
        }
        if (!Objects.equals(this.fechaCompra, other.fechaCompra)) {
            return false;
        }
        if (!Objects.equals(this.horaCompra, other.horaCompra)) {
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

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public LocalTime getHoraCompra() {
        return horaCompra;
    }

    public void setHoraCompra(LocalTime horaCompra) {
        this.horaCompra = horaCompra;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
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

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    @Override
    public String toString() {
        return "Ent_reg_comp{" + "id=" + id + ", fechaCompra=" + fechaCompra.toString() + ", horaCompra=" + horaCompra.toString()
                + ", nombreProveedor=" + nombreProveedor + ", nombreProducto=" + nombreProducto + ", cantidad="
                + cantidad + ", precioUnidad=" + precioUnidad + ", subTotal=" + subTotal + ", iva=" + iva + ", total=" + total
                + ", fechaVencimiento=" + fechaVencimiento.toString() + ", lote=" + lote + ", factura=" + factura + '}';
    }

}
