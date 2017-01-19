
package fr.miage.patrons.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maxime BLAISE
 */
public class Equipement {
    
    /**
     * Pour gérer la récursivité.
     */
    private final List<Equipement> listEquipements = new ArrayList<>();
    
    /**
     * Nom de l'équipement
     */
    private String name;
    
    /**
     * Prix de l'équipement
     */
    private int prix;
    
    /**
     * Consommation de l'équipement
     */
    private int consommation;
    
    /**
     * VRAI si fonctionne, sinon FAUX.
     */
    private boolean fonctionne;

    public Equipement(String name, int prix, int consommation, boolean fonctionne) {
        this.name = name;
        this.prix = prix;
        this.consommation = consommation;
        this.fonctionne = fonctionne;
    }

    public List<Equipement> getListEquipements() {
        return listEquipements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getConsommation() {
        return consommation;
    }

    public void setConsommation(int consommation) {
        this.consommation = consommation;
    }

    public boolean isFonctionne() {
        return fonctionne;
    }

    public void setFonctionne(boolean fonctionne) {
        this.fonctionne = fonctionne;
    }
    
    
}
