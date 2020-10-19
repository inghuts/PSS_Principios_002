package Correto;
/**
 *
 * @author Ingrid
 */
public class main {
    
    public static void main(String[] args) {
        
        try {
            Produto produto1 = new Produto("Livro", 40.00, new DescontoAVista());
            Produto produto2 = new Produto("Caderno", 15.50, new DescontoCartao());
            
            produto1.getCalculaDesconto().calcularDesconto(produto1);
            produto2.getCalculaDesconto().calcularDesconto(produto2);
            
            System.out.println(produto1);
            System.out.println(produto2);

        } catch (RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());

        }
        
    }
}
