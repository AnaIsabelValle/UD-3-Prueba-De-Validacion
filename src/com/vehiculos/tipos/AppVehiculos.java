package com.vehiculos.tipos;

import com.vehiculos.Vehiculos;

public class AppVehiculos {

    public static void main(String[] args) {

        Vehiculos vehiculo = new Vehiculos("Citroen", 500.0f,
                100, 4, 120);

        System.out.println("Los datos del vehículo  son: " + vehiculo);

        Camion camion = new Camion("MAN", 1000.0f,
                150, 4, 120, 2000.0f);

        System.out.println("Los datos del camión  es: " + camion);

        camion.acelerar();

        System.out.println(camion);

        Ciclomotor ciclomotor = new Ciclomotor("Ana", 10.f, 1, 0, 1,"Si");

        System.out.println("Los datos del ciclomotor es: " + ciclomotor);

        ciclomotor.acelerar();

        System.out.println(ciclomotor);


    }

}

