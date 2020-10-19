package Ex1Correto;

import java.util.ArrayList;

/**
 *
 * @author Ingrid
 */
public class main {
    
    public static void main(String[] args) {
        
        try {
            Time time = new Time("Flamengo", "Vermelho", "Urubu");
            
            Pessoa pessoa1 = new Pessoa("Joao", 19, "Brasil");
            Pessoa pessoa2 = new Pessoa("Andre", 25, "Brasil");
            Pessoa pessoa3 = new Pessoa("Marcos", 30, "Brasil");
            Pessoa pessoa4 = new Pessoa("Julio", 48, "Brasil");
            
            ArrayList<Jogador> jogadores = new ArrayList<>();
            jogadores.add(new Jogador(pessoa1, "Fluminense"));
            jogadores.add(new Jogador(pessoa2, "Vasco"));
            jogadores.add(new Jogador(pessoa3, "Vasco"));
            
            Tecnico tecnico = new Tecnico(pessoa4);
            
            System.out.println(time);
            for (Jogador jogador : jogadores) {
                System.out.println(jogador);
            }
            System.out.println(tecnico);

        } catch (RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());

        }
        
    }
}
