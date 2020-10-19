package Incorreto;
/**
 *
 * @author Ingrid
 */
public class main {
    
    public static void main(String[] args) {
        
        try {
            Pessoa aluno = new Aluno("Maria", "Centro, 25", 123456);
            Pessoa professor = new Professor("Joana", "Guararema, 12", 654321);
            
            System.out.println(aluno);
            System.out.println(professor);

        } catch (RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());

        }
        
    }
}
