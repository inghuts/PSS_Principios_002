package Incorreto;
/**
 *
 * @author Ingrid
 */
public class main {
    
    public static void main(String[] args) {
        
        try {
            Produto produto1 = new Produto("Livro", 45.00, 1);
            Produto produto2 = new Produto("Caderno", 20.50, 2);
            
            produto1.calcularDesconto();
            produto2.calcularDesconto();
            
            System.out.println(produto1);
            System.out.println(produto2);

        } catch (RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());

        }
        
    }
}
