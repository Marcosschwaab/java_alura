import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.Strictness;

import br.com.alura.desafio.Pessoa;

public class App {
    public static void main(String[] args) {
        String json = "{\"nome\":\"João Silva\",\"idade\":25,\"cidade\":\"São Paulo\"}";

      Gson gson = new GsonBuilder().setStrictness(Strictness.LENIENT).create();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);

        System.out.println("Objeto: " + pessoa);

    }
}
