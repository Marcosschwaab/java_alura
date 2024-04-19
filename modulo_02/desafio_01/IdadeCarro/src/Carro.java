public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int calculaIdade() {
        return 2024 - ano;
    }

    void ipva(){
        if (calculaIdade() <= 20) {
            System.out.println("Veículo paga IPVA");
        } else {
            System.out.println("Veículo não paga mais IPVA");
        }
    }
}