package com.example.iem.heritagelab.VehiculeClasse;

import com.example.iem.heritagelab.Vehicule;

/**
 * Created by iem on 19/10/2016.
 */

public class Voiture extends Vehicule {

    public Voiture(String nom, int nbRoues, double poid) {
        this.nom = nom;
        this.nbRoues = nbRoues;
        this.poid = poid;
    }
}
