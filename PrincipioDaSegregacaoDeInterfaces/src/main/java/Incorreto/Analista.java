package Incorreto;
/**
 *
 * @author Ingrid
 */
public class Analista extends Funcionario{
    
    private double salario;
	
    public Analista(double salario) {
        this.salario = salario;
    }
    
    @Override
    public double getComissao() {
        return 0;
    }
	
    @Override
    public double getSalario() {
        return salario;
    }
    
    @Override
    public String toString() {
        String text = "";
        text += "Funcionário: " +getNome()+ "\n";
        text += "Salário: " +getSalario()+ "\n";
        return text;
    }
    
}
