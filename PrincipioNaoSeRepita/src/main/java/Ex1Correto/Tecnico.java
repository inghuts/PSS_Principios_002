package Ex1Correto;
/**
 *
 * @author Ingrid
 */
public class Tecnico {
    
    private Pessoa pessoa;

    public Tecnico(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
    
    @Override
    public String toString() {
        String text = "";
        text += "Técnico: " +getPessoa().getNome()+ "\n";
        text += "Idade: " +getPessoa().getIdade()+ "\n";
        text += "País de Origem: " +getPessoa().getPaisOrigem()+ "\n";
        return text;
    }
    
}
