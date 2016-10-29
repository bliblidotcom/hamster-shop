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
@Table(name = "status_pembelian")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StatusPembelian.findAll", query = "SELECT s FROM StatusPembelian s")
    , @NamedQuery(name = "StatusPembelian.findByIdstatuspembelian", query = "SELECT s FROM StatusPembelian s WHERE s.idstatuspembelian = :idstatuspembelian")
    , @NamedQuery(name = "StatusPembelian.findByNama", query = "SELECT s FROM StatusPembelian s WHERE s.nama = :nama")
    , @NamedQuery(name = "StatusPembelian.findByDeskripsi", query = "SELECT s FROM StatusPembelian s WHERE s.deskripsi = :deskripsi")
    , @NamedQuery(name = "StatusPembelian.findByIdpembelian", query = "SELECT s FROM StatusPembelian s WHERE s.idpembelian = :idpembelian")})
public class StatusPembelian implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idstatuspembelian")
    private Integer idstatuspembelian;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "deskripsi")
    private String deskripsi;
    @Basic(optional = false)
    @Column(name = "idpembelian")
    private int idpembelian;

    public StatusPembelian() {
    }

    public StatusPembelian(Integer idstatuspembelian) {
        this.idstatuspembelian = idstatuspembelian;
    }

    public StatusPembelian(Integer idstatuspembelian, String nama, String deskripsi, int idpembelian) {
        this.idstatuspembelian = idstatuspembelian;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.idpembelian = idpembelian;
    }

    public Integer getIdstatuspembelian() {
        return idstatuspembelian;
    }

    public void setIdstatuspembelian(Integer idstatuspembelian) {
        this.idstatuspembelian = idstatuspembelian;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getIdpembelian() {
        return idpembelian;
    }

    public void setIdpembelian(int idpembelian) {
        this.idpembelian = idpembelian;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idstatuspembelian != null ? idstatuspembelian.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StatusPembelian)) {
            return false;
        }
        StatusPembelian other = (StatusPembelian) object;
        if ((this.idstatuspembelian == null && other.idstatuspembelian != null) || (this.idstatuspembelian != null && !this.idstatuspembelian.equals(other.idstatuspembelian))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projectf.projectf.model.StatusPembelian[ idstatuspembelian=" + idstatuspembelian + " ]";
    }
    
}
