package com.DevLomoSE.SBWeb.app.domain;

/**
 * Usuario at: src/main/java/com/DevLomoSE/SBWeb/app/domain
 * Created by @DevLomoSE at 10/9/21 15:49.
 */
public class Usuario {

    private String nombre;
    private String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
