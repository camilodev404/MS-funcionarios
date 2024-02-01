package com.funcionarios.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ugts")
public class Ugt {

    @Id
    @Column(name = "idugt")
    private String idugt;

    @Column(name = "nombre")
    private String nombre;

    public Ugt() {
    }

    public Ugt(String idugt, String nombre) {
        this.idugt = idugt;
        this.nombre = nombre;
    }

    public String getIdugt() {
        return idugt;
    }

    public void setIdugt(String idugt) {
        this.idugt = idugt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
