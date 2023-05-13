/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran.namirnice;

/**
 *
 * @author lab3
 */
public abstract class AbstractNamirnica {
   private String naziv;
   private int cena;
   private boolean daLiJeLjuta;
    
    public AbstractNamirnica(String naziv, int cena, boolean daLiJeLjuta) {
        this.naziv = naziv;
        this.cena = cena;
        this.daLiJeLjuta = daLiJeLjuta; 
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public void setCena(int cena) {
        if(cena<0){
            throw new IllegalArgumentException("cena je negativna");
        }
        this.cena = cena;    
    }
    public void setDaLiJeLjuta(boolean daLiJeLjuta) {
        this.daLiJeLjuta = daLiJeLjuta;
    }
    public boolean isDaLiJeLjuta() {
        return daLiJeLjuta;
    }
    public int getCena() {
        return cena;
    }

   @Override public String toString() {
        return "Naziv: " + naziv + ", cena: " + cena  + ", " + isDaLiJeLjuta();
    }      
}
  


