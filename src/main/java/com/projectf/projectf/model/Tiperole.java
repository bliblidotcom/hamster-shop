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
@Table(name = "tiperole")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiperole.findAll", query = "SELECT t FROM Tiperole t")
    , @NamedQuery(name = "Tiperole.findByIdtiperole", query = "SELECT t FROM Tiperole t WHERE t.idtiperole = :idtiperole")
    , @NamedQuery(name = "Tiperole.findByNamarole", query = "SELECT t FROM Tiperole t WHERE t.namarole = :namarole")})
public class Tiperole implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtiperole")
    private Integer idtiperole;
    @Basic(optional = false)
    @Column(name = "namarole")
    private String namarole;

    public Tiperole() {
    }

    public Tiperole(Integer idtiperole) {
        this.idtiperole = idtiperole;
    }

    public Tiperole(Integer idtiperole, String namarole) {
        this.idtiperole = idtiperole;
        this.namarole = namarole;
    }

    public Integer getIdtiperole() {
        return idtiperole;
    }

    public void setIdtiperole(Integer idtiperole) {
        this.idtiperole = idtiperole;
    }

    public String getNamarole() {
        return namarole;
    }

    public void setNamarole(String namarole) {
        this.namarole = namarole;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtiperole != null ? idtiperole.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiperole)) {
            return false;
        }
        Tiperole other = (Tiperole) object;
        if ((this.idtiperole == null && other.idtiperole != null) || (this.idtiperole != null && !this.idtiperole.equals(other.idtiperole))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projectf.projectf.model.Tiperole[ idtiperole=" + idtiperole + " ]";
    }
    
}
