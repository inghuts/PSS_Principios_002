package Correto;
/**
 *
 * @author Ingrid
 */
public class main {
    
    public static void main(String[] args) {
        
        try {
            Funcionario funcionario1 = new Vendedor(1800, 15);
            Funcionario funcionario2 = new Funcionario(){};
            
            funcionario1.setNome("Maria");
            funcionario2.setNome("Joana");
            
            funcionario2.setSalario(2000);
            
            System.out.println(funcionario1);
            System.out.println(funcionario2);

        } catch (RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());

        }
        
    }
}
