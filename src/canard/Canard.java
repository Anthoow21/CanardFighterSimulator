package canard;

/**
 * Classe représentant un Canard avec ses caractéristiques.
 *
 * @author Anthony ENJALBERT & Clément SAURY
 * @version 1.0
 */
public class Canard {

    // Nom du canard
    protected String nom;

    // Type du canard
    protected TypeCanard type;

    // Points de vie du canard
    protected int pv;

    // Points d'attaque du canard
    protected int atk;

    // Capacité spéciale du canard
    protected String capaciteSpe;


    /**
     * Permet d'initialiser un Canard de type Normal
     *
     * @param nom Nom du canard
     * @param pv Points de vie du canard
     * @param atk Points d'attaque du canard
     * @param capaciteSpe Capacité spéciale du canard
     */
    public Canard(String nom, int pv, int atk, String capaciteSpe) {
        this.nom = nom;
        this.type = TypeCanard.NORMAL;
        this.pv = pv;
        this.atk = atk;
        this.capaciteSpe = capaciteSpe;
    }

    /**
     * Permet d'initialiser un Canard avec un type définit
     * @param nom Nom du canard
     * @param type Type du canard
     * @param pv Points de vie du canard
     * @param atk Points d'attaque du canard
     * @param capaciteSpe Capacité spéciale du canard
     */
    public Canard(String nom, TypeCanard type, int pv, int atk, String capaciteSpe) {
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
        return this.type;
    }

    /**
     * Permet au canard actuel d'attaquer un autre canard
     * @param canard le canard à attaquer
     */
    public void attaquer(Canard canard) {
        int degatCalcule = this.atk;
        double multiplicateur = TypeCanard.getMultiplicateur(this.type, canard.type);
        degatCalcule *= (int) multiplicateur;

        canard.subirDegats(degatCalcule);
    }

    /**
     * Inflige des dégats au canard actuel
     * @param degats dégat subit
     */
    public void subirDegats(int degats) {
        // Permet d'éviter que le canard ait des pv négatifs (et donc renvoie false sur la méthode estKO)
        if(this.pv < 0) {
            this.pv = 0;
        } else {
            this.pv -= degats;
        }
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

