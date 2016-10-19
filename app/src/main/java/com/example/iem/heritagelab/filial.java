package com.example.iem.heritagelab;

import java.util.Date;
import java.util.List;

/**
 * Created by iem on 19/10/2016.
 */

public class filial {

    public String nom;
    public int nbEmployes;
    public Date dateRachat;
    public Double chaiffreAffaire;
    public String paysOrigine;
    public List<Marque> marques;

    public filial(String nom, int nbEmployes, Date dateRachat, Double chaiffreAffaire, String paysOrigine, List<Marque> marques) {
        this.nom = nom;
        this.nbEmployes = nbEmployes;
        this.dateRachat = dateRachat;
        this.chaiffreAffaire = chaiffreAffaire;
        this.paysOrigine = paysOrigine;
        this.marques = marques;
    }

    public String getNom() {
        return nom;
    }

    public int getNbEmployes() {
        return nbEmployes;
    }

    public Date getDateRachat() {
        return dateRachat;
    }

    public Double getChaiffreAffaire() {
        return chaiffreAffaire;
    }

    public String getPaysOrigine() {
        return paysOrigine;
    }

    public List<Marque> getMarques() {
        return marques;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbEmployes(int nbEmployes) {
        this.nbEmployes = nbEmployes;
    }

    public void setDateRachat(Date dateRachat) {
        this.dateRachat = dateRachat;
    }

    public void setChaiffreAffaire(Double chaiffreAffaire) {
        this.chaiffreAffaire = chaiffreAffaire;
    }

    public void setPaysOrigine(String paysOrigine) {
        this.paysOrigine = paysOrigine;
    }

    public void setMarques(List<Marque> marques) {
        this.marques = marques;
    }

}
