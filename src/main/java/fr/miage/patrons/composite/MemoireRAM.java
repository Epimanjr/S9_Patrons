package fr.miage.patrons.composite;

/**
 *
 * @author Antoine NOSAL
 * @author Maxime BLAISE
 */
public class MemoireRAM extends EquipementSimple {

    /**
     * Capacité de la mémoire
     */
    private int capacite;

    public MemoireRAM(int capacite, String name, int cout, double coef, int consommation, boolean fonctionne) {
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
