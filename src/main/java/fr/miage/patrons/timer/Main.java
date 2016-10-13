package fr.miage.patrons.timer;

/**
 *
 * @author Maxime BLAISE
 * @author Antoine NOSAL
 */
public class Main {
    
    public static void main(String[] args) {
        
        Montre montre = new Montre();
        
        AfficheurDigitalFr fr = new AfficheurDigitalFr(montre);
        
        montre.Attach(fr);
        
        Timer timer = new Timer(montre);
        
        timer.run();
        
    }
    
}
