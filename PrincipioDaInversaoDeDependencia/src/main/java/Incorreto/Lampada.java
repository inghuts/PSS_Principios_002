package Incorreto;
/**
 *
 * @author Ingrid
 */
public class Lampada {
    
    private String estado;

    public Lampada(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
    
    public void ligar() {
        estado = "on";
    }
    
    public void desligar() {
        estado = "off";
    }
    
    @Override
    public String toString() {
        return "Estado: " +getEstado()+ "\n";
    }
    
}
