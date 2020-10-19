/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestAtividade;

import Correto.DescontoAVista;
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
public class ProdutoDescontoTest {
    
    public ProdutoDescontoTest() {
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
        Produto produto = new Produto("Tapete", 85.00, new DescontoAVista());
        
        produto.getCalculaDesconto().calcularDesconto(produto);
        
        double valorComDescontoEsperado = 68.00;
        
        assertEquals(valorComDescontoEsperado, produto.getCalculaDesconto().getValorFinal(), 0.01);
        
        
    }
}
