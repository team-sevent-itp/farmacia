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
public class Producto {

    private long id;
    private String nombre;
    private long cantidad;
    private double iva;
    private double precio;
    private double margenDeGanancia;
    private long idPresentacion;
    private long idLaboratorio;
    private String invima;
    private long idLineaProducto;

    public Producto(long id, String nombre, long cantidad, double iva,
            double precio, double margenDeGanancia, long idPresentacion,
            long idLaboratorio, String invima, long idLineaProducto) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.iva = iva;
        this.precio = precio;
        this.margenDeGanancia = margenDeGanancia;
        this.idPresentacion = idPresentacion;
        this.idLaboratorio = idLaboratorio;
        this.invima = invima;
        this.idLineaProducto = idLineaProducto;
    }

    public Producto() {
        this.id = 0L;
        this.nombre = "";
        this.cantidad = 0L;
        this.iva = 0D;
        this.precio = 0D;
        this.margenDeGanancia = 0D;
        this.idPresentacion = 0L;
        this.idLaboratorio = 0L;
        this.invima = "";
        this.idLineaProducto = 0L;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 19 * hash + Objects.hashCode(this.nombre);
        hash = 19 * hash + (int) (this.cantidad ^ (this.cantidad >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.iva) ^ (Double.doubleToLongBits(this.iva) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.margenDeGanancia) ^ (Double.doubleToLongBits(this.margenDeGanancia) >>> 32));
        hash = 19 * hash + (int) (this.idPresentacion ^ (this.idPresentacion >>> 32));
        hash = 19 * hash + (int) (this.idLaboratorio ^ (this.idLaboratorio >>> 32));
        hash = 19 * hash + Objects.hashCode(this.invima);
        hash = 19 * hash + (int) (this.idLineaProducto ^ (this.idLineaProducto >>> 32));
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
        final Producto other = (Producto) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.cantidad != other.cantidad) {
            return false;
        }
        if (Double.doubleToLongBits(this.iva) != Double.doubleToLongBits(other.iva)) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (Double.doubleToLongBits(this.margenDeGanancia) != Double.doubleToLongBits(other.margenDeGanancia)) {
            return false;
        }
        if (this.idPresentacion != other.idPresentacion) {
            return false;
        }
        if (this.idLaboratorio != other.idLaboratorio) {
            return false;
        }
        if (this.idLineaProducto != other.idLineaProducto) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.invima, other.invima)) {
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getMargenDeGanancia() {
        return margenDeGanancia;
    }

    public void setMargenDeGanancia(double margenDeGanancia) {
        this.margenDeGanancia = margenDeGanancia;
    }

    public long getIdPresentacion() {
        return idPresentacion;
    }

    public void setIdPresentacion(long idPresentacion) {
        this.idPresentacion = idPresentacion;
    }

    public long getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(long idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public String getInvima() {
        return invima;
    }

    public void setInvima(String invima) {
        this.invima = invima;
    }

    public long getIdLineaProducto() {
        return idLineaProducto;
    }

    public void setIdLineaProducto(long idLineaProducto) {
        this.idLineaProducto = idLineaProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad 
                           + ", iva=" + iva + ", precio=" + precio + ", margenDeGanancia="
                           + margenDeGanancia + ", idPresentacion=" + idPresentacion 
                           + ", idLaboratorio=" + idLaboratorio + ", invima=" + invima 
                           + ", idLineaProducto=" + idLineaProducto + '}';
    }
    
 }
