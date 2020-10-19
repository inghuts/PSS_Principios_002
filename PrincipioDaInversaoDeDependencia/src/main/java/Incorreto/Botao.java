package Incorreto;
/**
 *
 * @author Ingrid
 */
public class Botao {
    
    private Lampada lampada;

    public Botao(Lampada lampada) {
        this.lampada = lampada;
    }
    
    public void acionar() {
        if ("off".equals(lampada.getEstado())) {
            lampada.ligar();
        }else {
            lampada.desligar();
        }
    }
    
}
