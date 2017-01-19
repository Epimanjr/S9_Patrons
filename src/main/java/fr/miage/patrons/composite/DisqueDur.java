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
    
    public DisqueDur(String name, int prix, int consommation, boolean fonctionne) {
        super(name, prix, consommation, fonctionne);
    }

    public DisqueDur(int capacite, String name, int prix, int consommation, boolean fonctionne) {
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
