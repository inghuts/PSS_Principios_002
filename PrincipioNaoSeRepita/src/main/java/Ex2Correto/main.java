package Ex2Correto;
/**
 *
 * @author Ingrid
 */
public class main {
    
    public static void main(String[] args) {
        
        try {
            Sorvete sorvete = new Sorvete();
            
            sorvete.preparaBaunilha();
            
            System.out.println(sorvete);

        } catch (RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());

        }
        
    }
}
