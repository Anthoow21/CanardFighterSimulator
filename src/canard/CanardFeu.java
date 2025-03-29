package canard;

public class CanardFeu extends Canard {

    /**
     * Permet d'initialiser un Canard de type Feu
     * @param nom Nom du canard
     * @param pv Points de vie du canard
     * @param atk Points d'attaque du canard
     * @param capaciteSpe Capacité spéciale du canard
     */
    public CanardFeu(String nom, int pv, int atk, String capaciteSpe) {
        super(nom, TypeCanard.FEU, pv, atk, capaciteSpe);
    }

    /**
     * Capacité spéciale permettant d'augmenter la force d'attaque du canard de 10
     * (cette capacité est ensuite désactivé via la méthode "desactiverCapaciteSpeciale"
     */
    public void activerCapaciteSpeciale() {
        atk += 10;
    }

    /**
     * Permet de remettre la force d'attaque du canard à sa force initiale
     */
    public void desactiverCapaciteSpeciale() {
        atk -= 10;
    }
}
