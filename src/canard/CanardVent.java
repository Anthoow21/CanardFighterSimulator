package canard;

public class CanardVent extends Canard {

    /**
     * Permet d'initialiser un Canard de type Vent
     * @param nom Nom du canard
     * @param pv Points de vie du canard
     * @param atk Points d'attaque du canard
     * @param capaciteSpe Capacité spéciale du canard
     */
    public CanardVent(String nom, int pv, int atk, String capaciteSpe) {
        super(nom, TypeCanard.VENT, pv, atk, capaciteSpe);
    }

    public void activerCapaciteSpeciale() {

    }
}
