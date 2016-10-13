package fr.miage.patrons.timer;

import java.util.ArrayList;

/**
 *
 * @author Maxime BLAISE
 * @author Antoine NOSAL
 */
public class Sujet {
    
    private ArrayList<Observeur> observeurs;
    
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
