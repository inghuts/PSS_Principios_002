package Incorreto;
/**
 *
 * @author Ingrid
 */
public class Aluno extends Pessoa{
    
    private int matricula;

    public Aluno(String nome, String endereco, int matricula) {
        super(nome, endereco);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
    
    @Override
    public String toString() {
        String text = "";
        text += "Aluno: " +getNome()+ "\n";
        text += "Matrícula: " +getMatricula()+ "\n";
        text += "Endereço: " +getEndereco()+ "\n";
        return text;
    } 
    
}
