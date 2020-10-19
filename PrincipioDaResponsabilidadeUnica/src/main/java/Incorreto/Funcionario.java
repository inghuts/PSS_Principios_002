package Incorreto;
/**
 *
 * @author Ingrid
 */
public final class Funcionario {
    
    private String nome;
    private double bonus = 100.00;
    private double salario;
    private String cargo;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public double calculaSalario() {
        return this.salario = salario + bonus;
    }

    @Override
    public String toString() {
        String text = "";
        text += "Funcionário: " +getNome()+ "\n";
        text += "Cargo: " +getCargo()+ "\n";
        text += "Salário Com Bônus: " +getSalario()+ "\n";
        return text;
    }
    
}
