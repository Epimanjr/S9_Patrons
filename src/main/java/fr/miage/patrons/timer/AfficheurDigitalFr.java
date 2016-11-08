package fr.miage.patrons.timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Maxime BLAISE
 * @author Antoine NOSAL
 */
public class AfficheurDigitalFr implements Observer {


    public void update(Date date) {
        // Récupération de l'état de la montre
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
        String state = sdf.format(date);

        // Affichage
        System.out.println("FR " + state);
    }

    /*
    @Override
    public void update(Observable o, Object o1) {
        this.update(((Montre)o).getDate());
    }
    */
    
    public void update(Observable o, Object o1) {
        this.update((Date)o1);
    }
}
