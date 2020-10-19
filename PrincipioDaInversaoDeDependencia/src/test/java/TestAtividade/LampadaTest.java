package TestAtividade;

import Correto.Botao;
import Correto.Lampada;
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
public class LampadaTest {
    
    public LampadaTest() {
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
    public void CT001() throws Exception{
        Lampada lampada = new Lampada("off");
        Botao botao = new Botao(lampada);
            
        botao.acionar();
        
        String estadoEsperado = "on";
        
        assertEquals(estadoEsperado, lampada.getEstado());
    }
}
