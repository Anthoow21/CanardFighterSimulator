package canard;

public class CanardEau extends Canard {

    /**
     * Permet d'initialiser un Canard de type Eau
     * @param nom Nom du canard
     * @param pv Points de vie du canard
     * @param atk Points d'attaque du canard
     * @param capaciteSpe Capacité spéciale du canard
     */
    public CanardEau(String nom, int pv, int atk, String capaciteSpe) {
        super(nom, TypeCanard.EAU, pv, atk, capaciteSpe);
    }

    /**
     * Capacité spéciale permettant de regénérer 20 pv au canard
     */
    public void activerCapaciteSpeciale() {
        pv += 20;
    }

}
