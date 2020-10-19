package Incorreto;
/**
 *
 * @author Ingrid
 */
public class main {
    
    public static void main(String[] args) {
        
        try {
            Funcionario funcionario = new Funcionario("Maria", "Desenvolvedora", 2200);
            
            funcionario.calculaSalario();
            
            System.out.println(funcionario);

        } catch (RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());

        }
        
    }
}
