import com.google.gson.Gson;
import br.com.alura.desafio.Livro;

public class App {

    public static void main(String[] args) {
        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";

        Gson gson = new Gson();
        Livro livro = gson.fromJson(jsonLivro, Livro.class);

        System.out.println("Objeto Livro: " + livro);
    }
}
