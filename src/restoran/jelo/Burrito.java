/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran.jelo;

import restoran.namirnice.Tortilja;
import restoran.namirnice.Meso;
import restoran.namirnice.Sir;

/**
 *
 * @author lab3 Marquez
 */
public class Burrito extends ObrokSalata{
    private Tortilja tortilja;

    public Burrito(Tortilja tortilja, Meso meso, Sir sir) {
        super(meso, sir);
        this.tortilja = tortilja;
    }

    
   @Override
    public String toString() {
       return "Naziv jela : " + "Burrito " + ", tortilja: " + this.tortilja;
   }

    
    
    
}
