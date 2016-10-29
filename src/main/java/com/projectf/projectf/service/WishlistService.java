/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.service;

import com.projectf.projectf.model.User;
import com.projectf.projectf.model.Wishlist;
import java.util.List;

/**
 *
 * @author Sofrie
 */
public interface WishlistService {
    public List<Wishlist> getWishlist();
    public Wishlist getWishlist(int Id);
    public Wishlist saveWishlist(Wishlist wishlist);
    public Wishlist updateWishlist(Wishlist wishlist);
    public Wishlist deleteWishlist(Wishlist wishlist);
    public List<Wishlist> getWishlistUser(int iduser);
}
