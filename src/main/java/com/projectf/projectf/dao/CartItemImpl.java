/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.dao;

import com.projectf.projectf.model.Barang;
import com.projectf.projectf.model.CartItem;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sofrie
 */
@Repository
public class CartItemImpl implements CartItemDao{
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<CartItem> getCartItems() {
        List<CartItem> cartitem= sessionFactory.getCurrentSession().createQuery("select ct from CartItem ci").list();
        return cartitem;
    }

    @Override
    public CartItem getCartItem(int Id) {
        return (CartItem)sessionFactory.getCurrentSession().get(CartItem.class,Id);
    }

    @Override
    public CartItem saveCartItem(CartItem cartitem) {
        sessionFactory.getCurrentSession().save(cartitem);
        return cartitem;    
    }

    @Override
    public CartItem updateCartItem(CartItem cartitem) {
        sessionFactory.getCurrentSession().update(cartitem);
        return cartitem;
    }    

    @Override
    public CartItem deleteCartItem(CartItem cartitem) {
        sessionFactory.getCurrentSession().delete(cartitem);
        return cartitem;
    }
    
}
