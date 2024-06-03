import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.screenmatch.modelos.TituloOmdb;
import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;

public class principalComBusca {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitor = new Scanner(System.in);
        System.out.println("O que deseja pesquisar?");
        var busca = leitor.nextLine();


        String endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ","+") + "&apikey=b54ed546";
        try {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
             .uri(URI.create(endereco))
            .build();

                HttpResponse<String> response = client
                         .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                //try {
                    Titulo meuTitulo = new Titulo(meuTituloOmdb);
                    System.out.println(meuTitulo);

                    FileWriter escritor = new FileWriter("filmes.csv", true);
                    escritor.write(meuTitulo.toString() + "\n");
                    escritor.close();


                    }catch(ErroDeConversaoDeAnoException e) {
                    System.out.println("Aconteceu um erro: " + e.getMessage());
                    } catch(NumberFormatException e) {
                        System.out.println("Aconteceu um erro: " + e.getMessage());
                    } catch(IllegalArgumentException e){
                        System.out.println("Aconteceu um erro: ");
                    } catch(Exception e) {
                        System.out.println("Aconteceu um erro: " + e.getMessage());
                    }
    }   
}


