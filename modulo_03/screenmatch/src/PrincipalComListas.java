import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        
        for (Titulo item: lista){
         System.out.println("Nome:" + item.getNome());
         if (item instanceof Filme filme && filme.getClassificacao() > 2){
            System.out.println("Classificação: " +filme.getClassificacao());
            }
        }


        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Douglas");
        buscaPorArtista.add("Jaqueline");
        for (String nome: buscaPorArtista){
            System.out.println("Nome:" + nome);
        }

        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        System.out.println("Ordenando por classificação");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por Ano");
        System.out.println(lista);
    }
}
