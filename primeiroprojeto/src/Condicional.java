public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("Filme retô que vale a pena assistir");
        }
        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Pode ver o filme");
        }else {
            System.out.println("Deve pagar para locação");
        }
    }
}
