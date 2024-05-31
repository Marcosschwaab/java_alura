package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoDeAnoException extends RuntimeException {

    private String mensagem;
    
    public ErroDeConversaoDeAnoException(String mmensagem) {
        this.mensagem = mmensagem;
    }


    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
