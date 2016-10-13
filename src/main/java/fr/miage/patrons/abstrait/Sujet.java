package fr.miage.patrons.abstrait;

import java.util.ArrayList;

/**
 *
 * @author Maxime BLAISE
 * @author Antoine NOSAL
 */
public abstract class Sujet {
    
    private ArrayList<Observeur> observeurs;

    public Sujet() {
        this.observeurs = new ArrayList<>();
    }

    
    public Sujet(ArrayList<Observeur> observeurs) {
        this.observeurs = observeurs;
    }
    
    
    public void Attach(Observeur o) {
        this.observeurs.add(o);
    }
    
    public void Detach(Observeur o) {
        
    }
    
    public void DetachAll() {
        this.observeurs.removeAll(this.observeurs);
    }
    
    public void Notifie() {
        for(Observeur observeur : this.observeurs) {
            observeur.update();
        }
    }
}
