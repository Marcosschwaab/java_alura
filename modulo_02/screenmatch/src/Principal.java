public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.genero = "Drama";
        meuFilme.anoDeLancamento = 1972;
        meuFilme.incluidoNoPlano = true;


        meuFilme.exibeFichaRTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);

        System.out.println (meuFilme.somaDasAvaliacoes);
        System.out.println (meuFilme.totalDeAvaliacoes);
        System.out.println (meuFilme.mediaDasAvaliacoes());

    }

}
