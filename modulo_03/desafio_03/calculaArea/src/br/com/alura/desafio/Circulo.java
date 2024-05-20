package br.com.alura.desafio;

public class Circulo implements Forma {
    private double raio;

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
