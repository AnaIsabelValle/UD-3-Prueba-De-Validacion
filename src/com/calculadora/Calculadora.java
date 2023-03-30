package com.calculadora;

public class Calculadora {

    public static int factorialDeN(int numero) {
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static float mediaHastaN(int numero) {
        int resultado = 0;
        for (int i = 1; i <= numero; i++) {
            resultado += i;
        }
        return (float) resultado / numero;
    }

    public static int fibonacciRecursivo(int numero) {

        if (numero == 0) {
            return 0;

        } else if (numero == 1) {
            return 1;
        } else {

            return fibonacciRecursivo(numero - 1) + fibonacciRecursivo(numero- 2);
        }

    }







    public static int obtenerPasosFibonacci(int numero) {
        if (numero < 2) {
            return numero;

        }
        return obtenerPasosFibonacci(numero - 1) + obtenerPasosFibonacci(numero - 2);

    }
}




