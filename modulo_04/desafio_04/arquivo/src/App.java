import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String conteudo = "Conteúdo a ser gravado no arquivo.";

        try (FileWriter writer = new FileWriter("arquivo.txt")) {
            writer.write(conteudo);
            System.out.println("Dados gravados com êxito!");
        } catch (IOException e) {
            System.err.println("Erro ao gravar no arquivo: " + e.getMessage());
        }
    }
}
