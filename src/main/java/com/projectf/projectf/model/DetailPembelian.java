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
@Table(name = "detail_pembelian")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetailPembelian.findAll", query = "SELECT d FROM DetailPembelian d")
    , @NamedQuery(name = "DetailPembelian.findByIddetailpembelian", query = "SELECT d FROM DetailPembelian d WHERE d.iddetailpembelian = :iddetailpembelian")
    , @NamedQuery(name = "DetailPembelian.findByIdpembelian", query = "SELECT d FROM DetailPembelian d WHERE d.idpembelian = :idpembelian")
    , @NamedQuery(name = "DetailPembelian.findByIdbarang", query = "SELECT d FROM DetailPembelian d WHERE d.idbarang = :idbarang")
    , @NamedQuery(name = "DetailPembelian.findByJumlah", query = "SELECT d FROM DetailPembelian d WHERE d.jumlah = :jumlah")})
public class DetailPembelian implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddetailpembelian")
    private Integer iddetailpembelian;
    @Basic(optional = false)
    @Column(name = "idpembelian")
    private int idpembelian;
    @Basic(optional = false)
    @Column(name = "idbarang")
    private int idbarang;
    @Basic(optional = false)
    @Column(name = "jumlah")
    private int jumlah;

    public DetailPembelian() {
    }

    public DetailPembelian(Integer iddetailpembelian) {
        this.iddetailpembelian = iddetailpembelian;
    }

    public DetailPembelian(Integer iddetailpembelian, int idpembelian, int idbarang, int jumlah) {
        this.iddetailpembelian = iddetailpembelian;
        this.idpembelian = idpembelian;
        this.idbarang = idbarang;
        this.jumlah = jumlah;
    }

    public Integer getIddetailpembelian() {
        return iddetailpembelian;
    }

    public void setIddetailpembelian(Integer iddetailpembelian) {
        this.iddetailpembelian = iddetailpembelian;
    }

    public int getIdpembelian() {
        return idpembelian;
    }

    public void setIdpembelian(int idpembelian) {
        this.idpembelian = idpembelian;
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
        hash += (iddetailpembelian != null ? iddetailpembelian.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetailPembelian)) {
            return false;
        }
        DetailPembelian other = (DetailPembelian) object;
        if ((this.iddetailpembelian == null && other.iddetailpembelian != null) || (this.iddetailpembelian != null && !this.iddetailpembelian.equals(other.iddetailpembelian))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projectf.projectf.model.DetailPembelian[ iddetailpembelian=" + iddetailpembelian + " ]";
    }
    
}
