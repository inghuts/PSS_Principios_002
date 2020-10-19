package Incorreto;
/**
 *
 * @author Ingrid
 */
public class ContaCorrente {
    
    private double saldo;

    public ContaCorrente() {
        this.saldo = 0;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }
    
    public void saca(double valor) {
    	if(valor <= this.saldo) {
    	     this.saldo -= valor;
    	}else{
    	     throw new IllegalArgumentException("Saldo insuficiente.");
    	}
    }

    public void rende()      {
        this.saldo = saldo + (saldo * 0.02);
    } 
    
    @Override
    public String toString() {
        return "Saldo: " +getSaldo()+ "\n";
    }
    
}
