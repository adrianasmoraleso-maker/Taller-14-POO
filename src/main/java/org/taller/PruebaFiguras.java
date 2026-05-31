package org.taller;

public class PruebaFiguras {
    public static void main(String[] args) {

        System.out.println("\n=============Calcular areas figuras=============\n");

        Figura[] figuras = {
                new Circulo(5),
                new Rectangulo(4, 3)
        };

        for (Figura f : figuras) {
            f.calcularArea(); // polimorfismo en acción
        }
    }
}