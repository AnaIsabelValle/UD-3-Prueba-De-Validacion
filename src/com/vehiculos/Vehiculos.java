package com.vehiculos;

public class Vehiculos {

    protected String marca;
    protected float peso;
    protected float potecia;
    protected int puertas;
    protected float velocidad;

    public Vehiculos(String marca, float peso, float potecia, int puertas, float velocidad) {
        this.marca = marca;
        this.peso = peso;
        this.potecia = potecia;
        this.puertas = puertas;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPotecia() {
        return potecia;
    }

    public void setPotecia(float potecia) {
        this.potecia = potecia;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerar() {
        this.velocidad += 10;
    }
}
