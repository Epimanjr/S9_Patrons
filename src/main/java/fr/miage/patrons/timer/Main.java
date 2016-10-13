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
        AfficheurDigitalEn en = new AfficheurDigitalEn(montre);
        
        montre.Attach(fr);
        montre.Attach(en);
        
        Timer timer = new Timer(montre);
        
        timer.run();
        
    }
    
}
