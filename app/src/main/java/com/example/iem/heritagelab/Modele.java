package com.example.iem.heritagelab;

/**
 * Created by iem on 19/10/2016.
 */

public  class Modele {
    public String nom;
    public Type type;

    public Modele(Type type, String nom) {
        this.type = type;
        this.nom = nom;
    }
    public Type getType() {
        return type;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setType(Type type) {
        this.type = type;
    }




}
