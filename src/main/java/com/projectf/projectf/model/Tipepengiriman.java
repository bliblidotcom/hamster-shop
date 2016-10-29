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
@Table(name = "tipepengiriman")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipepengiriman.findAll", query = "SELECT t FROM Tipepengiriman t")
    , @NamedQuery(name = "Tipepengiriman.findByIdtipepengiriman", query = "SELECT t FROM Tipepengiriman t WHERE t.idtipepengiriman = :idtipepengiriman")
    , @NamedQuery(name = "Tipepengiriman.findByNamapengiriman", query = "SELECT t FROM Tipepengiriman t WHERE t.namapengiriman = :namapengiriman")})
public class Tipepengiriman implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipepengiriman")
    private Integer idtipepengiriman;
    @Basic(optional = false)
    @Column(name = "namapengiriman")
    private String namapengiriman;

    public Tipepengiriman() {
    }

    public Tipepengiriman(Integer idtipepengiriman) {
        this.idtipepengiriman = idtipepengiriman;
    }

    public Tipepengiriman(Integer idtipepengiriman, String namapengiriman) {
        this.idtipepengiriman = idtipepengiriman;
        this.namapengiriman = namapengiriman;
    }

    public Integer getIdtipepengiriman() {
        return idtipepengiriman;
    }

    public void setIdtipepengiriman(Integer idtipepengiriman) {
        this.idtipepengiriman = idtipepengiriman;
    }

    public String getNamapengiriman() {
        return namapengiriman;
    }

    public void setNamapengiriman(String namapengiriman) {
        this.namapengiriman = namapengiriman;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipepengiriman != null ? idtipepengiriman.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipepengiriman)) {
            return false;
        }
        Tipepengiriman other = (Tipepengiriman) object;
        if ((this.idtipepengiriman == null && other.idtipepengiriman != null) || (this.idtipepengiriman != null && !this.idtipepengiriman.equals(other.idtipepengiriman))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projectf.projectf.model.Tipepengiriman[ idtipepengiriman=" + idtipepengiriman + " ]";
    }
    
}
