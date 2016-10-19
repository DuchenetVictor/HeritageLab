package com.example.iem.heritagelab;

/**
 * Created by iem on 19/10/2016.
 */

public abstract class Vehicule {

    protected String nom;
    protected int nbRoues;
    protected double poid;

    public Vehicule(String nom, int nbRoues, double poid) {
        this.nom = nom;
        this.nbRoues = nbRoues;
        this.poid = poid;
    }

    public Vehicule() {

    }

    public String getNom() {
        return nom;
    }

    public int getNbRoues() {
        return nbRoues;
    }

    public double getPoid() {
        return poid;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbRoues(int nbRoues) {
        this.nbRoues = nbRoues;
    }

    public void setPoid(double poid) {
        this.poid = poid;
    }
}
