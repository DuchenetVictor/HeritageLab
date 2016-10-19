package com.example.iem.heritagelab;

import java.util.List;

/**
 * Created by iem on 19/10/2016.
 */

public class Marque {
    public String nom;
    public List<Modele> modeles;


    public Marque(String nom, List<Modele> modeles) {
        this.nom = nom;
        this.modeles = modeles;
    }

    public String getNom() {
        return nom;
    }

    public List<Modele> getModeles() {
        return modeles;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setModeles(List<Modele> modeles) {
        this.modeles = modeles;
    }
}
