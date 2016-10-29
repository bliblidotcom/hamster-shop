/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.service;

import com.projectf.projectf.dao.BarangDao;
import com.projectf.projectf.model.Barang;
import com.projectf.projectf.model.Kategori;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Sofrie
 */
@Service
@Transactional
public class BarangServiceImpl implements BarangService{

    @Autowired
    BarangDao barangDao;
    
    @Override
    public List<Barang> getBarang() {
        return barangDao.getBarang();
    }

    @Override
    public Barang getBarang(int Id) {
        return barangDao.getBarang(Id);
    }

    @Override
    public Barang saveBarang(Barang barang) {
        return barangDao.saveBarang(barang);
    }

    @Override
    public Barang updateBarang(Barang barang) {
        return barangDao.updateBarang(barang);
    }

    @Override
    public Barang getKategori(String nama) {
        return barangDao.getKategori(nama);
    }
    
}
