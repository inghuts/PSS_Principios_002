package Incorreto;
/**
 *
 * @author Ingrid
 */
public class main {
    
    public static void main(String[] args) {
        
        try {
            Lampada lampada = new Lampada("off");
            Botao botao = new Botao(lampada);
            
            botao.acionar();
    
            System.out.println(lampada);

        } catch (RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());

        }
        
    }
    
}
