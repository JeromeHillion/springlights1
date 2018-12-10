package fr.jeromegide.tp_springlightV1.impl;

import java.util.Random;

import fr.jeromegide.tp_springlightV1.Eclairage;

/**
 * Implémentation et simulation d'une ampoule à LED dont la durée de vie est
 * très longue et donc la probabilité de panne très faible.
 * 
 * @author fred
 * 
 */
public class AmpouleLed implements Eclairage {

    /**
     * etat de la lampe : 0 éteinte, 10 allumée pleine intensité
     */
    private int etat;

    /**
     * Calcule la probabilité qu'une ampoule tombe en panne
     * 
     * @return 0 l'ampoule fonctione, -1 l'ampoule est en panne
     */
    private int probaPanne() {
        // TODO implémenter la probabilité que l'ampoule LED tombe en panne à
        // l'allumage
        return 0;
    }

    /**
     * Constructeur
     */
    public AmpouleLed() {
        // TODO initialiser la lampe
    }

    /**
     * Allume l'ampoule à pleine puissance
     */
    public void allumer() {
        // TODO gérer la logique d'allumage
    }

    /**
     * Eteint l'ampoule
     */
    public void eteindre() {
        // TODO gérér la logique d'extinction

    }

    /**
     * Augmente l'intensité lumineuse de l'ampoule
     */
    public void intensifier() {
        // TODO gérer la logique d'augmentation de l'intensité
    }

    /**
     * Diminuer l'intensité lumineuse de l'ampoule
     */
    public void diminuer() {
        // TODO gérer la logique de diminution de l'intensité lumineuse
    }

    /**
     * Permet de connaître l'état de l'ampoule
     * 
     * @return l'état de la lampe 0..10 ou -1 si en panne
     */
    public int etat() {
        // TODO retourner l'état effectif de l'ampoule
        return 0;
    }

    /**
     * @return l'état de l'objet sous la forme d'une chaîne de caractères
     */
    public String toString() {
        // TODO retourner dans la chaîne le nom de la classe et l'état de
        // l'ampoule
        return "";

    }

}
