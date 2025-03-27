package canard;

public class CanardFeu extends Canard {

    public CanardFeu(String nom, TypeCanard type, int pv, int atk, String capaciteSpe) {
        super(nom, type, pv, atk, capaciteSpe);
    }

    public void activerCapaciteSpeciale() {
        atk += 10;
    }
}
