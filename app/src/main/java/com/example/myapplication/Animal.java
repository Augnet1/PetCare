package com.example.myapplication;

import java.io.Serializable;

public class Animal implements Serializable {

    private String tipo;
    private String raca;

    public Animal(String tipo, String raca) {
        this.tipo = tipo;
        this.raca = raca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
