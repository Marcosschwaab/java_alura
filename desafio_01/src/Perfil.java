public class Perfil {
    public static void main(String[] args) {

        System.out.println("Olá, Marcos Schwaab");
        System.out.println("Tudo bem?");

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
