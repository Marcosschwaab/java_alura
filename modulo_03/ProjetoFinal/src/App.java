import br.com.alura.desafio.CartaoDeCredito;
import br.com.alura.desafio.Compra;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Compra> compras = new ArrayList<>();
        double limite = 0.0;

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1 - Definir limite do cartão");
            System.out.println("2 - Realizar compra");
            System.out.println("3 - Ver Saldo e compras realizadas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  

            if (opcao == 0) {
                break;
            } else if (opcao == 1) {
                System.out.println("Digite o limite do cartão:");
                limite = scanner.nextDouble();
                scanner.nextLine();  
            } else if (opcao == 2) {
                System.out.println("Digite a descrição da compra:");
                String descricao = scanner.nextLine();

                System.out.println("Digite o valor da compra:");
                double valor = scanner.nextDouble();
                scanner.nextLine();  // Consume newline left-over

                if (valor > limite) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    compras.add(new Compra(descricao, valor));
                    limite -= valor;
                    System.out.println("Compra realizada!");
                }
            } else if (opcao == 3) {
                Collections.sort(compras);

                System.out.println("\nCOMPRAS REALIZADAS:");
                for (Compra compra : compras) {
                    System.out.println(compra);
                }

                System.out.println("\nSaldo do cartão: " + limite);
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}