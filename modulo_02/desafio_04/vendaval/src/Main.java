
import br.com.alura.desafio.Produto;
import br.com.alura.desafio.Servico;


public class Main {
    public static void main(String[] args) {
        // Criando um produto
        Produto produto = new Produto("Caneta azul", 2.0);

        // Calculando o preço total para 10 unidades
        int quantidade = 10;
        double precoTotal = produto.calcularPrecoTotal(quantidade);
        System.out.println("Preço total para " + quantidade + " unidades: $" + precoTotal);

        // Aplicando um desconto de 15%
        double percentualDesconto = 15.0;
        produto.aplicarDesconto(percentualDesconto);
        System.out.println("Preço unitário com desconto: $" + produto.getPrecoUnitario());

        // Criando um serviço
        Servico servico = new Servico("Manutenção", 50.0);


        // Calculando o preço total para 5 horas
        int quantidadeHoras = 5;
        double precoTotalServico = servico.calcularPrecoTotal(quantidadeHoras);
        System.out.println("Preço total do serviço (" + quantidadeHoras + " horas): $" + precoTotalServico);
    }
}
