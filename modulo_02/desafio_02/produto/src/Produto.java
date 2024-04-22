public class Produto {
    private String nome;
    private double preco;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }


    void aplicaDesconto(double porcentagem) {
        this.preco = this.preco - (this.preco * porcentagem / 100);
    }
}
