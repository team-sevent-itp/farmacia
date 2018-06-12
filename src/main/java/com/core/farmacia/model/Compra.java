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
public class Compra {

    private long id;
    private Proveedor idProveedor;
    private String NroFactura;
    private LocalDate fecha;
    private LocalTime hora;

    public Compra(long id, Proveedor idProveedor, String NroFactura, LocalDate fecha, LocalTime hora) {
        this.id = id;
        this.idProveedor = idProveedor;
        this.NroFactura = NroFactura;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Compra() {
        this.id = 0L;
        this.idProveedor = null;
        this.NroFactura = "";
        this.fecha = null;
        this.hora = null;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 47 * hash + Objects.hashCode(this.idProveedor);
        hash = 47 * hash + Objects.hashCode(this.NroFactura);
        hash = 47 * hash + Objects.hashCode(this.fecha);
        hash = 47 * hash + Objects.hashCode(this.hora);
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
        final Compra other = (Compra) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.NroFactura, other.NroFactura)) {
            return false;
        }
        if (!Objects.equals(this.idProveedor, other.idProveedor)) {
            return false;
        }
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        if (!Objects.equals(this.hora, other.hora)) {
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

    public Proveedor getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedor idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNroFactura() {
        return NroFactura;
    }

    public void setNroFactura(String NroFactura) {
        this.NroFactura = NroFactura;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", idProveedor=" + idProveedor + ", NroFactura="
                + NroFactura + ", fecha=" + fecha + ", hora=" + hora + '}';
    }
}
