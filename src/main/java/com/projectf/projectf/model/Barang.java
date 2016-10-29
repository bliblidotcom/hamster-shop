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
@Table(name = "barang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Barang.findAll", query = "SELECT b FROM Barang b")
    , @NamedQuery(name = "Barang.findByIdbarang", query = "SELECT b FROM Barang b WHERE b.idbarang = :idbarang")
    , @NamedQuery(name = "Barang.findByNamabarang", query = "SELECT b FROM Barang b WHERE b.namabarang = :namabarang")
    , @NamedQuery(name = "Barang.findByIdkategori", query = "SELECT b FROM Barang b WHERE b.idkategori = :idkategori")
    , @NamedQuery(name = "Barang.findByHargajual", query = "SELECT b FROM Barang b WHERE b.hargajual = :hargajual")
    , @NamedQuery(name = "Barang.findByHargabeli", query = "SELECT b FROM Barang b WHERE b.hargabeli = :hargabeli")
    , @NamedQuery(name = "Barang.findByJumlah", query = "SELECT b FROM Barang b WHERE b.jumlah = :jumlah")
    , @NamedQuery(name = "Barang.findByGambar", query = "SELECT b FROM Barang b WHERE b.gambar = :gambar")
    , @NamedQuery(name = "Barang.findByIdtoko", query = "SELECT b FROM Barang b WHERE b.idtoko = :idtoko")})
public class Barang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idbarang")
    private Integer idbarang;
    @Basic(optional = false)
    @Column(name = "namabarang")
    private String namabarang;
    @Basic(optional = false)
    @Column(name = "idkategori")
    private int idkategori;
    @Basic(optional = false)
    @Column(name = "hargajual")
    private long hargajual;
    @Basic(optional = false)
    @Column(name = "hargabeli")
    private long hargabeli;
    @Basic(optional = false)
    @Column(name = "jumlah")
    private int jumlah;
    @Basic(optional = false)
    @Column(name = "gambar")
    private String gambar;
    @Basic(optional = false)
    @Column(name = "idtoko")
    private int idtoko;

    public Barang() {
    }

    public Barang(Integer idbarang) {
        this.idbarang = idbarang;
    }

    public Barang(Integer idbarang, String namabarang, int idkategori, long hargajual, long hargabeli, int jumlah, String gambar, int idtoko) {
        this.idbarang = idbarang;
        this.namabarang = namabarang;
        this.idkategori = idkategori;
        this.hargajual = hargajual;
        this.hargabeli = hargabeli;
        this.jumlah = jumlah;
        this.gambar = gambar;
        this.idtoko = idtoko;
    }

    public Integer getIdbarang() {
        return idbarang;
    }

    public void setIdbarang(Integer idbarang) {
        this.idbarang = idbarang;
    }

    public String getNamabarang() {
        return namabarang;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public int getIdkategori() {
        return idkategori;
    }

    public void setIdkategori(int idkategori) {
        this.idkategori = idkategori;
    }

    public long getHargajual() {
        return hargajual;
    }

    public void setHargajual(long hargajual) {
        this.hargajual = hargajual;
    }

    public long getHargabeli() {
        return hargabeli;
    }

    public void setHargabeli(long hargabeli) {
        this.hargabeli = hargabeli;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
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
        hash += (idbarang != null ? idbarang.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Barang)) {
            return false;
        }
        Barang other = (Barang) object;
        if ((this.idbarang == null && other.idbarang != null) || (this.idbarang != null && !this.idbarang.equals(other.idbarang))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projectf.projectf.model.Barang[ idbarang=" + idbarang + " ]";
    }
    
}
