import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;

import br.com.alura.screenmatch.modelos.Titulo;

public class principalComBusca {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitor = new Scanner(System.in);
        System.out.println("O que deseja pesquisar?");
        var busca = leitor.nextLine();


        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=b54ed546";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
             .uri(URI.create(endereco))
            .build();

                HttpResponse<String> response = client
                         .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                Gson gson = new Gson();
                Titulo meuTitulo = gson.fromJson(json, Titulo.class);
                System.out.println(meuTitulo);
        }   
}
