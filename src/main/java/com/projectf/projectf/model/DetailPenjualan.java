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
@Table(name = "detail_penjualan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetailPenjualan.findAll", query = "SELECT d FROM DetailPenjualan d")
    , @NamedQuery(name = "DetailPenjualan.findByIddetailpenjualan", query = "SELECT d FROM DetailPenjualan d WHERE d.iddetailpenjualan = :iddetailpenjualan")
    , @NamedQuery(name = "DetailPenjualan.findByIdpenjualan", query = "SELECT d FROM DetailPenjualan d WHERE d.idpenjualan = :idpenjualan")
    , @NamedQuery(name = "DetailPenjualan.findByIdbarang", query = "SELECT d FROM DetailPenjualan d WHERE d.idbarang = :idbarang")
    , @NamedQuery(name = "DetailPenjualan.findByJumlah", query = "SELECT d FROM DetailPenjualan d WHERE d.jumlah = :jumlah")})
public class DetailPenjualan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "iddetailpenjualan")
    private Integer iddetailpenjualan;
    @Basic(optional = false)
    @Column(name = "idpenjualan")
    private int idpenjualan;
    @Basic(optional = false)
    @Column(name = "idbarang")
    private int idbarang;
    @Basic(optional = false)
    @Column(name = "jumlah")
    private int jumlah;

    public DetailPenjualan() {
    }

    public DetailPenjualan(Integer iddetailpenjualan) {
        this.iddetailpenjualan = iddetailpenjualan;
    }

    public DetailPenjualan(Integer iddetailpenjualan, int idpenjualan, int idbarang, int jumlah) {
        this.iddetailpenjualan = iddetailpenjualan;
        this.idpenjualan = idpenjualan;
        this.idbarang = idbarang;
        this.jumlah = jumlah;
    }

    public Integer getIddetailpenjualan() {
        return iddetailpenjualan;
    }

    public void setIddetailpenjualan(Integer iddetailpenjualan) {
        this.iddetailpenjualan = iddetailpenjualan;
    }

    public int getIdpenjualan() {
        return idpenjualan;
    }

    public void setIdpenjualan(int idpenjualan) {
        this.idpenjualan = idpenjualan;
    }

    public int getIdbarang() {
        return idbarang;
    }

    public void setIdbarang(int idbarang) {
        this.idbarang = idbarang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetailpenjualan != null ? iddetailpenjualan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetailPenjualan)) {
            return false;
        }
        DetailPenjualan other = (DetailPenjualan) object;
        if ((this.iddetailpenjualan == null && other.iddetailpenjualan != null) || (this.iddetailpenjualan != null && !this.iddetailpenjualan.equals(other.iddetailpenjualan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projectf.projectf.model.DetailPenjualan[ iddetailpenjualan=" + iddetailpenjualan + " ]";
    }
    
}
