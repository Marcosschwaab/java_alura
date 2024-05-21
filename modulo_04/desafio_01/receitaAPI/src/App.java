import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da receita: ");
        String nomeReceita = scanner.nextLine();

        // Constrói a URL da API do TheMealDB
        String url = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + nomeReceita;

        // Cria um cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // Cria uma requisição GET
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        // Envia a requisição e obtém a resposta
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Exibe o resultado
            System.out.println("Informações sobre a receita:");
            System.out.println(response.body());
        } catch (Exception e) {
            System.err.println("Erro ao fazer a requisição: " + e.getMessage());
        }
    }
}
