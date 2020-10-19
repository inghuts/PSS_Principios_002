package Ex2Correto;
/**
 *
 * @author Ingrid
 */
public class Sorvete {
    
    public void preparaBaunilha(){
        System.out.println("Sorvete de baunilha.");
        this.colocaAdicionais();
    }

    public void preparaChocolate(){
        System.out.println("Sorvete de chocolate.");
        this.colocaAdicionais();
    }
    
    public void colocaAdicionais(){
        System.out.println("Colocando cobertura.");
	System.out.println("Colocando granulado.");
    }
       
}
