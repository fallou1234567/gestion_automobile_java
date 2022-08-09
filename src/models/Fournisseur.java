/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


/**
 *
 * @author wolf
 */
public class Fournisseur  {

    private Integer id;
    private String nom;
    private String contact;
    private String tel;
    private String email;
    private TypeFournisseur typeFournisseur;

    public Fournisseur() {
    }

    public Fournisseur(Integer id, String nom, String contact, String tel, String email, TypeFournisseur typeFournisseur) {
        this.id = id;
        this.nom = nom;
        this.contact = contact;
        this.tel = tel;
        this.email = email;
        this.typeFournisseur = typeFournisseur;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TypeFournisseur getTypeFournisseur() {
        return typeFournisseur;
    }

    public void setTypeFournisseur(TypeFournisseur typeFournisseur) {
        this.typeFournisseur = typeFournisseur;
    }
    
}
