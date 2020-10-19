package Ex1Correto;
/**
 *
 * @author Ingrid
 */
public class Jogador {
    
    private String timeAnterior;
    private Pessoa pessoa;

    public Jogador(Pessoa pessoa, String timeAnterior) {
        this.pessoa = pessoa;
        this.timeAnterior = timeAnterior;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
    
    public String getTimeAnterior() {
        return timeAnterior;
    }
    
    @Override
    public String toString() {
        String text = "";
        text += "Jogador: " +getPessoa().getNome()+ "\n";
        text += "Idade: " +getPessoa().getIdade()+ "\n";
        text += "País de Origem: " +getPessoa().getPaisOrigem()+ "\n";
        text += "Time que jogou anteriormente: " +getTimeAnterior()+ "\n";
        return text;
    }
    
}
