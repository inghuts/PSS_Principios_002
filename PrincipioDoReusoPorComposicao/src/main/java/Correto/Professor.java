package Correto;
/**
 *
 * @author Ingrid
 */
public class Professor {
    
    private int siape;
    private Pessoa pessoa;

    public Professor(Pessoa pessoa, int siape) {
        this.pessoa = pessoa;
        this.siape = siape;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public int getSiape() {
        return siape;
    }
    
    @Override
    public String toString() {
        String text = "";
        text += "Professor: " +pessoa.getNome()+ "\n";
        text += "Matrícula SIAPE: " +getSiape()+ "\n";
        text += "Endereço: " +pessoa.getEndereco()+ "\n";
        return text;
    }
    
}
