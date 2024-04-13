import java.util.Scanner;

public class CalculaArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção:\n1. Calcular área do quadrado\n2. Calcular área do círculo\n3. Sair");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Digite o lado do quadrado:");
            double lado = scanner.nextDouble();
            double area = lado * lado;
            System.out.println("A área do quadrado é " + area);
        } else if (opcao == 2) {
            System.out.println("Digite o raio do círculo:");
            double raio = scanner.nextDouble();
            double area = Math.PI * raio * raio;
            System.out.println("A área do círculo é " + area);
        } else if (opcao == 3) {
            System.out.println("Programa encerrado.");
        } else {
            System.out.println("Opção inválida");
        }
    }
}
