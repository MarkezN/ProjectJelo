/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran.jelo;

import restoran.namirnice.Meso;
import restoran.namirnice.Sos;
import restoran.namirnice.Sir;
import restoran.namirnice.Salata;
import java.util.ArrayList;

/**
 *
 * @author Marquez
 */
public class ObrokSalata extends AbstractJelo {

    private Meso meso;
    private Sir sir;
    private ArrayList<Sos> sosevi;
    private ArrayList<Salata> salate;

    public ObrokSalata(Meso meso, Sir sir) {
        this.meso = meso;
        this.sir = sir;
        this.sosevi = new ArrayList();
        this.salate = new ArrayList();
    }

    public void dodajSos(Sos sos) {
        this.sosevi.add(sos);
    }

    public void dodajSalatu(Salata salata) {
        this.salate.add(salata);
    }
    
    public boolean isSosLjut() {
        for(Sos s : this.sosevi) {
            if(s.isDaLiJeLjuta()) {
                return true;
            }
        }
        return false;
    }
   public boolean isSalataLjut() {
       for(Salata s : this.salate) {
            if(s.isDaLiJeLjuta()) {
                return true;
            }
        }
        return false;
   }
    @Override
    public boolean daLiJeLjuto() {
        if(isSosLjut() || isSalataLjut() || this.meso.isDaLiJeLjuta() || this.sir.isDaLiJeLjuta()) {
         
            return true;
            
        }
        return false;
    }

    public int cenaSos() {
        int c = 0;
        for (Sos s : sosevi) {
            c += s.getCena();
        }
        return c;
    }

    public int cenaSalata() {
        int c = 0;
        for (Salata s : this.salate) {
            c += s.getCena();
        }
        return c;
    }

    @Override
    public int cena() {
        return this.meso.getCena() + this.sir.getCena() + this.cenaSos() + this.cenaSalata();
    }

    @Override
    public String toString() {
        return "Naziv jela: " + "ObrokSalata " + ", meso: " + meso + ", sir: " + sir + ", sosevi: " + this.sosevi + " , salate: " + this.salate;
    }

}
