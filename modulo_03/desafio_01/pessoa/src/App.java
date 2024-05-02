import java.util.ArrayList;
import br.com.alura.desafio.Pessoa;

public class App {
    public static void main(String[] args) {
        // Criação do ArrayList de Pessoa
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        // Adicionando três pessoas à lista
        listaDePessoas.add(new Pessoa("João", 30));
        listaDePessoas.add(new Pessoa("Maria", 25));
        listaDePessoas.add(new Pessoa("Pedro", 35));

        // Imprimindo o tamanho da lista
        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        // Imprimindo a primeira pessoa da lista
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));

        // Imprimindo a lista completa
        System.out.println("Lista completa: " + listaDePessoas);
    }
}
