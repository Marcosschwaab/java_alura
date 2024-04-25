import br.com.alura.desafios.ConversorMoeda;

public class Principal {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        double valorDolar = 10.0;
        double valorReal = conversor.converterDolarParaReal(valorDolar);
        System.out.println("O valor de " + valorDolar + " dólares em reais é: " + valorReal);            
    }
}
