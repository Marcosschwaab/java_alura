import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.buscacep.ConsultaCep;
import br.com.buscacep.Endereco;
import br.com.buscacep.GeradorDeArquivo;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Consultar endereço por CEP");
            System.out.println("2. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o CEP (sem hífen): ");
                    String cep = scanner.nextLine();

                    try {
                       
                        Endereco novoEndereco = consultaCep.buscaEndereco(cep);

                        Gson gson = new GsonBuilder().setPrettyPrinting().create();
                        String json = gson.toJson(novoEndereco);
                        System.out.println(json);

                        GeradorDeArquivo gerador = new GeradorDeArquivo();
                        gerador.salvaJson(novoEndereco);
                    }
                    catch (RuntimeException e){
                        System.out.println(e.getMessage());
                        System.out.println("Endereço não encontrado");
                    }
                    break;
                    case 2:
                        System.out.println("Encerrando o programa. Até mais!");
                        return;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
    }                   

}
