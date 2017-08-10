package com.leanstacks.ws.model;

import java.util.Set;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Instancia implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String nombre;
    @NotNull
    private String usuario_bd;
    @NotNull
    private String contrasena_bd;
    @NotNull
    private String nombre_bd;
    @NotNull
    private String motor_bd;


    public Instancia(){super();}

    public Instancia(final String nombre){
        super();
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getMotor_bd() {
        return motor_bd;
    }

    public String getContrasena_bd() {
        return contrasena_bd;
    }

    public String getUsuario_bd() {
        return usuario_bd;
    }

    public String getNombre_bd() {
        return nombre_bd;
    }

    public void setNombre(final String nombre){
        this.nombre = nombre;
    }

    public void setUsuario_bd(String usuario_bd) {
        this.usuario_bd = usuario_bd;
    }

    public void setNombre_bd(String nombre_bd) {
        this.nombre_bd = nombre_bd;
    }

    public void setContrasena_bd(String contrasena_bd) {
        this.contrasena_bd = contrasena_bd;
    }

    public void setMotor_bd(String motor_bd) {
        this.motor_bd = motor_bd;
    }
}
