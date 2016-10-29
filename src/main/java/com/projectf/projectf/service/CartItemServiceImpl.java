/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.service;

import com.projectf.projectf.dao.CartItemDao;
import com.projectf.projectf.model.CartItem;
import java.util.List;
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
public class CartItemServiceImpl implements CartItemService{

    @Autowired
    CartItemDao cartItemDao;
    
    @Override
    public List<CartItem> getCartItems() {
        return cartItemDao.getCartItems();
    }

    @Override
    public CartItem getCartItem(int Id) {
        return cartItemDao.getCartItem(Id);
    }

    @Override
    public CartItem saveCartItem(CartItem cartitem) {
        return cartItemDao.saveCartItem(cartitem);
    }

    @Override
    public CartItem updateCartItem(CartItem cartitem) {
        return cartItemDao.updateCartItem(cartitem);
    }

    @Override
    public CartItem deleteCartItem(CartItem cartitem) {
        return cartItemDao.deleteCartItem(cartitem);
    }
    
}
