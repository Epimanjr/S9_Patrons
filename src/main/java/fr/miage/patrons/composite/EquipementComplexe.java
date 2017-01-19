
package fr.miage.patrons.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maxime BLAISE
 */
public class EquipementComplexe extends Equipement {
    
    private List<Equipement> listEquipements = new ArrayList<>();

    public EquipementComplexe(String name, double coef, int consommation, boolean fonctionne) {
        super(name, -1, coef, consommation, fonctionne);
    }

    public List<Equipement> getListEquipements() {
        return listEquipements;
    }
    
    public double getPrixTotal() {
        // Initialisation
        double prixTotal = 0;
        prixTotal = this.getCoutTotal() * this.getCoef();
        return prixTotal;
    }
    
    public int getCoutTotal() {
        int coutTotal = 0;
        if (!this.listEquipements.isEmpty()) {
            // On parcourt les équipements et on ajoute son cout
            for (Equipement e : this.listEquipements) {
                coutTotal += e.getPrixTotal();
            }
        }
        return coutTotal;
    }
    
    public int getCout() {
        return this.getCoutTotal();
    }
    
}
