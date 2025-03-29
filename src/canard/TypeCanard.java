package canard;

/**
 * Représente les différents types de canards du jeu Canard Fighter Simulator.
 * Chaque type possède des forces et des faiblesses par rapport aux autres types.
 */
public enum TypeCanard {
    NORMAL, EAU, FEU, GLACE, VENT;

    /**
     * Retourne le multiplicateur de dégâts en fonction des forces et des faiblesses de chaque types.
     *
     * @param attaquant Le type du canard attaquant.
     * @param cible Le type du canard ciblé.
     * @return Un multiplicateur de dégâts :
     *     1.5 si l'attaquant a l'avantage.
     *     0.5 si l'attaquant est désavantagé.
     *     1.0 si les types sont neutres entre eux.
     */
    public static double getMultiplicateur(TypeCanard attaquant, TypeCanard cible) {

        double fort = 1.5;
        double faible = 0.5;
        double neutre = 1.0;

        if (attaquant == EAU && cible == FEU)
            return fort;
        if (attaquant == FEU && cible == GLACE)
            return fort;
        if (attaquant == GLACE && cible == VENT)
            return fort;
        if (attaquant == VENT && cible == EAU)
            return fort;

        if (attaquant == FEU && cible == EAU)
            return faible;
        if (attaquant == GLACE && cible == FEU)
            return faible;
        if (attaquant == VENT && cible == GLACE)
            return faible;
        if (attaquant == EAU && cible == VENT)
            return faible;

        return neutre;
    }
}



