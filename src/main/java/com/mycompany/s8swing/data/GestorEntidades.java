package com.mycompany.s8swing.data;
import com.mycompany.s8swing.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Clase que gestiona arraylist y creacion de objetos a integrar en la lista.
public class GestorEntidades {

    private static GestorEntidades instancia;

    // Declaracion de arraylist
    private ArrayList<Registrable> registrables;

    //Constructor con condicion
    private GestorEntidades(){
        registrables = new ArrayList<>();
        if (registrables.isEmpty()) {
            mostrarDatos();
        }
    }

    //Devuelve una unica instancia de Gestor
    public static GestorEntidades getInstance() {
        if (instancia == null) {
            instancia = new GestorEntidades();
        }
        return instancia;
    }

    // Metodo añade objetos a la lista y aplica logica diferenciada segun cada objeto
    public void mostrarDatos() {

        CentroCultivo centroCultivo1 = new CentroCultivo("Centro Multiexport","C. Circunvalacion 151-251, Puerto Montt", 80000);
        CentroCultivo centroCultivo2 = new CentroCultivo("Centro Austral", "Irarrázaval 19, Chonchi", 100000);
        CentroCultivo centroCultivo3 = new CentroCultivo("Salmones Humboldt", "Juan Soler Manfredini 41, Puerto Montt", 60000);

        PlantaProceso plantaProceso1 = new PlantaProceso("PlantMontt Concesiones", "Punta Arenas, Magallanes and Chilean Antarctica", 900);
        PlantaProceso plantaProceso2 = new PlantaProceso("Planta BlumarMontt", "Lote 14, KM 8 Norte Ruta 9 S/N, Punta Arenas", 750);
        PlantaProceso plantaProceso3 = new PlantaProceso("Planta Cermaq", "Avenida Chinquihue, Km 12. 68, Puerto Montt", 1000);

        Empleado empleado1 = new Empleado("Brad Pitt", "Carmel Highlands 1478, California", "Conserje");
        Empleado empleado2 = new Empleado("Ben Affleck", "Pacific Palisades 2589, Los Ángeles (CA)", "Cocinero");
        Empleado empleado3 = new Empleado("Hugh Jackman", "Chelsea 1475, Nueva York", "Pescador");

        registrables.add(centroCultivo1);
        registrables.add(centroCultivo2);
        registrables.add(centroCultivo3);
        registrables.add(plantaProceso1);
        registrables.add(plantaProceso2);
        registrables.add(plantaProceso3);
        registrables.add(empleado1);
        registrables.add(empleado2);
        registrables.add(empleado3);

        for (Registrable regis : registrables) {
            regis.mostrarResumen();
            if (regis instanceof CentroCultivo) {
                System.out.println("\n-> Es un centro de cultivo");
            } else if (regis instanceof PlantaProceso) {
                System.out.println("\n-> Es una planta procesadora de salmon");
            } else if (regis instanceof Empleado) {
                System.out.println("\n-> Es un empleado de la planta");
            } System.out.println();
        }
    }

    //Metodos para agregar y listar todos los objetos
    public List<Registrable> obtenerTodas(){
        return new ArrayList<>(registrables);
    }

    public void agregarRegistrable(Registrable registrable){
        registrables.add(registrable);
    }

}
