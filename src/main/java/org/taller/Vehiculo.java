package org.taller;

public class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se mueve");
    }
}

    class Moto extends Vehiculo {
    @Override
    public void mover() {
        // Mala práctica: exactamente lo mismo que la clase base
        System.out.println("El vehículo se mueve");
    }
}

//Ejercicio3: Sobrescribir un método sin cambiar el comportamiento

//Explicación:

/*El programa compila sin error, pero es una mala práctica porque la sobrescritura
no aporta ningún valor. Si la subclase no necesita especializar el comportamiento,
no debe sobrescribir el método. Hacerlo genera código redundante, confunde a quienes
leen el código (esperan un comportamiento diferente) y dificulta el mantenimiento.
*/