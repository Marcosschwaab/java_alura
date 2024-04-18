public class Filme {
    String nome;
    String genero;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double avaliacao;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;
 
    void exibeFichaRTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Incluido no plano: " + incluidoNoPlano);
        System.out.println("Avaliação: " + avaliacao);
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }
    double mediaDasAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}

