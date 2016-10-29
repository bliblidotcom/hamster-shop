/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sofrie
 */
@Entity
@Table(name = "wishlist")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Wishlist.findAll", query = "SELECT w FROM Wishlist w")
    , @NamedQuery(name = "Wishlist.findByIdwishlist", query = "SELECT w FROM Wishlist w WHERE w.idwishlist = :idwishlist")
    , @NamedQuery(name = "Wishlist.findByIdbarang", query = "SELECT w FROM Wishlist w WHERE w.idbarang = :idbarang")
    , @NamedQuery(name = "Wishlist.findByIduser", query = "SELECT w FROM Wishlist w WHERE w.iduser = :iduser")
    , @NamedQuery(name = "Wishlist.findByNamabarang", query = "SELECT w FROM Wishlist w WHERE w.namabarang = :namabarang")
    , @NamedQuery(name = "Wishlist.findByTanggalinput", query = "SELECT w FROM Wishlist w WHERE w.tanggalinput = :tanggalinput")})
public class Wishlist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idwishlist")
    private Integer idwishlist;
    @Basic(optional = false)
    @Column(name = "idbarang")
    private int idbarang;
    @Basic(optional = false)
    @Column(name = "iduser")
    private int iduser;
    @Basic(optional = false)
    @Column(name = "namabarang")
    private String namabarang;
    @Basic(optional = false)
    @Column(name = "tanggalinput")
    @Temporal(TemporalType.DATE)
    private Date tanggalinput;

    public Wishlist() {
    }

    public Wishlist(Integer idwishlist) {
        this.idwishlist = idwishlist;
    }

    public Wishlist(Integer idwishlist, int idbarang, int iduser, String namabarang, Date tanggalinput) {
        this.idwishlist = idwishlist;
        this.idbarang = idbarang;
        this.iduser = iduser;
        this.namabarang = namabarang;
        this.tanggalinput = tanggalinput;
    }

    public Integer getIdwishlist() {
        return idwishlist;
    }

    public void setIdwishlist(Integer idwishlist) {
        this.idwishlist = idwishlist;
    }

    public int getIdbarang() {
        return idbarang;
    }

    public void setIdbarang(int idbarang) {
        this.idbarang = idbarang;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getNamabarang() {
        return namabarang;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public Date getTanggalinput() {
        return tanggalinput;
    }

    public void setTanggalinput(Date tanggalinput) {
        this.tanggalinput = tanggalinput;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idwishlist != null ? idwishlist.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Wishlist)) {
            return false;
        }
        Wishlist other = (Wishlist) object;
        if ((this.idwishlist == null && other.idwishlist != null) || (this.idwishlist != null && !this.idwishlist.equals(other.idwishlist))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projectf.projectf.model.Wishlist[ idwishlist=" + idwishlist + " ]";
    }
    
}
