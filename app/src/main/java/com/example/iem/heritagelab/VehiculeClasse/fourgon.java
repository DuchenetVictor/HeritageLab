package com.example.iem.heritagelab.VehiculeClasse;

import com.example.iem.heritagelab.Vehicule;

/**
 * Created by iem on 19/10/2016.
 */

public class fourgon extends Vehicule {

    private double chargeMax;

    public fourgon(String nom, int nbRoues, double poid,double chargeMax) {
        /*this.nom = nom;
        this.nbRoues = nbRoues;
        this.poid = poid;*/
        super(nom,nbRoues,poid);
        this.chargeMax= chargeMax;

    }

    public Double getChargeMax() {
        return chargeMax;
    }

    public void setChargeMax(double chargeMax) {
        this.chargeMax = chargeMax;
    }
}
