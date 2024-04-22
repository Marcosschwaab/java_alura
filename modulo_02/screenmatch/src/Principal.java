import br.com.alura.screenmach.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setGenero("Drama");;
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setIncluidoNoPlano(true);



        meuFilme.exibeFichaRTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println ("Total de avaliacoes: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println (meuFilme.mediaDasAvaliacoes());

    }

}
