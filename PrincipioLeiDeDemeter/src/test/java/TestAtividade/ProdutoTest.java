package TestAtividade;

import Correto.Carrinho;
import Correto.Item;
import Correto.Produto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ingrid
 */
public class ProdutoTest {
    
    public ProdutoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void CT001() throws Exception {
        Produto produto = new Produto("Macarrão", 4.60);
        Item item = new Item(produto, 3);
        Carrinho carrinho = new Carrinho(item);
        
        double valorTotalEsperado = 13.80;
        
        assertEquals(valorTotalEsperado, carrinho.getValorTotalItems(), 0.01);
    }
}
