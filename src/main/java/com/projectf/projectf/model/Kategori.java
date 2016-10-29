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
@Table(name = "kategori")
/*@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kategori.findAll", query = "SELECT k FROM Kategori k")
    , @NamedQuery(name = "Kategori.findByIdkategori", query = "SELECT k FROM Kategori k WHERE k.idkategori = :idkategori")
    , @NamedQuery(name = "Kategori.findByNamakategori", query = "SELECT k FROM Kategori k WHERE k.namakategori = :namakategori")
    , @NamedQuery(name = "Kategori.findByDeskripsi", query = "SELECT k FROM Kategori k WHERE k.deskripsi = :deskripsi")})
*/
public class Kategori implements Serializable {

    //private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Basic(optional = false)
    //@Column(name = "idkategori")
    private Integer idkategori;
    //@Basic(optional = false)
    //@Column(name = "namakategori")
    private String namakategori;
    //@Column(name = "deskripsi")
    private String deskripsi;

    public Kategori() {
    }

    public Kategori(Integer idkategori) {
        this.idkategori = idkategori;
    }

    public Kategori(Integer idkategori, String namakategori) {
        this.idkategori = idkategori;
        this.namakategori = namakategori;
    }

    public Integer getIdkategori() {
        return idkategori;
    }

    public void setIdkategori(Integer idkategori) {
        this.idkategori = idkategori;
    }

    public String getNamakategori() {
        return namakategori;
    }

    public void setNamakategori(String namakategori) {
        this.namakategori = namakategori;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    /*@Override
    public int hashCode() {
        int hash = 0;
        hash += (idkategori != null ? idkategori.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kategori)) {
            return false;
        }
        Kategori other = (Kategori) object;
        if ((this.idkategori == null && other.idkategori != null) || (this.idkategori != null && !this.idkategori.equals(other.idkategori))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projectf.projectf.model.Kategori[ idkategori=" + idkategori + " ]";
    }*/
    
}
