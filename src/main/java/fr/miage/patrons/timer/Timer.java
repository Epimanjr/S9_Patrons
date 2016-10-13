package fr.miage.patrons.timer;

import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maxime BLAISE
 * @author Antoine NOSAL
 */
public class Timer implements Runnable {

    private Montre montre;

    public Timer() {
    }

    public Timer(Montre montre) {
        this.montre = montre;
    }

    @Override
    public void run() {
        // TODO
        while (true) {
            GregorianCalendar gc = new GregorianCalendar();
            this.montre.setDate(gc.getTime());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
