package org.example.polimorfismo.ex1;

public class Galo implements Animal {

    @Override
    public String emitirSom() {
        return "Cocoricó";
    }

    @Override
    public String comer() {
        return "Ração de galo";
    }
}