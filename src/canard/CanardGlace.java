package canard;

public class CanardGlace extends Canard {

    /**
     * Permet d'initialiser un Canard de type Glace
     * @param nom Nom du canard
     * @param pv Points de vie du canard
     * @param atk Points d'attaque du canard
     * @param capaciteSpe Capacité spéciale du canard
     */
    public CanardGlace(String nom, int pv, int atk, String capaciteSpe) {
        super(nom, TypeCanard.GLACE, pv, atk, capaciteSpe);
    }

    public void activerCapaciteSpeciale() {

    }
}
