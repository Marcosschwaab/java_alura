import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroGerado = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.println("Digite um número entre 0 e 100:");
            int numeroUsuario = scanner.nextInt();
            tentativas++;

            if (numeroUsuario == numeroGerado) {
                System.out.println("Parabéns! Você acertou o número!");
                break;
            } else if (numeroUsuario < numeroGerado) {
                System.out.println("O número digitado é menor do que o número gerado.");
            } else {
                System.out.println("O número digitado é maior do que o número gerado.");
            }

            if (tentativas == 5) {
                System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + numeroGerado + ".");
            }
        }

        scanner.close();
    }
}
