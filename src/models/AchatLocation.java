/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;


/**
 *
 * @author wolf
 */
public class AchatLocation {

    private Integer id;

    private Date date;
    private int prix;
    private int prixVente;
    private int kilometrage;
    private String note;
    private Fournisseur fournisseurId;
    private Vehicule vehiculeId;

    public AchatLocation() {
    }

    public AchatLocation(Integer id, Date date, int prix, int prixVente, int kilometrage, String note, Fournisseur fournisseurId, Vehicule vehiculeId) {
        this.id = id;
        this.date = date;
        this.prix = prix;
        this.prixVente = prixVente;
        this.kilometrage = kilometrage;
        this.note = note;
        this.fournisseurId = fournisseurId;
        this.vehiculeId = vehiculeId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(int prixVente) {
        this.prixVente = prixVente;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Fournisseur getFournisseurId() {
        return fournisseurId;
    }

    public void setFournisseurId(Fournisseur fournisseurId) {
        this.fournisseurId = fournisseurId;
    }

    public Vehicule getVehiculeId() {
        return vehiculeId;
    }

    public void setVehiculeId(Vehicule vehiculeId) {
        this.vehiculeId = vehiculeId;
    }
    
}
