package com.example.iem.heritagelab.VehiculeClasse;

import com.example.iem.heritagelab.Vehicule;

/**
 * Created by iem on 19/10/2016.
 */

public class moto extends Vehicule {

    private int centimetreCube;

    public moto(String nom, int nbRoues, double poid, int centimetreCube) {
        super(nom, nbRoues, poid);
        this.centimetreCube = centimetreCube;
        }

    public int getCentimetreCube() {
        return centimetreCube;
    }

    public void setCentimetreCube(int centimetreCube) {
        this.centimetreCube = centimetreCube;
    }
}
