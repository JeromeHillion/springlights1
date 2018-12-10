package fr.jeromegide.tp_springlightV1.impl;

import fr.jeromegide.tp_springlightV1.Eclairage;

import java.util.Random;

/**
 * On créer une classe ampoule qui implémente l'interface de l'éclairage
 **/
public class Ampoule implements Eclairage {

    protected int etat;
    protected Double chance;

    /**
     * l'attribut chance change en focntion de l'ampoule
     **/

    protected int probaPanne() {
/** La méthode Random.nextInt :
 La méthode Random.nextInt retourne un nombre aléatoire de type int supérieure ou égal à 0 et inférieur au nombre entier passé en paramètre.
 Ce dernier doit être supérieure à 0, sans quoi il y aura levée d'une IllegalArgumentException. **/
        Random alea = new Random();
        if (alea.nextInt(100) < chance) {
            return -1;
        } else {
            return 0;
        }
    }

    public Ampoule() {
        etat = 0;
    }

    /** Pour la méthode allumer : si l'état et la probapanne different de -1, alors on met à 10**/
    public void allumer(){
        if (etat != -1 && probaPanne() != -1){
            etat = 10;
        }
        else{
            etat = -1;
        }
    }
/** Pour la méthode eteindre: si l'état est !=1 on renvoie l'état = 0 **/
    public void eteindre(){
        if (etat != -1 ){
            etat = 0;
        }
    }

    /** Pour la méthode intensifier: on incrémente de 1 si l'état est différent de -1 et de 10 **/
    public void intensifier(){
        if(etat !=1 && etat < 10){
            etat ++;
        }
    }
    /** Pour la méthode diminuer: on décrémente de 1 si l'état est différent de 0 **/
    public void diminuer(){
        if (etat > 0){
            etat--;
        }
    }

    /** On retourne l'état**/
    public int etat(){
        return etat;
    }

    /** On retourne l'état de l'objet sous la forme d'une chaine de caractères**/
    public String toString(){
        return this.getClass().getName() + " : " + etat;
    }

    /** pour écrire l'état d'un objet**/
    public void setEtat(int etat) {
        this.etat = etat;
    }
}