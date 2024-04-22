public class App {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Lulu", 7.5, 8.0, 9.2);
        Aluno aluno2 = new Aluno("Karina", 6.8, 7.3, 8.5);
        
        
        System.out.println("Nome: " + aluno1.getNome());
        aluno1.mediaDoAluno();



        System.out.println("Nome: " + aluno2.getNome());
        aluno2.mediaDoAluno();
    }
}
