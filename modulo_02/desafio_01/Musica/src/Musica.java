public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    // Método para exibir a ficha técnica
    void exibirFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + avaliacao);
        System.out.println("Número de Avaliações: " + numAvaliacoes);
    }

    // Método para avaliar a música
    void avaliarMusica(double novaAvaliacao) {
        avaliacao = (avaliacao * numAvaliacoes + novaAvaliacao) / (numAvaliacoes + 1);
        numAvaliacoes++;
    }

    // Método para calcular a média de avaliações
    double calcularMediaAvaliacoes() {
        return avaliacao;
    }
}
