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
    
    public MemoireRAM(String name, int prix, int consommation, boolean fonctionne) {
        super(name, prix, consommation, fonctionne);
    }

    public MemoireRAM(int capacite, String name, int prix, int consommation, boolean fonctionne) {
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
