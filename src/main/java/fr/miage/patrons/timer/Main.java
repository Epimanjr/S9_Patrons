package fr.miage.patrons.timer;

/**
 *
 * @author Maxime BLAISE
 * @author Antoine NOSAL
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Lancement du programme");
        
        Montre montre = new Montre();

        AfficheurDigitalFr fr = new AfficheurDigitalFr(montre);
        AfficheurDigitalEn en = new AfficheurDigitalEn(montre);

        montre.addObserver(fr);
        montre.addObserver(en);

        /* Timer timer = new Timer(montre);
        timer.run();*/
        Thread t = new Thread(new Timer(montre));
        t.start();

    }

}
