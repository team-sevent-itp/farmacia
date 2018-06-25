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
public class Ent_producto {

    private int id;
    private String nombre;
    private int cantidad;
    private double iva;
    private double precio;
    private double margenDeGanancia;
    private int idPresentacion;
    private int idLaboratorio;
    private String invima;
    private int idLineaProducto;

    public Ent_producto(int id, String nombre, int cantidad, double iva, double precio, double margenDeGanancia, int idPresentacion, int idLaboratorio, String invima, int idLineaProducto) {
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

    public Ent_producto() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + this.cantidad;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.iva) ^ (Double.doubleToLongBits(this.iva) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.margenDeGanancia) ^ (Double.doubleToLongBits(this.margenDeGanancia) >>> 32));
        hash = 79 * hash + this.idPresentacion;
        hash = 79 * hash + this.idLaboratorio;
        hash = 79 * hash + Objects.hashCode(this.invima);
        hash = 79 * hash + this.idLineaProducto;
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
        final Ent_producto other = (Ent_producto) obj;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getIdPresentacion() {
        return idPresentacion;
    }

    public void setIdPresentacion(int idPresentacion) {
        this.idPresentacion = idPresentacion;
    }

    public int getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public String getInvima() {
        return invima;
    }

    public void setInvima(String invima) {
        this.invima = invima;
    }

    public int getIdLineaProducto() {
        return idLineaProducto;
    }

    public void setIdLineaProducto(int idLineaProducto) {
        this.idLineaProducto = idLineaProducto;
    }

    @Override
    public String toString() {
        return "Ent_producto{" + "id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", iva=" + iva + ", precio=" + precio + ", margenDeGanancia=" + margenDeGanancia + ", idPresentacion=" + idPresentacion + ", idLaboratorio=" + idLaboratorio + ", invima=" + invima + ", idLineaProducto=" + idLineaProducto + '}';
    }
    
    
    
}
