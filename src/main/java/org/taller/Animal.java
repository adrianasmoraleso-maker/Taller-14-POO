package org.taller;

public class Animal {
    public void hablar() {
        System.out.println("El animal habla.");
    }
}

    class Perro extends Animal {
    public void ladrar() {
        System.out.println("El perro ladra.");
    }
}

    class Prueba {
    public static void main(String[] args) {
        Animal a = new Perro();
        a.hablar();  // OK
        a.ladrar();  // ERROR DE COMPILACIÓN: Animal no tiene el método ladrar()
    }
}

//Ejercicio3:  Invocar un método de la clase derivada usando referencia de la clase base

//Explicación:

/*En Java, los métodos disponibles dependen del tipo de la referencia en tiempo de compilación.
En este caso, "a" es de tipo Animal, así que el compilador solo permite acceder a los métodos
definidos en esa clase.

Aunque el objeto real sea un Perro, el método ladrar() no está disponible directamente desde
la referencia Animal. Para poder usarlo, es necesario hacer un casteo explícito:
((Perro) a).ladrar() (o sea, convertir la referencia de Animal a Perro temporalmente).
*/