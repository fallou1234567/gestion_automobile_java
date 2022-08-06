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
public class User{
    private Integer id;

    private String nom;
    private String prenom;
    private String email;
    private String username;
    private String password;
    private Profil currentProfil;

    public User() {
    }

    public User(Integer id, String nom, String prenom, String email, String username, String password, Profil currentProfil) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.username = username;
        this.password = password;
        this.currentProfil = currentProfil;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profil getCurrentProfil() {
        return currentProfil;
    }

    public void setCurrentProfil(Profil currentProfil) {
        this.currentProfil = currentProfil;
    }
    
    
}
