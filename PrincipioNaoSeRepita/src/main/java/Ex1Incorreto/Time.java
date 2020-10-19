package Ex1Incorreto;
/**
 *
 * @author Ingrid
 */
public class Time {
    
    private String nome;
    private String cor;
    private String mascote;

    public Time(String nome, String cor, String mascote) {
        this.nome = nome;
        this.cor = cor;
        this.mascote = mascote;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getMascote() {
        return mascote;
    }
    
    @Override
    public String toString() {
        String text = "";
        text += "Time: " +getNome()+ "\n";
        text += "Cor: " +getCor()+ "\n";
        text += "Mascote: " +getMascote()+ "\n";
        return text;
    }
    
}
