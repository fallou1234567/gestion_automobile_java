/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author wolf
 */
@Entity
@Table(name = "piece")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Piece.findAll", query = "SELECT p FROM Piece p")
    , @NamedQuery(name = "Piece.findById", query = "SELECT p FROM Piece p WHERE p.id = :id")
    , @NamedQuery(name = "Piece.findByNumero", query = "SELECT p FROM Piece p WHERE p.numero = :numero")
    , @NamedQuery(name = "Piece.findByLibelle", query = "SELECT p FROM Piece p WHERE p.libelle = :libelle")
    , @NamedQuery(name = "Piece.findByPrix", query = "SELECT p FROM Piece p WHERE p.prix = :prix")
    , @NamedQuery(name = "Piece.findByDate", query = "SELECT p FROM Piece p WHERE p.date = :date")})
public class Piece implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "numero")
    private String numero;
    @Basic(optional = false)
    @Column(name = "libelle")
    private String libelle;
    @Basic(optional = false)
    @Column(name = "prix")
    private int prix;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @JoinColumn(name = "fournisseur_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Fournisseur fournisseurId;

    public Piece() {
    }

    public Piece(Integer id) {
        this.id = id;
    }

    public Piece(Integer id, String numero, String libelle, int prix, Date date) {
        this.id = id;
        this.numero = numero;
        this.libelle = libelle;
        this.prix = prix;
        this.date = date;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Piece)) {
            return false;
        }
        Piece other = (Piece) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Piece[ id=" + id + " ]";
    }
    
}
