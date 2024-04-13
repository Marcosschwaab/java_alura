public class Perfil {
    public static void main(String[] args) {

        System.out.println("Olá, Marcos Schwaab");
        System.out.println("Tudo bem?");

        System.out.println("JVM (Java Virtual Machine) - é a Máquina Virtual do Java responsável por executar o bytecode");
        System.out.println("JRE (Java Runtime Environment) - Ambiente de Execução do Java que fornece as bibliotecas padrões do Java para o JDK compilar o seu código e para a JVM executar o seu program");


        new Estudos();
    }
}

class Estudos {
    int numero1 = 10;
    int numero2 = 5;
    int resultado = numero1 + numero2;

    Estudos() {
        System.out.println("A soma é: " + resultado);
    }
}
