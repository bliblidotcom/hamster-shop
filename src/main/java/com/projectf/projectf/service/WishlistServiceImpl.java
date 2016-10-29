/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.service;

import com.projectf.projectf.dao.WishlistDao;
import com.projectf.projectf.model.User;
import com.projectf.projectf.model.Wishlist;
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
public class WishlistServiceImpl implements WishlistService{
    @Autowired
    WishlistDao wishlistDao;

    @Override
    public List<Wishlist> getWishlist() {
        return wishlistDao.getWishlist();
    }

    @Override
    public Wishlist getWishlist(int Id) {
        return wishlistDao.getWishlist(Id);
    }

    @Override
    public Wishlist saveWishlist(Wishlist wishlist) {
        return wishlistDao.saveWishlist(wishlist);
    }

    @Override
    public Wishlist updateWishlist(Wishlist wishlist) {
        return wishlistDao.updateWishlist(wishlist);
    }

    @Override
    public Wishlist deleteWishlist(Wishlist wishlist) {
        return wishlistDao.deleteWishlist(wishlist);
    }

    @Override
    public List<Wishlist> getWishlistUser(int iduser) {
        return wishlistDao.getWishlistUser(iduser);
    }
    
}
