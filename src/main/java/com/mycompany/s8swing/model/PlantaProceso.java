package com.mycompany.s8swing.model;

// Clase que define un objeto de tipo planta procesadora de alimentos con sus parametros, constructor y metodo de interface
public class PlantaProceso extends Entidad implements Registrable {

    // Variables declaradas como private
    private int capacidadProceso;

    // Constructor con datos de herencia
    public PlantaProceso(String nombre, String direccion, int capacidadProceso) {
        super(nombre, direccion);
        this.capacidadProceso = capacidadProceso;
    }

    // Metodos de interface mostrarResumen
    @Override
    public void mostrarResumen() {
        super.mostrarResumen();
        System.out.print(" || Capacidad diaria maxima a procesar en toneladas: " + this.capacidadProceso + " ||");
    }

    @Override
    public String getResumen() {
        return this.capacidadProceso + " toneladas diarias procesadas.";
    }
}
