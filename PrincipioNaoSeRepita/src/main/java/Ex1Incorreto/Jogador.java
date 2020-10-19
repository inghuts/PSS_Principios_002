package Ex1Incorreto;
/**
 *
 * @author Ingrid
 */
public class Jogador {
    
    private String nome;
    private int idade;
    private String paisOrigem;
    private String timeAnterior;

    public Jogador(String nome, int idade, String paisOrigem, String timeAnterior) {
        this.nome = nome;
        this.idade = idade;
        this.paisOrigem = paisOrigem;
        this.timeAnterior = timeAnterior;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public String getTimeAnterior() {
        return timeAnterior;
    }
    
    @Override
    public String toString() {
        String text = "";
        text += "Jogador: " +getNome()+ "\n";
        text += "Idade: " +getIdade()+ "\n";
        text += "País de Origem: " +getPaisOrigem()+ "\n";
        text += "Time que jogou anteriormente: " +getTimeAnterior()+ "\n";
        return text;
    }
    
}
