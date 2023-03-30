package com.calculadora;

import java.util.Scanner;

public class AppCalculadora {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println( " --------------**OOOO** --------------");
        System.out.println("Querido usuario, introduzca un número: ");

        int numero = teclado.nextInt();

        System.out.println("El restultado del método factorial es: " + Calculadora.factorialDeN(numero));

        System.out.println("El resultado del método de la media es: " + Calculadora.mediaHastaN(numero));

        System.out.println("El resultado del método de obtención de pasos Fibonacci es : "
                + Calculadora.obtenerPasosFibonacci(numero));

        System.out.println( " --------------**OOOO** --------------");

    }

}
