package br.com.alura.desafio;

public class Quadrado implements Forma {
    private double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
