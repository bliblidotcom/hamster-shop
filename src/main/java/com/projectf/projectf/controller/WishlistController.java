/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.controller;

import com.projectf.projectf.AppHelper;
import com.projectf.projectf.model.Barang;
import com.projectf.projectf.model.CartItem;
import com.projectf.projectf.model.User;
import com.projectf.projectf.model.Wishlist;
import com.projectf.projectf.service.BarangService;
import com.projectf.projectf.service.CartItemService;
import com.projectf.projectf.service.KategoriService;
import com.projectf.projectf.service.UserService;
import com.projectf.projectf.service.WishlistService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Sofrie
 */
@Controller
public class WishlistController {
    @Autowired
    WishlistService wishlistService;   
    
    @Autowired
    BarangService barangService;
    
    @Autowired
    UserService userService;
    
    @Autowired
    KategoriService ketegoriService;
    
    @Autowired
    CartItemService cartItemService;
    
    @RequestMapping(value = "semuawishlist",method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("wishlists", wishlistService.getWishlist());        
        model.addAttribute(AppHelper.TAG_CANTIK,AppHelper.cantik);        
        return "wishlistSemua";
    }   
   
    @RequestMapping(value = "keTambahWishlist",method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("wishlist", new Wishlist());
        model.addAttribute(AppHelper.TAG_CANTIK,AppHelper.cantik);
        return "tambahWishlist";
    }
     @RequestMapping(value = "keSemuaWishlist",method = RequestMethod.GET)
    public String sWishlist(Model model){
        model.addAttribute("wishlists", wishlistService.getWishlist());
        return "wishlistSemua";
    }
    @RequestMapping(value = "addWishlist/{idbarang}/{iduser}",method = RequestMethod.GET)
    public String saveToWishlist(Model model,@PathVariable("idbarang") Integer idbarang,@PathVariable("iduser") Integer iduser){
        User user=userService.getUser(iduser);
        Barang barang=barangService.getBarang(idbarang);
        Wishlist wishlist=new Wishlist();
        wishlist.setIduser(iduser);
        wishlist.setIdbarang(idbarang);
        wishlist.setNamabarang(barang.getNamabarang());
        wishlist.setTanggalinput(new Date());
        
        wishlistService.saveWishlist(wishlist);
        model.addAttribute("user", user);
        model.addAttribute(AppHelper.TAG_CANTIK,AppHelper.cantik);
        model.addAttribute("kategoris", ketegoriService.getKategoris());
        return "indeks";
    }
    @RequestMapping(value = "keDeleteWishlist/{id}/{iduser}",method = RequestMethod.GET)
    public String editing(Model model,@ModelAttribute("id") Integer id,@PathVariable("iduser") Integer iduser){
        Wishlist wishlist=wishlistService.getWishlist(id);
        //wishlistService.deleteWishlist(wishlist);
        if(wishlist==null){
            return "";
        }
        wishlistService.deleteWishlist(wishlist);
        model.addAttribute("wishlists", wishlistService.getWishlistUser(iduser));
        model.addAttribute(AppHelper.TAG_CANTIK,AppHelper.cantik);
        model.addAttribute("kategoris", ketegoriService.getKategoris());
        model.addAttribute("user", userService.getUser(iduser));
        return "wishlistUser";
    }
     @RequestMapping(value = "userWishlist/{id}",method = RequestMethod.GET)
    public String add(Model model,@PathVariable("id") Integer id){
        //model.addAttribute("wishlists", wishlistService.getWishlistUser(id));  
        User user=userService.getUser(id);
        model.addAttribute("user", userService.getUser(id));
        model.addAttribute("wishlists", wishlistService.getWishlistUser(id));
        model.addAttribute(AppHelper.TAG_CANTIK,AppHelper.cantik);
        return "wishlistUser";
    }
    
    @RequestMapping(value = "keMoveToCart/{id}/{iduser}",method = RequestMethod.GET)
    public String moveKeCart(Model model,@ModelAttribute("id") Integer id,@PathVariable("iduser") Integer iduser){
        Wishlist wishlist=wishlistService.getWishlist(id);
        //wishlistService.deleteWishlist(wishlist);
        //cartItemService
        Barang barang=barangService.getBarang(wishlist.getIdbarang());
        
        CartItem cartitem=new CartItem();
        cartitem.setIdbarang(wishlist.getIdbarang());
        cartitem.setJumlahbarang(1);
        cartitem.setTotalcost(barang.getHargajual());
        if(wishlist==null){
            return "";
        }
        wishlistService.deleteWishlist(wishlist);
        model.addAttribute("wishlists", wishlistService.getWishlistUser(iduser));
        model.addAttribute(AppHelper.TAG_CANTIK,AppHelper.cantik);
        model.addAttribute("kategoris", ketegoriService.getKategoris());
        model.addAttribute("user", userService.getUser(iduser));
        return "wishlistUser";
    }
    /*
     @RequestMapping(value = "keSemuaWishlist",method = RequestMethod.GET)
    public String sWishlist(Model model){
        model.addAttribute("wishlists", wishlistService.getWishlist());
        return "wishlistSemua";
    }
    @RequestMapping(value = "edit/{id}",method = RequestMethod.GET)
    public String edit(Model model,@PathVariable("id") Integer id){
        User user=userService.getUser(id);
        if(user==null){
            return "tidakada";
        }
        model.addAttribute("user", user);
        model.addAttribute(AppHelper.TAG_CANTIK,AppHelper.cantik);
        return "editUser";
    }
    @RequestMapping(value = "tambahUser",method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("user", new User());
        model.addAttribute(AppHelper.TAG_CANTIK,AppHelper.cantik);
        return "tambahUser";
    }
    @RequestMapping(value = "edit/{id}",method = RequestMethod.GET)
    public String edit(Model model,@PathVariable("id") Integer id){
        User user=userService.getUser(id);
        if(user==null){
            return "tidakada";
        }
        model.addAttribute("user", user);
        model.addAttribute(AppHelper.TAG_CANTIK,AppHelper.cantik);
        return "editUser";
    }
    
    @RequestMapping(value = "edit",method = RequestMethod.POST)
    public String editing(@ModelAttribute("user") User user){
        userService.updateUser(user);
        return "redirect:/";
    }
    */
    
    
    /*@RequestMapping(value = "addWishlist",method = RequestMethod.POST)
    public String adding(Model model,@ModelAttribute("wishlist") Wishlist wishlist){
        wishlistService.saveWishlist(wishlist);        
        model.addAttribute("wishlists", wishlistService.getWishlist());        
        model.addAttribute(AppHelper.TAG_CANTIK,AppHelper.cantik);        
        return "wishlistSemua";
    }*/
    
    
}
