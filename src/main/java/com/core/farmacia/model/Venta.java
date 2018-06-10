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
public class Venta {

    private long id;
    private Cliente idCliente;
    private String nroFactura;   
    private LocalDate fecha;
    private LocalTime hora;

    public Venta(long id, Cliente idCliente, String nroFactura, LocalDate fecha, LocalTime hora) {
        this.id = id;
        this.idCliente = idCliente;
        this.nroFactura = nroFactura;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Venta() {
        this.id=0L;
        this.idCliente=null;
        this.nroFactura="";
        this.fecha=null;
        this.hora=null;    
    }    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 17 * hash + Objects.hashCode(this.idCliente);
        hash = 17 * hash + Objects.hashCode(this.nroFactura);
        hash = 17 * hash + Objects.hashCode(this.fecha);
        hash = 17 * hash + Objects.hashCode(this.hora);
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
        final Venta other = (Venta) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nroFactura, other.nroFactura)) {
            return false;
        }
        if (!Objects.equals(this.idCliente, other.idCliente)) {
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

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public String getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(String nroFactura) {
        this.nroFactura = nroFactura;
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
        return "Venta{" + "id=" + id + ", idCliente=" + idCliente + ", nroFactura=" + nroFactura + ", fecha=" + fecha + ", hora=" + hora + '}';
    }

    
    
}
