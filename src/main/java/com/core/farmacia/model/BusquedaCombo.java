
package com.core.farmacia.model;

import java.util.Objects;

public class BusquedaCombo {
    private long id;
    private String detalle;

    public BusquedaCombo(long id, String detalle) {
        this.id = id;
        this.detalle = detalle;
    }

    public BusquedaCombo() {
        this.id = 0L;
        this.detalle = "";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 47 * hash + Objects.hashCode(this.detalle);
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
        final BusquedaCombo other = (BusquedaCombo) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.detalle, other.detalle)) {
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

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "BusquedaCombo{" + "id=" + id + ", detalle=" + detalle + '}';
    }    
}
