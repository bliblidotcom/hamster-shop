/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.dao;

import com.projectf.projectf.model.CartItem;
import com.projectf.projectf.model.User;
import com.projectf.projectf.model.Wishlist;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sofrie
 */
@Repository
public class WishlistDaoImpl implements WishlistDao{
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Wishlist> getWishlist() {
        List<Wishlist> wishlist= sessionFactory.getCurrentSession().createQuery("select w from Wishlist w").list();
        return wishlist;
    }

    @Override
    public Wishlist getWishlist(int Id) {
        return (Wishlist)sessionFactory.getCurrentSession().get(Wishlist.class,Id);
    }

    @Override
    public Wishlist saveWishlist(Wishlist wishlist) {
        sessionFactory.getCurrentSession().save(wishlist);
        return wishlist; 
    }

    @Override
    public Wishlist updateWishlist(Wishlist wishlist) {
        sessionFactory.getCurrentSession().update(wishlist);
        return wishlist;
    }

    @Override
    public Wishlist deleteWishlist(Wishlist wishlist) {
        sessionFactory.getCurrentSession().delete(wishlist);
        return wishlist;
    }

    @Override
    public List<Wishlist> getWishlistUser(int iduser) {
        //User t= (User) sessionFactory.getCurrentSession().createQuery("select u from User u where u.username=:username and u.password=:password").setParameter("username", username).setParameter("password", password).uniqueResult();        

        List<Wishlist> wishlist= sessionFactory.getCurrentSession().createQuery("select w from Wishlist w where w.iduser=:iduser").setParameter("iduser", iduser).list();
        return wishlist;
    }

    
}
