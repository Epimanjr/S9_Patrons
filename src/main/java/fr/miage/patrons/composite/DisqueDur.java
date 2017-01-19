package fr.miage.patrons.composite;

/**
 *
 * @author Antoine NOSAL
 */
public class DisqueDur extends EquipementSimple {

    /**
     * Capacité du disque dur
     */
    private int capacite;

    public DisqueDur(int capacite, String name, int cout, double coef, int consommation, boolean fonctionne) {
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
