package fr.miage.patrons.timer;

import fr.miage.patrons.abstrait.Observeur;
import java.text.SimpleDateFormat;

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
        // Récupération de l'état de la montre
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY KK:mm:ss a");
        String state = sdf.format(this.montre.getDate());
        
        // Affichage
        System.out.println("EN " + state);
    }
    
}
