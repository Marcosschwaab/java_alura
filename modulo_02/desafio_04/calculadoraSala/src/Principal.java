import br.com.alura.desafios.CalculadoraSalaRetangular;

public class Principal {
    public static void main(String[] args)  {
        double altura = 5.0;
        double largura = 4.0;

        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular(altura, largura);

        double area = calculadora.calcularArea();
        double perimetro = calculadora.calcularPerimetro();

        System.out.println("A área da sala é: " + area + " metros quadrados");
        System.out.println("O perímetro da sala é: " + perimetro + " metros");    
    }
}
