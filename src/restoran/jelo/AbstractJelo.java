/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran.jelo;

/**
 *
 * @author Marquez
 */
public abstract class AbstractJelo {
    
    
  //vraca true ako je bar jedan od sastojaka ljut, else --> false 
  public  abstract boolean daLiJeLjuto(); 

  
  //vraca total cenu svih sastojaka jela 
  public abstract int cena();
  


}
