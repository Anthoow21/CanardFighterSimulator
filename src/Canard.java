/**
 * Classe représentant un Canard avec ses caractéristiques.
 *
 * @author Anthony ENJALBERT & Clément SAURY
 * @version 1.0
 */
public class Canard {

    /** Nom du canard. */
    protected String nom;

    /** Type du canard. */
    protected String type;

    /** Points de vie du canard. */
    protected int pv;

    /** Points d'attaque du canard. */
    protected int atk;

    /** Capacité spéciale du canard. */
    protected String capaciteSpe;

    /**
     * Constructeur de la classe Canard.
     *
     * @param nom Nom du canard
     * @param type Type du canard
     * @param pv Points de vie du canard
     * @param pa Points d'attaque du canard
     * @param capaciteSpe Capacité spéciale du canard
     */
    public Canard(String nom, String type, int pv, int atk, String capaciteSpe) {
        this.nom = nom;
        this.type = type;
        this.pv = pv;
        this.atk = atk;
        this.capaciteSpe = capaciteSpe;
    }
}

