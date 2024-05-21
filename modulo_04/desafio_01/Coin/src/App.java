import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da criptomoeda (por exemplo, 'bitcoin'): ");
        String criptomoeda = scanner.nextLine();

        // Constrói a URL da API CoinGecko
        String url = "https://api.coingecko.com/api/v3/simple/price?ids=" + criptomoeda + "&vs_currencies=usd";

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
            System.out.println("Cotação atual de " + criptomoeda.toUpperCase() + " em USD: " + response.body());
        } catch (Exception e) {
            System.err.println("Erro ao fazer a requisição: " + e.getMessage());
        }
    }
}
