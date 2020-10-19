package Correto;
/**
 *
 * @author Ingrid
 */
public class main {
    
    public static void main(String[] args) {
        
        try {
            Funcionario funcionario = new Funcionario("Maria", "Desenvolvedora", 2200, new CalculoBonus(200));
            Funcionario funcionario2 = new Funcionario("Joana", "Estagiária", 800, new CalculoBonus(150));
            
            funcionario.getCalculoBonus().calcularBonus(funcionario);
            funcionario2.getCalculoBonus().calcularBonus(funcionario2);
            
            System.out.println(funcionario);
            System.out.println(funcionario2);

        } catch (RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());

        }
    }
}
