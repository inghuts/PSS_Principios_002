package TestAtividade;

import Correto.Aluno;
import Correto.Pessoa;
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
public class PessoaTest {
    
    public PessoaTest() {
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
        Pessoa pessoa = new Pessoa("Ana", "Centro, 25");
        Aluno aluno = new Aluno(pessoa, 123456);
        
        int matriculaEsperada = 123456;
        String nomeEsperado = "Ana";
        
        assertEquals(nomeEsperado, aluno.getPessoa().getNome());
        assertEquals(matriculaEsperada, aluno.getMatricula());
    }
}
