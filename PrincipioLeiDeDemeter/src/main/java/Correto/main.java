package Correto;
/**
 *
 * @author Ingrid
 */
public class main {
    
    public static void main(String[] args) {
        
        try {
            Produto produto = new Produto("Arroz", 20.80);
            
            Item item = new Item(produto, 3);
            
            Carrinho carrinho = new Carrinho(item);
            
            System.out.println(carrinho);

        } catch (RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());

        }
        
    }
}
