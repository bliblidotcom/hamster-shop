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
@Table(name = "pembelian")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pembelian.findAll", query = "SELECT p FROM Pembelian p")
    , @NamedQuery(name = "Pembelian.findByIdpembelian", query = "SELECT p FROM Pembelian p WHERE p.idpembelian = :idpembelian")
    , @NamedQuery(name = "Pembelian.findByHargabeli", query = "SELECT p FROM Pembelian p WHERE p.hargabeli = :hargabeli")
    , @NamedQuery(name = "Pembelian.findByTanggalbeli", query = "SELECT p FROM Pembelian p WHERE p.tanggalbeli = :tanggalbeli")
    , @NamedQuery(name = "Pembelian.findByAlamatpembelian", query = "SELECT p FROM Pembelian p WHERE p.alamatpembelian = :alamatpembelian")
    , @NamedQuery(name = "Pembelian.findByIduser", query = "SELECT p FROM Pembelian p WHERE p.iduser = :iduser")
    , @NamedQuery(name = "Pembelian.findByIdtoko", query = "SELECT p FROM Pembelian p WHERE p.idtoko = :idtoko")
    , @NamedQuery(name = "Pembelian.findByIdtipepengiriman", query = "SELECT p FROM Pembelian p WHERE p.idtipepengiriman = :idtipepengiriman")})
public class Pembelian implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpembelian")
    private Integer idpembelian;
    @Basic(optional = false)
    @Column(name = "hargabeli")
    private long hargabeli;
    @Basic(optional = false)
    @Column(name = "tanggalbeli")
    @Temporal(TemporalType.DATE)
    private Date tanggalbeli;
    @Basic(optional = false)
    @Column(name = "alamatpembelian")
    private String alamatpembelian;
    @Basic(optional = false)
    @Column(name = "iduser")
    private int iduser;
    @Basic(optional = false)
    @Column(name = "idtoko")
    private int idtoko;
    @Basic(optional = false)
    @Column(name = "idtipepengiriman")
    private int idtipepengiriman;

    public Pembelian() {
    }

    public Pembelian(Integer idpembelian) {
        this.idpembelian = idpembelian;
    }

    public Pembelian(Integer idpembelian, long hargabeli, Date tanggalbeli, String alamatpembelian, int iduser, int idtoko, int idtipepengiriman) {
        this.idpembelian = idpembelian;
        this.hargabeli = hargabeli;
        this.tanggalbeli = tanggalbeli;
        this.alamatpembelian = alamatpembelian;
        this.iduser = iduser;
        this.idtoko = idtoko;
        this.idtipepengiriman = idtipepengiriman;
    }

    public Integer getIdpembelian() {
        return idpembelian;
    }

    public void setIdpembelian(Integer idpembelian) {
        this.idpembelian = idpembelian;
    }

    public long getHargabeli() {
        return hargabeli;
    }

    public void setHargabeli(long hargabeli) {
        this.hargabeli = hargabeli;
    }

    public Date getTanggalbeli() {
        return tanggalbeli;
    }

    public void setTanggalbeli(Date tanggalbeli) {
        this.tanggalbeli = tanggalbeli;
    }

    public String getAlamatpembelian() {
        return alamatpembelian;
    }

    public void setAlamatpembelian(String alamatpembelian) {
        this.alamatpembelian = alamatpembelian;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public int getIdtoko() {
        return idtoko;
    }

    public void setIdtoko(int idtoko) {
        this.idtoko = idtoko;
    }

    public int getIdtipepengiriman() {
        return idtipepengiriman;
    }

    public void setIdtipepengiriman(int idtipepengiriman) {
        this.idtipepengiriman = idtipepengiriman;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpembelian != null ? idpembelian.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pembelian)) {
            return false;
        }
        Pembelian other = (Pembelian) object;
        if ((this.idpembelian == null && other.idpembelian != null) || (this.idpembelian != null && !this.idpembelian.equals(other.idpembelian))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projectf.projectf.model.Pembelian[ idpembelian=" + idpembelian + " ]";
    }
    
}
