package org.taller;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.println("Área del círculo: " + (Math.PI * radio * radio));
    }
}