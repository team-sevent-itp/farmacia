
package com.core.farmacia.model;

import java.util.Objects;

/**
 *
 * @author desconocido
 */
public class Ent_cliente_bs {
    private String id;
    private String nombres;
    private String apellidos;
    private String sexo;
    private String telefono1;
    private String telefono2;
    private String municipio;

    public Ent_cliente_bs(String id, String nombres, String apellidos, String sexo, String telefono1, String telefono2, String municipio) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.municipio = municipio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.nombres);
        hash = 53 * hash + Objects.hashCode(this.apellidos);
        hash = 53 * hash + Objects.hashCode(this.sexo);
        hash = 53 * hash + Objects.hashCode(this.telefono1);
        hash = 53 * hash + Objects.hashCode(this.telefono2);
        hash = 53 * hash + Objects.hashCode(this.municipio);
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
        final Ent_cliente_bs other = (Ent_cliente_bs) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nombres, other.nombres)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.telefono1, other.telefono1)) {
            return false;
        }
        if (!Objects.equals(this.telefono2, other.telefono2)) {
            return false;
        }
        if (!Objects.equals(this.municipio, other.municipio)) {
            return false;
        }
        return true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Override
    public String toString() {
        return "Ent_cliente_bs{" + "id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", sexo=" + sexo + ", telefono1=" + telefono1 + ", telefono2=" + telefono2 + ", municipio=" + municipio + '}';
    }

    
    
}