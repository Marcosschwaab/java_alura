import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.desafio.Veiculo;

public class App {
    public static void main(String[] args) {
        // Instanciar a classe Veiculo
        Veiculo meuCarro = new Veiculo("ABC1234", 2023);
        Veiculo meuCarro2 = new Veiculo("ABC5678", 2024);


           List<Veiculo> carros = new ArrayList<>();
                carros.add(meuCarro);
                carros.add(meuCarro2);

        // Serializar o objeto veículo em formato JSON
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(carros);


        // Imprimir o resultado formatado
        System.out.println(json);
    }
}
