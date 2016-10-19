package com.example.iem.heritagelab.VehiculeClasse;

import com.example.iem.heritagelab.Vehicule;

/**
 * Created by iem on 19/10/2016.
 */

public class Voiture extends Vehicule {

    private int placeMax;

    public Voiture(String nom, int nbRoues, double poid, int placeMax) {
        super(nom,nbRoues,poid);
        this.placeMax = placeMax;

    }

    public int getPlaceMax() {
        return placeMax;
    }

    public void setPlaceMax(int placeMax) {
        this.placeMax = placeMax;
    }
}
