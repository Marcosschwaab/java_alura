import java.util.Scanner;

public class DesafioTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário a temperatura em graus Celsius
        System.out.print("Informe a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();

        // Calcula a temperatura em Fahrenheit
        double fahrenheit = (1.8 * celsius) + 32;

        // Exibe os resultados
        System.out.println("A temperatura informada em Celsius foi: " + celsius + "°C");
        System.out.println("A correspondente em Fahrenheit é: " + fahrenheit + "°F");

        // Cria uma variável inteira para exibir a temperatura em Fahrenheit sem casas decimais
        int fahrenheitInteiro = (int) fahrenheit;
        System.out.println("A temperatura em Fahrenheit (sem casas decimais) é: " + fahrenheitInteiro + "°F");
    }
}