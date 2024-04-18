public class Main {
    public static void main(String[] args) {
        // Cria um objeto da classe Musica
        Musica minhaMusica = new Musica();

        // Define os atributos da música
        minhaMusica.titulo = "Bohemian Rhapsody";
        minhaMusica.artista = "Queen";
        minhaMusica.anoLancamento = 1975;
        minhaMusica.avaliacao = 0;
        minhaMusica.numAvaliacoes = 0;

        // Exibe a ficha técnica da música
        minhaMusica.exibirFichaTecnica();

        // Avalia a música
        minhaMusica.avaliarMusica(5);

        // Exibe a ficha técnica da música após a avaliação
        minhaMusica.exibirFichaTecnica();

        // Calcula e exibe a média de avaliações
        System.out.println("Média de Avaliações: " + minhaMusica.calcularMediaAvaliacoes());
    }
}
