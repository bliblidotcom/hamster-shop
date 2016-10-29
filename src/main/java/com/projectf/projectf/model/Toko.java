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
@Table(name = "toko")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Toko.findAll", query = "SELECT t FROM Toko t")
    , @NamedQuery(name = "Toko.findByIdtoko", query = "SELECT t FROM Toko t WHERE t.idtoko = :idtoko")
    , @NamedQuery(name = "Toko.findByIduser", query = "SELECT t FROM Toko t WHERE t.iduser = :iduser")
    , @NamedQuery(name = "Toko.findByNamatoko", query = "SELECT t FROM Toko t WHERE t.namatoko = :namatoko")
    , @NamedQuery(name = "Toko.findByAlamattoko", query = "SELECT t FROM Toko t WHERE t.alamattoko = :alamattoko")
    , @NamedQuery(name = "Toko.findByDeskripsi", query = "SELECT t FROM Toko t WHERE t.deskripsi = :deskripsi")
    , @NamedQuery(name = "Toko.findByKontak", query = "SELECT t FROM Toko t WHERE t.kontak = :kontak")})
public class Toko implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtoko")
    private Integer idtoko;
    @Basic(optional = false)
    @Column(name = "iduser")
    private int iduser;
    @Basic(optional = false)
    @Column(name = "namatoko")
    private String namatoko;
    @Basic(optional = false)
    @Column(name = "alamattoko")
    private String alamattoko;
    @Basic(optional = false)
    @Column(name = "deskripsi")
    private String deskripsi;
    @Basic(optional = false)
    @Column(name = "kontak")
    private String kontak;

    public Toko() {
    }

    public Toko(Integer idtoko) {
        this.idtoko = idtoko;
    }

    public Toko(Integer idtoko, int iduser, String namatoko, String alamattoko, String deskripsi, String kontak) {
        this.idtoko = idtoko;
        this.iduser = iduser;
        this.namatoko = namatoko;
        this.alamattoko = alamattoko;
        this.deskripsi = deskripsi;
        this.kontak = kontak;
    }

    public Integer getIdtoko() {
        return idtoko;
    }

    public void setIdtoko(Integer idtoko) {
        this.idtoko = idtoko;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getNamatoko() {
        return namatoko;
    }

    public void setNamatoko(String namatoko) {
        this.namatoko = namatoko;
    }

    public String getAlamattoko() {
        return alamattoko;
    }

    public void setAlamattoko(String alamattoko) {
        this.alamattoko = alamattoko;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtoko != null ? idtoko.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Toko)) {
            return false;
        }
        Toko other = (Toko) object;
        if ((this.idtoko == null && other.idtoko != null) || (this.idtoko != null && !this.idtoko.equals(other.idtoko))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projectf.projectf.model.Toko[ idtoko=" + idtoko + " ]";
    }
    
}
