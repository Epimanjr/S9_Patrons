package fr.miage.patrons.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maxime BLAISE
 * @author Antoine NOSAL
 */
public abstract class EquipementIT implements Equipement {

    /**
     * Nom de l'équipement
     */
    private String name;

    /**
     * Cout d'achat/production de l'équipement
     */
    private double cout;
    
    /**
     * Coefficient multiplicateur
     */
    private double coef;

    /**
     * Consommation de l'équipement
     */
    private int consommation;

    /**
     * VRAI si fonctionne, sinon FAUX.
     */
    private boolean fonctionne;

    public EquipementIT(String name, int cout, double coef, int consommation, boolean fonctionne) {
        this.name = name;
        this.cout = cout;
        this.coef = coef;
        this.consommation = consommation;
        this.fonctionne = fonctionne;
    }

    public abstract double getPrixTotal();
    
    public abstract double getCoutTotal();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCout() {
        return cout;
    }

    public void setCout(double cout) {
        this.cout = cout;
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

    public double getCoef() {
        return coef;
    }

    public void setCoef(double coef) {
        this.coef = coef;
    }

}
