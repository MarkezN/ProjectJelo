/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran.jelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import restoran.namirnice.Sos;
import restoran.namirnice.Tortilja;

/**
 *
 * @author lab3
 */
public class TortiljaChipsTest {
    protected Sos sosLjuti;
    protected Sos sosBlagi;
    protected Tortilja tortiljaBlaga;
    protected Tortilja tortiljaLjuta;
    
    protected TortiljaChips chips_LjutiSos_TortiljaBlaga;
    protected TortiljaChips chips_LjutiSos_TortiljaLjuta;
    protected TortiljaChips chips_BlagiSos_TortiljaBlaga;
    protected TortiljaChips chips_BlagiSos_TortiljaLjuta;
    
    protected Sos jelSosLjut;
    protected Sos jelSosBlag;
    protected Tortilja jelTortiljaLjuta;
    protected Tortilja jelTortiljaBlaga; 
    
    protected TortiljaChips chips_jelSljut_jelTblaga;
    protected TortiljaChips chips_jelSljut_jelTljuta;
    protected TortiljaChips chips_jelSblag_jelTblaga;
    protected TortiljaChips chips_jelSblag_jelTljuta;
    
    public TortiljaChipsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.sosLjuti = new Sos("ljuti sos", 20, true);
        this.sosBlagi = new Sos("blagi sos", 0, false);
        this.tortiljaLjuta = new Tortilja("ljuti tortilja", 50, true);
        this.tortiljaBlaga = new Tortilja("blagi tortilja", 0, false);
        
        this.chips_BlagiSos_TortiljaBlaga = new TortiljaChips(sosBlagi, tortiljaBlaga);
        this.chips_BlagiSos_TortiljaLjuta = new TortiljaChips(sosBlagi, tortiljaLjuta);
        this.chips_LjutiSos_TortiljaBlaga = new TortiljaChips(sosLjuti, tortiljaBlaga);
        this.chips_LjutiSos_TortiljaLjuta = new TortiljaChips(sosLjuti, tortiljaLjuta);
                
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCene() {
        assertEquals(this.chips_BlagiSos_TortiljaBlaga.cena(), 0);
        assertEquals(this.chips_BlagiSos_TortiljaLjuta.cena(), 50);
        assertEquals(this.chips_LjutiSos_TortiljaBlaga.cena(), 20);
        assertEquals(this.chips_LjutiSos_TortiljaLjuta.cena(), 70);
        
        
    }

    @Test
    public void testLjutine_chips_BlagiSos_TortiljaBlaga(){
        assertEquals(this.chips_BlagiSos_TortiljaBlaga.daLiJeLjuto(), false);
    }
     @Test
    public void testLjutine_chips_BlagiSos_TortiljaLjuta(){
         assertEquals(this.chips_BlagiSos_TortiljaLjuta.daLiJeLjuto(), true);
    }
     @Test
    public void testLjutine_chips_LjutiSos_TortiljaBlaga(){
         assertEquals(this.chips_LjutiSos_TortiljaBlaga.daLiJeLjuto(), true);
    }
     @Test
    public void testLjutine_chips_LjutiSos_TortiljaLjuta(){
         assertEquals(this.chips_LjutiSos_TortiljaLjuta.daLiJeLjuto(), true);
    }
    
    @Test
    public void testLjutine(){
        assertEquals(this.chips_BlagiSos_TortiljaBlaga.daLiJeLjuto(), false);
        assertEquals(this.chips_BlagiSos_TortiljaLjuta.daLiJeLjuto(), true);
        assertEquals(this.chips_LjutiSos_TortiljaBlaga.daLiJeLjuto(), true);
        assertEquals(this.chips_LjutiSos_TortiljaLjuta.daLiJeLjuto(), true);
    }
}
