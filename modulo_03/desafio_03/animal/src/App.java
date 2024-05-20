import br.com.alura.desafio.Animal;
import br.com.alura.desafio.Cachorro;

public class App {

        public static void main(String[] args) {
            // Cria um objeto da classe Cachorro
            Cachorro cachorro = new Cachorro();
    
            // Faz o casting para a classe Animal
            Animal animal = cachorro;
    
            // Verifica se o objeto é do tipo correto antes de fazer o casting
            if (animal instanceof Cachorro) {
                // Faz o casting para a classe Cachorro
                Cachorro outroCachorro = (Cachorro) animal;
    
                // Chama o método fazerBarulho
                outroCachorro.fazerBarulho();
            }
        }
    }