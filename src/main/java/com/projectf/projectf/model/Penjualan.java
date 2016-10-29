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
@Table(name = "penjualan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Penjualan.findAll", query = "SELECT p FROM Penjualan p")
    , @NamedQuery(name = "Penjualan.findByIdpenjualan", query = "SELECT p FROM Penjualan p WHERE p.idpenjualan = :idpenjualan")
    , @NamedQuery(name = "Penjualan.findByHargapenjualan", query = "SELECT p FROM Penjualan p WHERE p.hargapenjualan = :hargapenjualan")
    , @NamedQuery(name = "Penjualan.findByDiskon", query = "SELECT p FROM Penjualan p WHERE p.diskon = :diskon")
    , @NamedQuery(name = "Penjualan.findByPajakjual", query = "SELECT p FROM Penjualan p WHERE p.pajakjual = :pajakjual")
    , @NamedQuery(name = "Penjualan.findByTanggaljual", query = "SELECT p FROM Penjualan p WHERE p.tanggaljual = :tanggaljual")
    , @NamedQuery(name = "Penjualan.findByAlamatpengiriman", query = "SELECT p FROM Penjualan p WHERE p.alamatpengiriman = :alamatpengiriman")
    , @NamedQuery(name = "Penjualan.findByResi", query = "SELECT p FROM Penjualan p WHERE p.resi = :resi")
    , @NamedQuery(name = "Penjualan.findByIduser", query = "SELECT p FROM Penjualan p WHERE p.iduser = :iduser")
    , @NamedQuery(name = "Penjualan.findByIdtoko", query = "SELECT p FROM Penjualan p WHERE p.idtoko = :idtoko")})
public class Penjualan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpenjualan")
    private Integer idpenjualan;
    @Basic(optional = false)
    @Column(name = "hargapenjualan")
    private long hargapenjualan;
    @Basic(optional = false)
    @Column(name = "diskon")
    private long diskon;
    @Basic(optional = false)
    @Column(name = "pajakjual")
    private long pajakjual;
    @Basic(optional = false)
    @Column(name = "tanggaljual")
    @Temporal(TemporalType.DATE)
    private Date tanggaljual;
    @Basic(optional = false)
    @Column(name = "alamatpengiriman")
    private String alamatpengiriman;
    @Column(name = "resi")
    private String resi;
    @Basic(optional = false)
    @Column(name = "iduser")
    private int iduser;
    @Basic(optional = false)
    @Column(name = "idtoko")
    private int idtoko;

    public Penjualan() {
    }

    public Penjualan(Integer idpenjualan) {
        this.idpenjualan = idpenjualan;
    }

    public Penjualan(Integer idpenjualan, long hargapenjualan, long diskon, long pajakjual, Date tanggaljual, String alamatpengiriman, int iduser, int idtoko) {
        this.idpenjualan = idpenjualan;
        this.hargapenjualan = hargapenjualan;
        this.diskon = diskon;
        this.pajakjual = pajakjual;
        this.tanggaljual = tanggaljual;
        this.alamatpengiriman = alamatpengiriman;
        this.iduser = iduser;
        this.idtoko = idtoko;
    }

    public Integer getIdpenjualan() {
        return idpenjualan;
    }

    public void setIdpenjualan(Integer idpenjualan) {
        this.idpenjualan = idpenjualan;
    }

    public long getHargapenjualan() {
        return hargapenjualan;
    }

    public void setHargapenjualan(long hargapenjualan) {
        this.hargapenjualan = hargapenjualan;
    }

    public long getDiskon() {
        return diskon;
    }

    public void setDiskon(long diskon) {
        this.diskon = diskon;
    }

    public long getPajakjual() {
        return pajakjual;
    }

    public void setPajakjual(long pajakjual) {
        this.pajakjual = pajakjual;
    }

    public Date getTanggaljual() {
        return tanggaljual;
    }

    public void setTanggaljual(Date tanggaljual) {
        this.tanggaljual = tanggaljual;
    }

    public String getAlamatpengiriman() {
        return alamatpengiriman;
    }

    public void setAlamatpengiriman(String alamatpengiriman) {
        this.alamatpengiriman = alamatpengiriman;
    }

    public String getResi() {
        return resi;
    }

    public void setResi(String resi) {
        this.resi = resi;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpenjualan != null ? idpenjualan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Penjualan)) {
            return false;
        }
        Penjualan other = (Penjualan) object;
        if ((this.idpenjualan == null && other.idpenjualan != null) || (this.idpenjualan != null && !this.idpenjualan.equals(other.idpenjualan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projectf.projectf.model.Penjualan[ idpenjualan=" + idpenjualan + " ]";
    }
    
}
