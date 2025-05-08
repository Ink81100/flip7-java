package main.modele;

import java.util.HashSet;

import main.modele.jeu.cartes.CarteChiffre;

public class Joueur {
    private final HashSet<CarteChiffre> mainChiffre = new HashSet<CarteChiffre>();
    private final String nom;
    private int score = 0;

    public Joueur(String nom) {
        this.nom = nom;
    }

    public boolean aDoublons(CarteChiffre carte) {
        return mainChiffre.contains(carte);
    }

    public void pioche(CarteChiffre carte) {
        if (aDoublons(carte)) {
            videMain();
        } else
            videMain();
    }

    /**
     * Calcule et renvoin le score de la main actuelle
     * 
     * @return score de la main actuelle
     */
    public int calculeScoreMain() {
        int total = 0;

        for (CarteChiffre carteChiffre : mainChiffre) {
            total += carteChiffre.getValeur();
        }

        return total;
    }

    /**
     * Ajoute le score de la main a son score
     */
    public void ajouteScore() {
        score += calculeScoreMain();
    }

    /**
     * Vide la main du joueur
     */
    public void videMain() {
        mainChiffre.clear();
    }

    /**
     * Renvois le nom du joueur
     * 
     * @return Le nom du joueur
     */
    public String getNom() {
        return nom;
    }

    /**
     * Renvois le score du joueur
     * 
     * @return Le score du joueur
     */
    public int getScore() {
        return score;
    }

    /**
     * Renvois la main du joueur
     * 
     * @return La main du joueur
     */
    public HashSet<CarteChiffre> getMainChiffre() {
        return mainChiffre;
    }
}
