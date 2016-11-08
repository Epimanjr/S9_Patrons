package fr.miage.patrons.timer;

import java.text.SimpleDateFormat;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Maxime BLAISE
 * @author Antoine NOSAL
 */
public class AfficheurDigitalFr implements Observer {

    private Montre montre;

    public AfficheurDigitalFr(Montre montre) {
        this.montre = montre;
    }

    public void update() {
        // Récupération de l'état de la montre
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
        String state = sdf.format(this.montre.getDate());

        // Affichage
        System.out.println("FR " + state);
    }

    @Override
    public void update(Observable o, Object o1) {
        this.update();
    }

}
