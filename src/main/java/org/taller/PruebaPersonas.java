package org.taller;

public class PruebaPersonas {
    public static void main(String[] args) {

        System.out.println("\n================Presentación Personas================\n");
        Persona p1 = new Persona();
        Persona p2 = new Estudiante();
        Persona p3 = new Profesor();

        p1.presentarse();
        p2.presentarse();
        p3.presentarse();
    }
}