package fr.miage.patrons.timer;

import fr.miage.patrons.abstrait.Sujet;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Maxime BLAISE
 * @author Antoine NOSAL
 */
public class Montre extends Sujet {

    private Date date;

    public Montre() {
    }

    public Montre(Date date) {
        this.date = date;
    }

    /**
     * Récupération de la date courante.
     *
     * @return Instance de Date
     */
    public Date getDate() {
        if (this.date == null) {
            GregorianCalendar gc = new GregorianCalendar();
            return gc.getTime();
        } else {
            return this.date;
        }
    }

    public void setDate(Date date) {
        this.date = date;
        this.Notifie();
    }

}
