package com.vehiculos.tipos;

import com.vehiculos.Vehiculos;

public class Camion extends Vehiculos {

    protected float capacidadCarga;

    public Camion(String marca, float peso, float potecia, int puertas, float velocidad, float capacidadCarga) {
        super(marca, peso, potecia, puertas, velocidad);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void acelerar() {
        this.velocidad += 5;
    }

    public void setCapacidadCarga() {
        this.capacidadCarga = capacidadCarga;
    }
    @Override
    public String toString() {

        String salida = "----------------------------------";
        salida = "\n"+ "* Tipo de vehículo : Camión" + "\n";
        salida += "* Marca: " + getMarca() + "\n";
        salida += "* Peso: " + getPeso() + "\n";
        salida += "* Potencia: " + getPotecia() + "\n";
        salida += "* Número de puertas: " + getPuertas() + "\n";
        salida += "* Capacidad de carga: " + capacidadCarga + "\n";
        salida += "* Velocidad actual: " + getVelocidad()+ "\n";
        salida += "-----------------------------------------";

        return salida;
    }

}

