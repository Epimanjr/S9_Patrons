package fr.miage.patrons.timer;

import java.util.Observer;
import java.text.SimpleDateFormat;
import java.util.Observable;

/**
 *
 * @author Maxime BLAISE
 * @author Antoine NOSAL
 */
public class AfficheurDigitalEn implements Observer {

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

    @Override
    public void update(Observable o, Object o1) {
        this.update();
    }
    
}
