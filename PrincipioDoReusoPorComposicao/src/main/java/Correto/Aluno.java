package Correto;
/**
 *
 * @author Ingrid
 */
public class Aluno{
    
    private int matricula;
    private Pessoa pessoa;

    public Aluno(Pessoa pessoa, int matricula) {
        this.pessoa = pessoa;
        this.matricula = matricula;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    @Override
    public String toString() {
        String text = "";
        text += "Aluno: " +pessoa.getNome()+ "\n";
        text += "Matrícula: " +getMatricula()+ "\n";
        text += "Endereço: " +pessoa.getEndereco()+ "\n";
        return text;
    } 
    
}
