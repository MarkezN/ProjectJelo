/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran;

import restoran.jelo.ObrokSalata;
import restoran.namirnice.Meso;
import restoran.namirnice.Salata;
import restoran.namirnice.Sir;
import restoran.namirnice.Sos;
import restoran.namirnice.Tortilja;

/**
 *
 * @author lab3
 */
public class Restoran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sos s = new Sos("soja", 20, false);
        Salata sal = new Salata("zelena", 5, false);
        Sir moz = new Sir("mozarela", 10, false);
        Meso pilece = new Meso("pilece", 10, true);
        
        ObrokSalata pileca = new ObrokSalata(pilece, moz); 
        pileca.dodajSos(s);
           
        Narudzbina n1 = new Narudzbina();
        n1.dodajStavku(pileca);
        n1.cena();
        System.out.println(n1.toString());
        System.out.println(n1.cena());
        System.out.println(pileca.daLiJeLjuto());
    }
    
}
