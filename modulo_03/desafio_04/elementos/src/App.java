import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Criando uma lista como ArrayList
        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Elemento 1");
        listaArrayList.add("Elemento 2");
        listaArrayList.add("Elemento 3");

        System.out.println("ArrayList:");
        for (String elemento : listaArrayList) {
            System.out.println(elemento);
        }

        // Criando uma lista como LinkedList
        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Elemento A");
        listaLinkedList.add("Elemento B");
        listaLinkedList.add("Elemento C");

        System.out.println("\nLinkedList:");
        for (String elemento : listaLinkedList) {
            System.out.println(elemento);
        }
    }
}
