package fr.miage.patrons.timer;

import fr.miage.patrons.abstrait.Observeur;
import java.text.SimpleDateFormat;

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
        // Récupération de l'état de la montre
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
        String state = sdf.format(this.montre.getDate());
        
        // Affichage
        System.out.println("FR " + state);
    }
    
}
