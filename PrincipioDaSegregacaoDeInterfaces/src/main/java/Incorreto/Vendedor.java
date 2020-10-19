package Incorreto;
/**
 *
 * @author Ingrid
 */
public class Vendedor extends Funcionario {
    
    private double salario;
    private int numVendas;
	
    public Vendedor(double salario, int numVendas) {
        this.salario = salario;
        this.numVendas = numVendas;
    }
    
    @Override
    public double getComissao() {
        return numVendas * 0.2;
    }
	
    @Override
    public double getSalario() {
        return salario + getComissao();
    }
    
    @Override
    public String toString() {
        String text = "";
        text += "Funcionário: " +getNome()+ "\n";
        text += "Comissão: " +getComissao()+ "\n";
        text += "Salário: " +getSalario()+ "\n";
        return text;
    }
    
}
