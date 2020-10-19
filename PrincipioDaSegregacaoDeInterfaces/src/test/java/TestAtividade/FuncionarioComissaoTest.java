package TestAtividade;

import Correto.Funcionario;
import Correto.Vendedor;
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
public class FuncionarioComissaoTest {
    
    public FuncionarioComissaoTest() {
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
        Funcionario funcionario1 = new Vendedor(2000, 160);
        
        double salarioEsperado = 2032.00;
        
        assertEquals(salarioEsperado, funcionario1.getSalario(), 0.01);
    }
}
