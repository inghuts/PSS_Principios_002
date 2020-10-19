package Ex1Incorreto;
/**
 *
 * @author Ingrid
 */
public class Tecnico {
    
    private String nome;
    private int idade;
    private String paisOrigem;

    public Tecnico(String nome, int idade, String paisOrigem) {
        this.nome = nome;
        this.idade = idade;
        this.paisOrigem = paisOrigem;
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
    
    @Override
    public String toString() {
        String text = "";
        text += "Técnico: " +getNome()+ "\n";
        text += "Idade: " +getIdade()+ "\n";
        text += "País de Origem: " +getPaisOrigem()+ "\n";
        return text;
    }
    
}
