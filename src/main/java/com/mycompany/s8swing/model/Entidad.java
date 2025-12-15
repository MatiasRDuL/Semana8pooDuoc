package com.mycompany.s8swing.model;

// Clase abstracta que funciona como plantilla para las clases CentroCultivo, PlantaProceso y Empleado
public abstract class Entidad implements Registrable {

    //Variables declaradas como protected
    protected String nombre;
    protected String direccion;

    // Constructor
    public Entidad(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    // Metodos de interface mostrarResumen
    @Override
    public void mostrarResumen() {
        System.out.print("|| Nombre: " +  this.nombre + " || Direccion: " + this.direccion);
    }

    @Override
    public String getResumen() {
        return "Nombre: " +  this.nombre + " || Direccion: " + this.direccion;
    }
}