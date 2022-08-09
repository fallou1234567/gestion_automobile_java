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
public class Piece  {
    private Integer id;
    private String numero;
    private String libelle;
    private int prix;
    private Date date;
    private Fournisseur fournisseurId;

    public Piece() {
    }

    public Piece(Integer id, String numero, String libelle, int prix, Date date, Fournisseur fournisseurId) {
        this.id = id;
        this.numero = numero;
        this.libelle = libelle;
        this.prix = prix;
        this.date = date;
        this.fournisseurId = fournisseurId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Fournisseur getFournisseurId() {
        return fournisseurId;
    }

    public void setFournisseurId(Fournisseur fournisseurId) {
        this.fournisseurId = fournisseurId;
    }
    
    
}
