import br.com.alura.screenmach.calculos.CalculadoraDeTempo;
import br.com.alura.screenmach.modelos.Filme;
import br.com.alura.screenmach.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setGenero("Drama");;
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);


        meuFilme.exibeFichaRTecnica();



        System.out.println("");

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setGenero("Terror");
        lost.setAnoDeLancamento(2010);
        lost.setIncluidoNoPlano(true);
        lost.setTemporadas(3);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(22);
        lost.setAtiva(true);    
        lost.avalia(10);
        lost.avalia(5);    
        lost.avalia(8);

        lost.exibeFichaRTecnica();




        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(lost);
        
        System.out.println( "Total em Minutos: " + calculadora.getTempoTotal());
    }
}
