package Ex1Correto;
/**
 *
 * @author Ingrid
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    private String paisOrigem;

    public Pessoa(String nome, int idade, String paisOrigem) {
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
    
}
