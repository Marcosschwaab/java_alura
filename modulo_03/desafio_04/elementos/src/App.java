import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {


        List<String> listaPolimorfica;
        // Declarando a variável de lista como a interface List e instanciando como ArrayList
        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        listaPolimorfica.add("Elemento 3");

        System.out.println("ArrayList:");
        for (String elemento : listaPolimorfica) {
            System.out.println(elemento);
        }

        // Reinstanciando a variável de lista como LinkedList
        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        listaPolimorfica.add("Elemento C");

        System.out.println("\nLinkedList:");
        for (String elemento : listaPolimorfica) {
            System.out.println(elemento);
        }
    }
}
