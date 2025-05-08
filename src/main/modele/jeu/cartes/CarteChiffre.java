package main.modele.jeu.cartes;

public class CarteChiffre {
    private final int valeur;

    public CarteChiffre(int valeur) {
        this.valeur = valeur;
    }

    /*
     * Renvois la valeur d'une carte chiffre
     */
    public int getValeur() {
        return valeur;
    }

    @Override
    public String toString() {
        return Integer.toString(valeur);
    }

    @Override
    public int hashCode() {
        return valeur;
    }
}
