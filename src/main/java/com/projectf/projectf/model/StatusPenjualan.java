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
@Table(name = "status_penjualan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StatusPenjualan.findAll", query = "SELECT s FROM StatusPenjualan s")
    , @NamedQuery(name = "StatusPenjualan.findByIdstatuspenjualan", query = "SELECT s FROM StatusPenjualan s WHERE s.idstatuspenjualan = :idstatuspenjualan")
    , @NamedQuery(name = "StatusPenjualan.findByNama", query = "SELECT s FROM StatusPenjualan s WHERE s.nama = :nama")
    , @NamedQuery(name = "StatusPenjualan.findByDeskripsi", query = "SELECT s FROM StatusPenjualan s WHERE s.deskripsi = :deskripsi")
    , @NamedQuery(name = "StatusPenjualan.findByIdpenjualan", query = "SELECT s FROM StatusPenjualan s WHERE s.idpenjualan = :idpenjualan")})
public class StatusPenjualan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idstatuspenjualan")
    private Integer idstatuspenjualan;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "deskripsi")
    private String deskripsi;
    @Basic(optional = false)
    @Column(name = "idpenjualan")
    private int idpenjualan;

    public StatusPenjualan() {
    }

    public StatusPenjualan(Integer idstatuspenjualan) {
        this.idstatuspenjualan = idstatuspenjualan;
    }

    public StatusPenjualan(Integer idstatuspenjualan, String nama, String deskripsi, int idpenjualan) {
        this.idstatuspenjualan = idstatuspenjualan;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.idpenjualan = idpenjualan;
    }

    public Integer getIdstatuspenjualan() {
        return idstatuspenjualan;
    }

    public void setIdstatuspenjualan(Integer idstatuspenjualan) {
        this.idstatuspenjualan = idstatuspenjualan;
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

    public int getIdpenjualan() {
        return idpenjualan;
    }

    public void setIdpenjualan(int idpenjualan) {
        this.idpenjualan = idpenjualan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idstatuspenjualan != null ? idstatuspenjualan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StatusPenjualan)) {
            return false;
        }
        StatusPenjualan other = (StatusPenjualan) object;
        if ((this.idstatuspenjualan == null && other.idstatuspenjualan != null) || (this.idstatuspenjualan != null && !this.idstatuspenjualan.equals(other.idstatuspenjualan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projectf.projectf.model.StatusPenjualan[ idstatuspenjualan=" + idstatuspenjualan + " ]";
    }
    
}
