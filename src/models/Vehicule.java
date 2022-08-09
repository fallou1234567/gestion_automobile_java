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
public class Vehicule{


    private Integer id;
    private String matricule;
    private String marque;
    private String modele;
    private String couleur;
    private String serie;
    private Date circulation;
    private Carburant carburantId;
    private Conducteur conducteurId;
    private Departement departementId;
    private TypeVoiture typeId;
    
    
        public Vehicule(Integer id, String matricule, String marque, String modele, String couleur, String serie, Date circulation, Carburant carburantId, Conducteur conducteurId, Departement departementId, TypeVoiture typeId) {
        this.id = id;
        this.matricule = matricule;
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
        this.serie = serie;
        this.circulation = circulation;
        this.carburantId = carburantId;
        this.conducteurId = conducteurId;
        this.departementId = departementId;
        this.typeId = typeId;
    }

    public Vehicule() {
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Date getCirculation() {
        return circulation;
    }

    public void setCirculation(Date circulation) {
        this.circulation = circulation;
    }

    public Carburant getCarburantId() {
        return carburantId;
    }

    public void setCarburantId(Carburant carburantId) {
        this.carburantId = carburantId;
    }

    public Conducteur getConducteurId() {
        return conducteurId;
    }

    public void setConducteurId(Conducteur conducteurId) {
        this.conducteurId = conducteurId;
    }

    public Departement getDepartementId() {
        return departementId;
    }

    public void setDepartementId(Departement departementId) {
        this.departementId = departementId;
    }

    public TypeVoiture getTypeId() {
        return typeId;
    }

    public void setTypeId(TypeVoiture typeId) {
        this.typeId = typeId;
    }


    
}
