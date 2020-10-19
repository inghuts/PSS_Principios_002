package Correto;
/**
 *
 * @author Ingrid
 */
public class main {
    
    public static void main(String[] args) {
        
        try {
            Pessoa pessoa1 = new Pessoa("Maria", "Centro, 2");
            Pessoa pessoa2 = new Pessoa("Joana", "Guararema, 12");
            
            Aluno aluno = new Aluno(pessoa1, 123456);
            Professor professor = new Professor(pessoa2, 654321);
            
            System.out.println(aluno);
            System.out.println(professor);

        } catch (RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());

        }
        
    }
}
