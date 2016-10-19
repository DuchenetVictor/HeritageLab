package com.example.iem.heritagelab;

/**
 * Created by iem on 19/10/2016.
 */

public  class Modele {

    public  Vehicule vehicule;
    public String nom;


    public Modele(Vehicule vehicule, String nom) {
        this.vehicule = vehicule;
        this.nom = nom;
    }
    public Vehicule getVehicule() {
        return vehicule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

}
