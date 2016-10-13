package fr.miage.patrons.timer;

import Abstrait.Observeur;

/**
 *
 * @author Maxime BLAISE
 * @author Antoine NOSAL
 */
public class AfficheurDigitalEn extends Observeur {

    private Montre montre;
    
    public AfficheurDigitalEn(Montre montre) {
        this.montre = montre;
    }
    
    public void update() {
        
    }
    
}
