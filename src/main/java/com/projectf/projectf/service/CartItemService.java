/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.service;

import com.projectf.projectf.model.CartItem;
import java.util.List;

/**
 *
 * @author Sofrie
 */
public interface CartItemService {
    public List<CartItem> getCartItems();
    public CartItem getCartItem(int Id);
    public CartItem saveCartItem(CartItem cartitem);
    public CartItem updateCartItem(CartItem cartitem);
    public CartItem deleteCartItem (CartItem cartitem);
}
