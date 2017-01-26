
package fr.miage.patrons.composite;

/**
 *
 * @author Maxime BLAISE
 */
public class Batterie extends EquipementITSimple {
    
    /**
     * Capacité de la batterie (en cellules)
     */
    private int capacite;

    public Batterie(int capacite, String name, int cout, double coef, int consommation, boolean fonctionne) {
        super(name, cout, coef, consommation, fonctionne);
        this.capacite = capacite;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
    
    
}
