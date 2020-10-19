package Correto;
/**
 *
 * @author Ingrid
 */
public abstract class Funcionario implements Convencional {
    
    private String nome;
    private double salario;
    
    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        String text = "";
        text += "Funcionário: " +getNome()+ "\n";
        text += "Salário: " +getSalario()+ "\n";
        return text;
    }
    
}
