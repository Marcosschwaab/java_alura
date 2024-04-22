public class App {
    public static void main(String[] args)  {

        Produto p1 = new Produto(); 
        p1.setNome("TV 50 polegadas");
        p1.setPreco(1999.00);
        p1.aplicaDesconto(5);
        System.out.println(p1.getNome() + " - R$" + p1.getPreco());
    }
}
