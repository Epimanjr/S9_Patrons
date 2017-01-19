
package fr.miage.patrons.composite;

/**
 *
 * @author Maxime BLAISe
 */
public class EquipementSimple extends Equipement {

    public EquipementSimple(String name, int cout, double coef, int consommation, boolean fonctionne) {
        super(name, cout, coef, consommation, fonctionne);
    }
    
    public double getPrixTotal() {
        return (this.getCout() * this.getCoef());
    }
    
}
