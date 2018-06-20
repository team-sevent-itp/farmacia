
package com.core.farmacia.model;

import java.util.Objects;

/**
 *
 * @author desconocido
 */
public class Ent_proveedor_bs {
    
    private int id;
    private String nombre;
    private String numero1;
    private String numero2;
    private String id_municipio;

    public Ent_proveedor_bs(int id, String nombre, String numero1, String numero2, String id_municipio) {
        this.id = id;
        this.nombre = nombre;
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.id_municipio = id_municipio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.id;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.numero1);
        hash = 23 * hash + Objects.hashCode(this.numero2);
        hash = 23 * hash + Objects.hashCode(this.id_municipio);
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
        final Ent_proveedor_bs other = (Ent_proveedor_bs) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.numero1, other.numero1)) {
            return false;
        }
        if (!Objects.equals(this.numero2, other.numero2)) {
            return false;
        }
        if (!Objects.equals(this.id_municipio, other.id_municipio)) {
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

    public String getNumero1() {
        return numero1;
    }

    public void setNumero1(String numero1) {
        this.numero1 = numero1;
    }

    public String getNumero2() {
        return numero2;
    }

    public void setNumero2(String numero2) {
        this.numero2 = numero2;
    }

    public String getId_municipio() {
        return id_municipio;
    }

    public void setId_municipio(String id_municipio) {
        this.id_municipio = id_municipio;
    }

    @Override
    public String toString() {
        return "Ent_proveedor_bs{" + "id=" + id + ", nombre=" + nombre + ", numero1=" + numero1 + ", numero2=" + numero2 + ", id_municipio=" + id_municipio + '}';
    }
    
    
}
    