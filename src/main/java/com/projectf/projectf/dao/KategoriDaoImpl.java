/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.dao;

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
public class KategoriDaoImpl implements KategoriDao{

    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public List<Kategori> getKategoris() {
        List<Kategori> t= sessionFactory.getCurrentSession().createQuery("select k from Kategori k").list();
        return t;
    }

    @Override
    public Kategori getKategori(int Id) {
        return (Kategori) sessionFactory.getCurrentSession().get(Kategori.class, Id);
    }

    @Override
    public Kategori saveKategori(Kategori kategori) {
        sessionFactory.getCurrentSession().save(kategori);
        return kategori;
    }

    @Override
    public Kategori updateKategorir(Kategori kategori) {
        sessionFactory.getCurrentSession().update(kategori);
        return kategori;
    }

    @Override
    public Kategori deleteKategori(Kategori kategori) {
        sessionFactory.getCurrentSession().delete(kategori);
        return kategori;
    }

    @Override
    public Kategori getKategori(String nama) {
        Kategori t= (Kategori) sessionFactory.getCurrentSession().createQuery("select k from Kategori k where k.namakategori:nama").setParameter("namakategori", nama).uniqueResult();        
        return t;
    }
}
