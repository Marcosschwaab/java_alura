import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.desafio.Titulo;

public class App {
    public static void main(String[] args) {
        List<Titulo> titulos = new ArrayList<>();
        titulos.add(new Titulo("O Senhor dos Anéis"));
        titulos.add(new Titulo("O Hobbit"));
        titulos.add(new Titulo("As Crônicas de Nárnia"));
        titulos.add(new Titulo("Harry Potter"));
        titulos.add(new Titulo("Percy Jackson"));

        Collections.sort(titulos);

        for (Titulo titulo : titulos) {
            System.out.println(titulo.getNome());
        }
    }
}
