package Ex1Incorreto;

import java.util.ArrayList;

/**
 *
 * @author Ingrid
 */
public class main {
    
    public static void main(String[] args) {
        
        try {
            Time time = new Time("Flamengo", "Vermelho", "Urubu");
            
            ArrayList<Jogador> jogadores = new ArrayList<>();
            jogadores.add(new Jogador("Joao", 19, "Brasil", "Fluminense"));
            jogadores.add(new Jogador("Andre", 25, "Brasil", "Vasco"));
            jogadores.add(new Jogador("Marcos", 30, "Brasil", "Vasco"));
            
            Tecnico tecnico = new Tecnico("Julio", 48, "Brasil");
            
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
