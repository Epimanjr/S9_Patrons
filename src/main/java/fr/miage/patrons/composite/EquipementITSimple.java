
package fr.miage.patrons.composite;

/**
 *
 * @author Maxime BLAISE
 * @author Antoine NOSAL
 */
public class EquipementITSimple extends EquipementIT {

    public EquipementITSimple(String name, int cout, double coef, int consommation, boolean fonctionne) {
        super(name, cout, coef, consommation, fonctionne);
    }
    
    public double getPrixTotal() {
        return (this.getCout() * this.getCoef());
    }
    
    public double getCoutTotal() {
        return this.getCout();
    }
    
}
