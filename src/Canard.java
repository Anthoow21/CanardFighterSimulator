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
     * @param atk Points d'attaque du canard
     * @param capaciteSpe Capacité spéciale du canard
     */
    public Canard(String nom, String type, int pv, int atk, String capaciteSpe) {
        this.nom = nom;
        this.type = type;
        this.pv = pv;
        this.atk = atk;
        this.capaciteSpe = capaciteSpe;
    }

    /**
     * Retourne le nom du canard
     * @return nom
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Retourne les points de vie du canard
     * @return pv
     */
    public int getPointsDeVie() {
        return this.pv;
    }

    /**
     * Retourne les points d'attaques du canard
     * @return atk
     */
    public int getPointsAttaque() {
        return this.atk;
    }

    /**
     * Retourne le type du canard
     * @return type
     */
    public TypeCanard getType() {
        return null; //bouchon
    }

    /**
     * Permet au canard actuel d'attaquer un autre canard
     * @param canard le canard à attaquer
     */
    public void attaquer(Canard canard) {
        int degatCalcule = 0;
        canard.subirDegats(degatCalcule);
    }

    /**
     * Inflige des dégats au canard actuel
     * @param degats dégat subit
     */
    public void subirDegats(int degats) {

    }

    /**
     * Détermine si un canard est KO
     * @return true si il est ko
     *         false sinon
     */
    public boolean estKO() {
        return pv == 0;
    }

}

