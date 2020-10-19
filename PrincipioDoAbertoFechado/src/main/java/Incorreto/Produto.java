package Incorreto;
/**
 *
 * @author Ingrid
 */
public class Produto {
    
    private String nome;
    private double valor;
    private int formaPagamento;
    private double desconto = 0;
    private double valorFinal;

    public Produto(String nome, double valor, int formaPagamento) {
        this.nome = nome;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public double getDesconto() {
        return desconto;
    }

    public int getFormaPagamento() {
        return formaPagamento;
    }

    public double getValorFinal() {
        return valorFinal;
    }
    
    public double calcularDesconto() {
        switch(formaPagamento) {
            case 1: 
                //Pagamento à Vista
                desconto = valor * 0.2;
                valorFinal = valor - desconto;
                break;
            case 2:
                //Pagamento parcelado no cartão
                desconto = valor * 0.1;
                valorFinal = valor - desconto;
                break;
        }
        
        return valorFinal;
    }
    
    @Override
    public String toString() {
        String text = "";
        text += "Produto: " +getNome()+ "\n";
        text += "Valor: " +getValor()+ "\n";
        text += "Forma de Pagamento: " +getFormaPagamento()+ "\n";
        text += "Desconto: " +getDesconto()+ "\n";
        text += "Valor Final: " +getValorFinal()+ "\n";
        return text;
    }
    
}
