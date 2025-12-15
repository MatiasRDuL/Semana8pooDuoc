package com.mycompany.s8swing.model;

// Clase que define un objeto de tipo centro de cultivo con sus parametros, constructor y metodo de interface
public class CentroCultivo extends Entidad implements Registrable {

    // Variables declaradas como private
    private int toneladasProduccion;

    // Constructor con datos de herencia
    public CentroCultivo(String nombre, String direccion, int toneladasProduccion) {
        super(nombre, direccion);
        this.toneladasProduccion = toneladasProduccion;
    }

    // Metodos de interface mostrarResumen
    @Override
    public void mostrarResumen() {
        super.mostrarResumen();
        System.out.print(" || Produccion semestral en toneladas: " + this.toneladasProduccion + " ||");
    }

    @Override
    public String getResumen(){
        return this.toneladasProduccion + " toneladas por semestre.";
    }
}
