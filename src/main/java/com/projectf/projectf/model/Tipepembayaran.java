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
@Table(name = "tipepembayaran")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipepembayaran.findAll", query = "SELECT t FROM Tipepembayaran t")
    , @NamedQuery(name = "Tipepembayaran.findByIdtipepembayaran", query = "SELECT t FROM Tipepembayaran t WHERE t.idtipepembayaran = :idtipepembayaran")
    , @NamedQuery(name = "Tipepembayaran.findByNamatipe", query = "SELECT t FROM Tipepembayaran t WHERE t.namatipe = :namatipe")})
public class Tipepembayaran implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipepembayaran")
    private Integer idtipepembayaran;
    @Basic(optional = false)
    @Column(name = "namatipe")
    private String namatipe;

    public Tipepembayaran() {
    }

    public Tipepembayaran(Integer idtipepembayaran) {
        this.idtipepembayaran = idtipepembayaran;
    }

    public Tipepembayaran(Integer idtipepembayaran, String namatipe) {
        this.idtipepembayaran = idtipepembayaran;
        this.namatipe = namatipe;
    }

    public Integer getIdtipepembayaran() {
        return idtipepembayaran;
    }

    public void setIdtipepembayaran(Integer idtipepembayaran) {
        this.idtipepembayaran = idtipepembayaran;
    }

    public String getNamatipe() {
        return namatipe;
    }

    public void setNamatipe(String namatipe) {
        this.namatipe = namatipe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipepembayaran != null ? idtipepembayaran.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipepembayaran)) {
            return false;
        }
        Tipepembayaran other = (Tipepembayaran) object;
        if ((this.idtipepembayaran == null && other.idtipepembayaran != null) || (this.idtipepembayaran != null && !this.idtipepembayaran.equals(other.idtipepembayaran))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projectf.projectf.model.Tipepembayaran[ idtipepembayaran=" + idtipepembayaran + " ]";
    }
    
}
