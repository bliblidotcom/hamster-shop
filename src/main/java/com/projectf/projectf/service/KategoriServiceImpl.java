/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.service;

import com.projectf.projectf.dao.KategoriDao;
import com.projectf.projectf.dao.UserDao;
import com.projectf.projectf.model.Kategori;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Sofrie
 */
@Service
@Transactional
public class KategoriServiceImpl implements KategoriService{

    @Autowired
    KategoriDao kategoriDao;
    @Override
    public List<Kategori> getKategoris() {
        return kategoriDao.getKategoris();
    }

    @Override
    public Kategori getKategori(int Id) {
        return kategoriDao.getKategori(Id);
    }

    @Override
    public Kategori saveKategori(Kategori kategori) {
        return kategoriDao.saveKategori(kategori);
    }

    @Override
    public Kategori updateKategorir(Kategori kategori) {
        return kategoriDao.updateKategorir(kategori);
    }

    @Override
    public Kategori deleteKategori(Kategori kategori) {
        return kategoriDao.deleteKategori(kategori);
    }

    @Override
    public Kategori getKategori(String nama) {
        return kategoriDao.getKategori(nama);
    }    
}
