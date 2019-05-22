package com.example.testes;

import java.util.ArrayList;
import java.util.List;

public class Celular {
    private String Marca;
    private String Modelo;
    private double Valor;

    public Celular(String marca, String modelo, int valor){
        this.Marca=marca;
        this.Modelo=modelo;
        this.Valor=valor;
    }

    public static List<Celular> getCelulares(){
        List<Celular> celulares= new ArrayList<>();

        celulares.add(new Celular("Apple", "IPhone XR", 9000));
        celulares.add(new Celular("Apple", "IPhone 8", 3000));
        celulares.add(new Celular("Samsung", "A5", 300));
        celulares.add(new Celular("Apple", "IPhone 5C", 900));
        celulares.add(new Celular("Samsung", "J4", 600));
        celulares.add(new Celular("Samsung", "S10", 6000));
        celulares.add(new Celular("Apple", "IPhone 4S", 400));
        celulares.add(new Celular("Samsung", "A7", 1000));

        return  celulares;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public double getValor() {
        return Valor;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public void setValor(double valor) {
        Valor = valor;
    }
}
