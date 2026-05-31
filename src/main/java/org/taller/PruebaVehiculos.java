package org.taller;

public class PruebaVehiculos {
    public static void main(String[] args) {

        System.out.println("\n==============Vehiculos en movimiento==============\n");

        Vehiculo v1 = new Coche();

        Vehiculo v2 = new Bicicleta();
        
        v1.mover();
        System.out.println("============================================\n");
        v2.mover();
        System.out.println("============================================\n");
    }
}