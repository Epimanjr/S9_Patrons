
package fr.miage.patrons.timer;

/**
 *
 * @author Maxime BLAISE
 * @author Antoine NOSAL
 */
public class Timer implements Runnable{

    private Montre montre;

    public Timer() {
    }

    public Timer(Montre montre) {
        this.montre = montre;
    }
    
    
    @Override
    public void run() {
        // TODO
    }
    
}
