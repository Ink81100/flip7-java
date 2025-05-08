package main.modele.jeu;

import java.util.Collections;
import java.util.Stack;

import main.modele.jeu.cartes.CarteChiffre;

/**
 * Paquet représente un jeu de carte
 */
public class Paquet {
    private final Stack<CarteChiffre> paquet = new Stack<CarteChiffre>();

    /**
     * Mélange le paquet
     */
    public void melange() {
        Collections.shuffle(paquet);
    }

    /**
     * Retire et renvois la carte au sommet du paquet
     * 
     * @return la carte au sommet du paquet
     */
    public CarteChiffre pioche() {
        return paquet.pop();
    }

    /**
     * Ajoute une carte au paquet
     * 
     * @param carte la carte à ajouter
     */
    public void ajoute(CarteChiffre carte) {
        paquet.push(carte);
    }

}
