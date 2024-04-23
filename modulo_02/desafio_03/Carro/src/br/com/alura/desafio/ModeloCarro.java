package br.com.alura.desafio;

public class ModeloCarro extends Carro {
    // Subclasse ModeloCarro (pode adicionar mais atributos e métodos específicos)

    public ModeloCarro(String nomeModelo, double precoAno1, double precoAno2, double precoAno3) {
        super(nomeModelo, precoAno1, precoAno2, precoAno3);
    }

    // Adicione métodos específicos para a subclasse ModeloCarro, se necessário
    // Por exemplo:
    public void exibirInformacoes() {
        System.out.println("Modelo: " + getNomeModelo());
        System.out.println("Preço Ano 1: R$" + getPrecoAno1());
        System.out.println("Preço Ano 2: R$" + getPrecoAno2());
        System.out.println("Preço Ano 3: R$" + getPrecoAno3());
    }

    public static void main(String[] args) {
        // Exemplo de uso
        ModeloCarro meuModelo = new ModeloCarro("Meu Carro", 30000.0, 28000.0, 26000.0);
        meuModelo.exibirInformacoes();
        meuModelo.exibirMenorPreco();
        meuModelo.exibirMaiorPreco();
    }
}
