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
public class RegistroVenta {

    private IdRegistroVenta id;
    private long cantidad;
    private double total;

    public class IdRegistroVenta {

        private Venta idVenta;
        private Producto idProducto;

        public IdRegistroVenta() {
            this.idVenta = null;
            this.idProducto = null;
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 73 * hash + Objects.hashCode(this.idVenta);
            hash = 73 * hash + Objects.hashCode(this.idProducto);
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
            final IdRegistroVenta other = (IdRegistroVenta) obj;
            if (!Objects.equals(this.idVenta, other.idVenta)) {
                return false;
            }
            if (!Objects.equals(this.idProducto, other.idProducto)) {
                return false;
            }
            return true;
        }

        public Venta getIdVenta() {
            return idVenta;
        }

        public void setIdVenta(Venta idVenta) {
            this.idVenta = idVenta;
        }

        public Producto getIdProducto() {
            return idProducto;
        }

        public void setIdProducto(Producto idProducto) {
            this.idProducto = idProducto;
        }

    }

    public RegistroVenta(IdRegistroVenta id, long cantidad, double total) {
        this.id = id;
        this.cantidad = cantidad;
        this.total = total;
    }

    public RegistroVenta() {
        this.id = null;
        this.cantidad = 0L;
        this.total = 0D;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + (int) (this.cantidad ^ (this.cantidad >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.total) ^ (Double.doubleToLongBits(this.total) >>> 32));
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
        final RegistroVenta other = (RegistroVenta) obj;
        if (this.cantidad != other.cantidad) {
            return false;
        }
        if (Double.doubleToLongBits(this.total) != Double.doubleToLongBits(other.total)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public IdRegistroVenta getId() {
        return id;
    }

    public void setId(IdRegistroVenta id) {
        this.id = id;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "RegistroVenta{" + "id=" + id + ", cantidad=" + cantidad + ", total=" + total + '}';
    }

}
