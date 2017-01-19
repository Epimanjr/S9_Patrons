
package fr.miage.patrons.composite;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Maxime BLAISE
 */
public class Main {
    
    /**
     * Méthode principale, appelée au lancement du programme.
     *
     * param args Arguments.
     */
    public static void main(String[] args) {
        // Construction de composants 
        Batterie batterie = new Batterie(3000, "Bat-XB-2212", 60, 20, true);
        CarteMere carteMere = new CarteMere("CR22_MERE", 150, 40, true);
        DisqueDur disqueDur = new DisqueDur(1000, "DDTOSHI_22", 80, 10, true);
        MemoireRAM ram = new MemoireRAM(2, "RAMRAM_12", 20, 10, true);
        
        // Construction d'un ordinateur
        Ordinateur ordi = new Ordinateur("BlaiseNosal", 20, 10, true);
        // TODO 
        
        // Calcul du prix total
        int prixTotal = ordi.getPrixTotal();
        
        // Affichage du résultat
        System.out.println("Prix total de l'ordinateur : " + prixTotal);
    }
    
}
