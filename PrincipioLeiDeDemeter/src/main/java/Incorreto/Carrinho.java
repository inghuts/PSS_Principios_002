package Incorreto;
/**
 *
 * @author Ingrid
 */
public class Carrinho {
    
    private Item item;
    private double valorTotal = 0;

    public Carrinho(Item item) {
        this.item = item;
    }

    public double getValorTotal() {
        valorTotal = item.getProduto().getValor()*item.getQuantidade();
        return valorTotal;
    }
    
    @Override
    public String toString() {
        String text = "";
        text += item.toString()+ "\n";
        text += "Valor Total: " +getValorTotal()+ "\n";
        return text;
    }
    
}
