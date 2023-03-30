package com.vehiculos.tipos;

import com.vehiculos.Vehiculos;

public class Ciclomotor extends Vehiculos {

    protected String circular = "Si";

    public Ciclomotor(String marca, float peso, float potecia, int puertas, float velocidad, String circular) {
        super(marca, peso, potecia, puertas, velocidad);
        this.circular= circular;
    }

    public String getCircular() {
        return circular;
    }

    public void setCircular(String circular) {
        this.circular = circular;
    }

    @Override
    public void acelerar() {
        this.velocidad += 7;
    }





    @Override
    public String toString() {

        String salida = "----------------------------------";
        salida = "* Tipo de vehículo : Ciclomotor" + "\n";
        salida += "* Marca: " + getMarca() + "\n";
        salida += "* Peso: " + getPeso() + "\n";
        salida += "* Potencia: " + getPotecia() + "\n";
        salida += "* Número de puertas: " + getPuertas() + "\n";
        salida += "* Puede ir por autopista: " + getCircular() + "\n";
        salida += "* Velocidad actual: " + getVelocidad() + "\n";
        salida += "-----------------------------------------";

        return salida;
    }

}
