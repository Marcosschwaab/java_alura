import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.desafio.Titulo;

public class App {
    public static void main(String[] args) throws Exception {

   // Instanciar a classe Titulo
   Titulo filme1 = new Titulo("Matrix", 001);
   Titulo filme2 = new Titulo("Top Gun", 002);

   // Criar uma lista de filmes
   List<Titulo> filmes = new ArrayList<>();
   filmes.add(filme1);
   filmes.add(filme2);

   // Serializar o objeto filme em formato JSON
   Gson gson = new GsonBuilder().setPrettyPrinting().create();
   String json = gson.toJson(filmes);

   // Imprimir a lista de filmes formatada
   System.out.println(json);
    }
}