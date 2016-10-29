/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.dao;

import com.projectf.projectf.model.Barang;
import com.projectf.projectf.model.Kategori;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sofrie
 */
@Repository
public class BarangDaoImpl implements BarangDao{

    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public List<Barang> getBarang() {
        List<Barang> t= sessionFactory.getCurrentSession().createQuery("select b from Barang b").list();
        return t;
    }

    @Override
    public Barang getBarang(int Id) {
        return (Barang)sessionFactory.getCurrentSession().get(Barang.class,Id);
    }

    @Override
    public Barang saveBarang(Barang barang) {
        sessionFactory.getCurrentSession().save(barang);
        return barang;
    }

    @Override
    public Barang updateBarang(Barang barang) {
        sessionFactory.getCurrentSession().update(barang);
        return barang;
    }

    @Override
    public Barang getKategori(String nama) {
        Barang barang= (Barang)sessionFactory.getCurrentSession().createQuery("select b from Barang b").setParameter("namabarang", nama).uniqueResult();        
        return barang;
    }
    
}
