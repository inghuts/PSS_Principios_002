package TestAtividade;

import Correto.ContaSalario;
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
public class ContaTest {
    
    public ContaTest() {
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
        ContaSalario contaSalario = new ContaSalario();
            
        contaSalario.deposita(500);
        
        double saldoEsperado = 500.00;
        
        assertEquals(saldoEsperado, contaSalario.getSaldo(), 0.01);
    }
}
