/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sofrie
 */
@Entity
@Table(name = "reviewbarang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reviewbarang.findAll", query = "SELECT r FROM Reviewbarang r")
    , @NamedQuery(name = "Reviewbarang.findByIdreview", query = "SELECT r FROM Reviewbarang r WHERE r.idreview = :idreview")
    , @NamedQuery(name = "Reviewbarang.findByIdtoko", query = "SELECT r FROM Reviewbarang r WHERE r.idtoko = :idtoko")
    , @NamedQuery(name = "Reviewbarang.findByIduser", query = "SELECT r FROM Reviewbarang r WHERE r.iduser = :iduser")
    , @NamedQuery(name = "Reviewbarang.findByRating", query = "SELECT r FROM Reviewbarang r WHERE r.rating = :rating")
    , @NamedQuery(name = "Reviewbarang.findByReview", query = "SELECT r FROM Reviewbarang r WHERE r.review = :review")})
public class Reviewbarang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreview")
    private Integer idreview;
    @Basic(optional = false)
    @Column(name = "idtoko")
    private int idtoko;
    @Basic(optional = false)
    @Column(name = "iduser")
    private int iduser;
    @Basic(optional = false)
    @Column(name = "rating")
    private int rating;
    @Column(name = "review")
    private String review;

    public Reviewbarang() {
    }

    public Reviewbarang(Integer idreview) {
        this.idreview = idreview;
    }

    public Reviewbarang(Integer idreview, int idtoko, int iduser, int rating) {
        this.idreview = idreview;
        this.idtoko = idtoko;
        this.iduser = iduser;
        this.rating = rating;
    }

    public Integer getIdreview() {
        return idreview;
    }

    public void setIdreview(Integer idreview) {
        this.idreview = idreview;
    }

    public int getIdtoko() {
        return idtoko;
    }

    public void setIdtoko(int idtoko) {
        this.idtoko = idtoko;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreview != null ? idreview.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reviewbarang)) {
            return false;
        }
        Reviewbarang other = (Reviewbarang) object;
        if ((this.idreview == null && other.idreview != null) || (this.idreview != null && !this.idreview.equals(other.idreview))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projectf.projectf.model.Reviewbarang[ idreview=" + idreview + " ]";
    }
    
}
