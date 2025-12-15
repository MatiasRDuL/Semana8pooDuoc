package com.mycompany.s8swing.model;

// Clase que define un objeto de tipo empleado con sus parametros, constructor y metodo de interface
public class Empleado extends Entidad implements Registrable {

    // Variables declaradas como private
    private String cargo;

    // Constructor con datos de herencia
    public Empleado(String nombre, String direccion, String cargo) {
        super(nombre, direccion);
        this.cargo = cargo;
    }

    // Metodos de interface mostrarResumen
    @Override
    public void mostrarResumen() {
        super.mostrarResumen();
        System.out.print(" || Posicion en la empresa: " + this.cargo + " ||");
    }

    @Override
    public String getResumen() {
        return this.cargo;
    }
}
