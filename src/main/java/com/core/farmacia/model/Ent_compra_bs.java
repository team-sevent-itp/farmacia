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
public class Ent_compra_bs {

    private int id;
    private String proveedor;
    private String factura;
    private LocalDate fecha;
    private LocalTime hora;

    public Ent_compra_bs(int id, String proveedor, String factura, LocalDate fecha, LocalTime hora) {
        this.id = id;
        this.proveedor = proveedor;
        this.factura = factura;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Ent_compra_bs() {
        this.id = 0;
        this.proveedor = "";
        this.factura = "";
        this.fecha = null;
        this.hora = null;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.proveedor);
        hash = 79 * hash + Objects.hashCode(this.factura);
        hash = 79 * hash + Objects.hashCode(this.fecha);
        hash = 79 * hash + Objects.hashCode(this.hora);
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
        final Ent_compra_bs other = (Ent_compra_bs) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.proveedor, other.proveedor)) {
            return false;
        }
        if (!Objects.equals(this.factura, other.factura)) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
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
        return "Ent_compra_bs{" + "id=" + id + ", proveedor=" + proveedor + ", factura=" + factura + ", fecha=" + fecha.toString() + ", hora=" + hora.toString() + '}';
    }
    
    
    
    

}
