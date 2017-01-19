
package fr.miage.patrons.composite;

/**
 *
 * @author Maxime BLAISE
 */
public class Batterie extends Equipement {
    
    /**
     * Capacité de la batterie (en cellules)
     */
    private int capacite;
    
    public Batterie(String name, int prix, int consommation, boolean fonctionne) {
        super(name, prix, consommation, fonctionne);
    }

    public Batterie(int capacite, String name, int prix, int consommation, boolean fonctionne) {
        super(name, prix, consommation, fonctionne);
        this.capacite = capacite;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
    
    
}
