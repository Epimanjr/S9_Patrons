
package fr.miage.patrons.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maxime BLAISE
 */
public class EquipementComplexe extends Equipement {
    
    private List<Equipement> listEquipements = new ArrayList<>();
    
    public EquipementComplexe(String name, int prix, int consommation, boolean fonctionne) {
        super(name, prix, consommation, fonctionne);
    }

    public List<Equipement> getListEquipements() {
        return listEquipements;
    }
    
    
}
