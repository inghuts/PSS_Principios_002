package Correto;
/**
 *
 * @author Ingrid
 */
public class Carrinho {
    
    private Item item;
    private double valorTotalItems = 0;

    public Carrinho(Item item) {
        this.item = item;
    }

    public double getValorTotalItems() {
        valorTotalItems = item.valorTotal();
        return valorTotalItems;
    }
    
    @Override
    public String toString() {
        String text = "";
        text += item.toString()+ "\n";
        text += "Valor Total: " +getValorTotalItems()+ "\n";
        return text;
    }
    
}
