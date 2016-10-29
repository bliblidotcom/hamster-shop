/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.service;

import com.projectf.projectf.model.Kategori;
import java.util.List;

/**
 *
 * @author Sofrie
 */
public interface KategoriService {
    public List<Kategori> getKategoris();
    public Kategori getKategori(int Id);
    public Kategori saveKategori(Kategori kategori);
    public Kategori updateKategorir(Kategori kategori);
    public Kategori deleteKategori(Kategori kategori);
    public Kategori getKategori(String nama);
}
