
package fr.miage.patrons.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maxime BLAISE
 * @author Antoine NOSAL
 */
public class EquipementITComplexe extends EquipementIT {
    
    private List<EquipementIT> listEquipements = new ArrayList<>();

    public EquipementITComplexe(String name, double coef, int consommation, boolean fonctionne) {
        super(name, -1, coef, consommation, fonctionne);
    }

    public List<EquipementIT> getListEquipements() {
        return listEquipements;
    }
    
    public double getPrixTotal() {
        // Initialisation
        double prixTotal = 0;
        prixTotal = this.getCoutTotal() * this.getCoef();
        return prixTotal;
    }
    
    public double getCoutTotal() {
        double coutTotal = 0.0;
        if (!this.listEquipements.isEmpty()) {
            // On parcourt les équipements et on ajoute son cout
            for (EquipementIT e : this.listEquipements) {
                coutTotal += e.getPrixTotal();
            }
        }
        return coutTotal;
    }
    
    public double getCout() {
        return this.getCoutTotal();
    }
    
}
