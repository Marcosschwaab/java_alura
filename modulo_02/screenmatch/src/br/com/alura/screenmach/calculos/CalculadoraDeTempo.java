package br.com.alura.screenmach.calculos;
import br.com.alura.screenmach.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
    
    // public void inclui(Filme f){
    //     tempoTotal += f.getDuracaoEmMinutos();

    // }
    // public void inclui(Serie l){
    //     tempoTotal += l.getDuracaoEmMinutos();

    // }
    public void inclui(Titulo t){
        tempoTotal += t.getDuracaoEmMinutos();
    }
}
