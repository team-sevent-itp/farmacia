/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.model;

import java.util.Objects;

/**
 *
 * @author nuevo
 */
public class Ent_paginacion_bs {
    private int id;
    private String nombre_producto;
    private int cantidad;
    private double iva;
    private double precio_uds_venta;
    private double margen_de_ganancia;
    private String  nombre_presentacion;
    private String laboratorio;
    private String invima;
    private String linea;
    

    public Ent_paginacion_bs(int id, String nombre_producto, int cantidad, double iva, double precio_uds_venta, double margen_de_ganancia, String nombre_presentacion, String laboratorio, String invima, String linea) {
        this.id = id;
        this.nombre_producto = nombre_producto;
        this.cantidad = cantidad;
        this.iva = iva;
        this.precio_uds_venta = precio_uds_venta;
        this.margen_de_ganancia = margen_de_ganancia;
        this.nombre_presentacion = nombre_presentacion;
        this.laboratorio = laboratorio;
        this.invima = invima;
        this.linea = linea;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.id;
        hash = 23 * hash + Objects.hashCode(this.nombre_producto);
        hash = 23 * hash + this.cantidad;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.iva) ^ (Double.doubleToLongBits(this.iva) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.precio_uds_venta) ^ (Double.doubleToLongBits(this.precio_uds_venta) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.margen_de_ganancia) ^ (Double.doubleToLongBits(this.margen_de_ganancia) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.nombre_presentacion);
        hash = 23 * hash + Objects.hashCode(this.laboratorio);
        hash = 23 * hash + Objects.hashCode(this.invima);
        hash = 23 * hash + Objects.hashCode(this.linea);
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
        final Ent_paginacion_bs other = (Ent_paginacion_bs) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.cantidad != other.cantidad) {
            return false;
        }
        if (Double.doubleToLongBits(this.iva) != Double.doubleToLongBits(other.iva)) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio_uds_venta) != Double.doubleToLongBits(other.precio_uds_venta)) {
            return false;
        }
        if (Double.doubleToLongBits(this.margen_de_ganancia) != Double.doubleToLongBits(other.margen_de_ganancia)) {
            return false;
        }
        if (!Objects.equals(this.nombre_producto, other.nombre_producto)) {
            return false;
        }
        if (!Objects.equals(this.nombre_presentacion, other.nombre_presentacion)) {
            return false;
        }
        if (!Objects.equals(this.laboratorio, other.laboratorio)) {
            return false;
        }
        if (!Objects.equals(this.invima, other.invima)) {
            return false;
        }
        if (!Objects.equals(this.linea, other.linea)) {
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

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getPrecio_uds_venta() {
        return precio_uds_venta;
    }

    public void setPrecio_uds_venta(double precio_uds_venta) {
        this.precio_uds_venta = precio_uds_venta;
    }

    public double getMargen_de_ganancia() {
        return margen_de_ganancia;
    }

    public void setMargen_de_ganancia(double margen_de_ganancia) {
        this.margen_de_ganancia = margen_de_ganancia;
    }

    public String getNombre_presentacion() {
        return nombre_presentacion;
    }

    public void setNombre_presentacion(String nombre_presentacion) {
        this.nombre_presentacion = nombre_presentacion;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getInvima() {
        return invima;
    }

    public void setInvima(String invima) {
        this.invima = invima;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }
  
    
    @Override
    public String toString() {
        return "Ent_paginacion_bs{" + "id=" + id + ", nombre_producto=" + nombre_producto + ", cantidad=" + cantidad + ", iva=" + iva + ", precio_uds_venta=" + precio_uds_venta + ", margen_de_ganancia=" + margen_de_ganancia + ", nombre_presentacion=" + nombre_presentacion + ", laboratorio=" + laboratorio + ", invima=" + invima + ", linea=" + linea + '}';
    }
    
    

}

