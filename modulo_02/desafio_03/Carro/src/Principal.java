
import br.com.alura.desafio.ModeloCarro;


public class Principal {
    public static void main(String[] args) {
        ModeloCarro meuModelo = new ModeloCarro("Meu Carro", 30000.0, 28000.0, 26000.0);
        meuModelo.exibirInformacoes();
        meuModelo.exibirMenorPreco();
        meuModelo.exibirMaiorPreco();
    }
}

