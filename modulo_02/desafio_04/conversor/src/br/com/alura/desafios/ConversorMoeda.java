package br.com.alura.desafios;

public class ConversorMoeda implements ConversaoFinanceira {
    private static final double TAXA_CONVERSAO = 5.23; // Supondo que 1 dólar é igual a 5.23 reais

    @Override
    public double converterDolarParaReal(double valorDolar) {
        return valorDolar * TAXA_CONVERSAO;
    }
}
