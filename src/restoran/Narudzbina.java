/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran;

import java.util.ArrayList;
import restoran.jelo.AbstractJelo;

/**
 *
 * @author lab3
 */
public class Narudzbina {

    private ArrayList<AbstractJelo> stavke;

    public Narudzbina() {
        this.stavke = new ArrayList();
    }

    public void dodajStavku(AbstractJelo jelo) {
        this.stavke.add(jelo);
    }

    public int cena() {
        int suma = 0;
        for (AbstractJelo s : stavke) {
            suma += s.cena();
        }
        return suma;
    }

    public String toString() {
        return "" + this.stavke;
    }

}
