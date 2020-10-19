package Incorreto;
/**
 *
 * @author Ingrid
 */
public class Professor extends Pessoa {
    
    private int siape;

    public Professor(String nome, String endereco, int siape) {
        super(nome, endereco);
        this.siape = siape;
    }

    public int getSiape() {
        return siape;
    }
    
    @Override
    public String toString() {
        String text = "";
        text += "Professor: " +getNome()+ "\n";
        text += "Matrícula SIAPE: " +getSiape()+ "\n";
        text += "Endereço: " +getEndereco()+ "\n";
        return text;
    }
    
}
