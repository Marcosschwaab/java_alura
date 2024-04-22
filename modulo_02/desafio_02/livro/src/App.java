public class App {
    public static void main(String[] args) {
    
        Livro livro = new Livro("Autor", "Título");

        livro.exibirDetalhes();

        Livro livro2 = new Livro("Harry Potter", "Harry Potter e o Prisioneiro de Azkaban"); 

        livro2.exibirDetalhes();

    }
}
