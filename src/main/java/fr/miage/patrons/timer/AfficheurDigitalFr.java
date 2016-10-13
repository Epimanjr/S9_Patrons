package fr.miage.patrons.timer;

import fr.miage.patrons.abstrait.Observeur;

/**
 *
 * @author Maxime BLAISE
 * @author Antoine NOSAL
 */
public class AfficheurDigitalFr extends Observeur {

    private Montre montre;
    
    public AfficheurDigitalFr(Montre montre) {
        this.montre = montre;
    }
    
    public void update() {
        
    }
    
}
