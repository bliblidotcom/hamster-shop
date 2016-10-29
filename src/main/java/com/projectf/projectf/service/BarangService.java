/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.service;

import com.projectf.projectf.model.Barang;
import java.util.List;

/**
 *
 * @author Sofrie
 */
public interface BarangService {
    public List<Barang> getBarang();
    public Barang getBarang(int Id);
    public Barang saveBarang(Barang barang);
    public Barang updateBarang(Barang barang);
    public Barang getKategori(String nama);
}
