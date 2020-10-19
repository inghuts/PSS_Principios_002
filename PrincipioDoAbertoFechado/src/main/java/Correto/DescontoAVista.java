package Correto;
/**
 *
 * @author Ingrid
 */
public class DescontoAVista implements CalculaDesconto {
    
    private double desconto;
    private double valorFinal;

    public double getDesconto() {
        return desconto;
    }

    public double getValorFinal() {
        return valorFinal;
    }
    
    @Override
    public double calcularDesconto(Produto produto) {
        desconto = produto.getValor() * 0.2;
        valorFinal = produto.getValor() - desconto;
        return valorFinal;   
    }
    
    @Override
    public String toString() {
        String text = "";
        text += "Desconto: " +getDesconto()+ "\n";
        text += "Valor Final: " +getValorFinal()+ "\n";
        return text;
    }
    
}
