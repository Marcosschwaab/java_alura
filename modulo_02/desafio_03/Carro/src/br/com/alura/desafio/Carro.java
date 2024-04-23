package br.com.alura.desafio;

public class Carro {
    private String nomeModelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    // Construtor
    public Carro(String nomeModelo, double precoAno1, double precoAno2, double precoAno3) {
        this.nomeModelo = nomeModelo;
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    // Define o nome do modelo
    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    // Calcula e exibe o menor preço
    public void exibirMenorPreco() {
        double menorPreco = Math.min(precoAno1, Math.min(precoAno2, precoAno3));
        System.out.println("Menor preço: R$" + menorPreco);
    }

    // Calcula e exibe o maior preço
    public void exibirMaiorPreco() {
        double maiorPreco = Math.max(precoAno1, Math.max(precoAno2, precoAno3));
        System.out.println("Maior preço: R$" + maiorPreco);
    }

    public static void main(String[] args) {
        // Exemplo de uso
        Carro meuCarro = new Carro("Meu Modelo", 30000.0, 28000.0, 26000.0);
        meuCarro.exibirMenorPreco();
        meuCarro.exibirMaiorPreco();
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public double getPrecoAno1() {
        return precoAno1;
    }

    public void setPrecoAno1(double precoAno1) {
        this.precoAno1 = precoAno1;
    }

    public double getPrecoAno2() {
        return precoAno2;
    }

    public void setPrecoAno2(double precoAno2) {
        this.precoAno2 = precoAno2;
    }

    public double getPrecoAno3() {
        return precoAno3;
    }

    public void setPrecoAno3(double precoAno3) {
        this.precoAno3 = precoAno3;
    }
}

class ModeloCarro extends Carro {
    // Subclasse ModeloCarro (pode adicionar mais atributos e métodos específicos)

    public ModeloCarro(String nomeModelo, double precoAno1, double precoAno2, double precoAno3) {
        super(nomeModelo, precoAno1, precoAno2, precoAno3);
    }
}


