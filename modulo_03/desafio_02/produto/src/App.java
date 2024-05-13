import br.com.alura.screenmatch.calculos.*;
import br.com.alura.desafio.ProdutoPerecivel;

import java.util.ArrayList;

public class App {
        public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto C", 12.75, 2, "2023-12-31");
        System.out.println(produtoPerecivel);


        Produto produto1 = new Produto("Sabão", 15.99, 5);
        Produto produto2 = new Produto("Detergente", 10.49, 8);
        
        Produto produtoNovo = new Produto("Novo Produto", 15.99, 3);
    
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        System.out.println(produtoNovo);
    
        System.out.println("Tamanho da lista: " + listaProdutos.size());
        System.out.println("Produto na posição 0: " + listaProdutos.get(0).getNome());

        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }
    }
}


