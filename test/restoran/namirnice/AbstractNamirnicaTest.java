/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran.namirnice;

import restoran.namirnice.AbstractNamirnica;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab3
 */
public class AbstractNamirnicaTest {
    
    public AbstractNamirnicaTest() {
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

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSetCena() {
       TestNamirnica namirnica = new TestNamirnica("namirnica", 100, true);
       namirnica.setCena(-1);
    }
    
     @Test
    public void testBesplatnoSetCena() {
       TestNamirnica namirnica = new TestNamirnica("namirnica", 100, true);
       namirnica.setCena(0);
       assertEquals(namirnica.getCena(), 0);
    }
    
      @Test
    public void testKostaSetCena() {
       TestNamirnica namirnica = new TestNamirnica("namirnica", 100, true);
       namirnica.setCena(25);
       assertEquals(namirnica.getCena(), 25);
    }
    
    
    
    
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeConstructCena() {
       TestNamirnica namirnica = new TestNamirnica("namirnica", -1, true);
    }
    
     @Test
    public void testBesplatnoConstructCena() {
       TestNamirnica namirnica = new TestNamirnica("namirnica", 0, true);
      
       assertEquals(namirnica.getCena(), 0);
    }
    
      @Test
    public void testKostaConstructCena() {
       TestNamirnica namirnica = new TestNamirnica("namirnica", 25, true);
      
       assertEquals(namirnica.getCena(), 25);
    }
    
    
    
    
    
    public class TestNamirnica extends AbstractNamirnica {

        public TestNamirnica(String naziv, int cena, boolean daLiJeLjuta) {
            super(naziv, cena, daLiJeLjuta);
        }

      
    }
    
}
