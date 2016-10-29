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
@Table(name = "cart_item")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CartItem.findAll", query = "SELECT c FROM CartItem c")
    , @NamedQuery(name = "CartItem.findByIdcartitem", query = "SELECT c FROM CartItem c WHERE c.idcartitem = :idcartitem")
    , @NamedQuery(name = "CartItem.findByIdbarang", query = "SELECT c FROM CartItem c WHERE c.idbarang = :idbarang")
    , @NamedQuery(name = "CartItem.findByJumlahbarang", query = "SELECT c FROM CartItem c WHERE c.jumlahbarang = :jumlahbarang")
    , @NamedQuery(name = "CartItem.findByTotalcost", query = "SELECT c FROM CartItem c WHERE c.totalcost = :totalcost")})
public class CartItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcartitem")
    private Integer idcartitem;
    @Basic(optional = false)
    @Column(name = "idbarang")
    private int idbarang;
    @Basic(optional = false)
    @Column(name = "jumlahbarang")
    private int jumlahbarang;
    @Basic(optional = false)
    @Column(name = "totalcost")
    private long totalcost;

    public CartItem() {
    }

    public CartItem(Integer idcartitem) {
        this.idcartitem = idcartitem;
    }

    public CartItem(Integer idcartitem, int idbarang, int jumlahbarang, long totalcost) {
        this.idcartitem = idcartitem;
        this.idbarang = idbarang;
        this.jumlahbarang = jumlahbarang;
        this.totalcost = totalcost;
    }

    public Integer getIdcartitem() {
        return idcartitem;
    }

    public void setIdcartitem(Integer idcartitem) {
        this.idcartitem = idcartitem;
    }

    public int getIdbarang() {
        return idbarang;
    }

    public void setIdbarang(int idbarang) {
        this.idbarang = idbarang;
    }

    public int getJumlahbarang() {
        return jumlahbarang;
    }

    public void setJumlahbarang(int jumlahbarang) {
        this.jumlahbarang = jumlahbarang;
    }

    public long getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(long totalcost) {
        this.totalcost = totalcost;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcartitem != null ? idcartitem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CartItem)) {
            return false;
        }
        CartItem other = (CartItem) object;
        if ((this.idcartitem == null && other.idcartitem != null) || (this.idcartitem != null && !this.idcartitem.equals(other.idcartitem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projectf.projectf.model.CartItem[ idcartitem=" + idcartitem + " ]";
    }
    
}
