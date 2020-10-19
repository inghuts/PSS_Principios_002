package testatividade;

import Correto.CalculoBonus;
import Correto.Funcionario;
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
public class FuncionarioBonusTest {
    
    public FuncionarioBonusTest() {
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
        Funcionario funcionario = new Funcionario("Joao", "Desenvolvedor", 2200, new CalculoBonus(250));
        
        funcionario.getCalculoBonus().calcularBonus(funcionario);
        
        double salarioFinalEsperado = 2450.00;
        
        assertEquals(salarioFinalEsperado, funcionario.getCalculoBonus().getSalarioFinal(), 0.01);
    }
}
