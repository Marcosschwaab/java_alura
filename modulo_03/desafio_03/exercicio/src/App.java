import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("Java");
        listaStrings.add("Ruby");
        listaStrings.add("Elixir");

        for (String elemento : listaStrings) {
            System.out.println(elemento);
        }
    }
}
