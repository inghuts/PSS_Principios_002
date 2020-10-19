package Incorreto;
/**
 *
 * @author Ingrid
 */
public class Item {
    
    private double quantidade;
    private Produto produto;

    public Item(Produto produto, double quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }
    
    public double getQuantidade() {
        return quantidade;
    }
    
    @Override
    public String toString() {
        String text = "";
        text += produto.toString()+ "\n";
        text += "Quantidade: " +getQuantidade()+ "\n";
        return text;
    }
    
}
