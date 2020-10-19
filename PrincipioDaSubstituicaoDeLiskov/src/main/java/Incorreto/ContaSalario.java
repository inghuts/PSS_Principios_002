package Incorreto;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ingrid
 */
public class ContaSalario extends ContaCorrente {
    
    @Override
    public void rende() {
        try {
            throw new Exception("Essa conta não possui rendimento");
        } catch (Exception ex) {
            Logger.getLogger(ContaSalario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
