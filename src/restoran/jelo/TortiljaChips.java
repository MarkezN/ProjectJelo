/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran.jelo;

import restoran.namirnice.Tortilja;
import restoran.namirnice.Sos;

/**
 *
 * @author lab3 Marquez
 */
public class TortiljaChips extends AbstractJelo {

    private Sos sos;
    private Tortilja chips;

    public TortiljaChips(Sos sos, Tortilja chips) {
        this.sos = sos;
        this.chips = chips;
    }
    public Sos getSos() {
        return sos;
    }
    public void setSos(Sos sos) {
        this.sos = sos;
    }
    public Tortilja getChips() {
        return chips;
    }
    public void setChips(Tortilja chips) {
        this.chips = chips;
    }
    @Override
    public boolean daLiJeLjuto() {
        if (this.sos.isDaLiJeLjuta() || this.chips.isDaLiJeLjuta()) {
            return true;
        }
        return false;
    }
    @Override
    public int cena() {
        return chips.getCena() + sos.getCena();
    }

    @Override
    public String toString() {
        return "Naziv jela: " + "TortiljaChips: " + ", sos: " + this.sos + " , chips: " + this.chips;
    }

}
