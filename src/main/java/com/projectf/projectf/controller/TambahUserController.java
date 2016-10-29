/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.controller;

import com.projectf.projectf.AppHelper;
import com.projectf.projectf.model.User;
import com.projectf.projectf.service.BarangService;
import com.projectf.projectf.service.KategoriService;
import com.projectf.projectf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Sofrie
 */
@Controller
public class TambahUserController {
    @Autowired
    UserService userService;
    
    @Autowired
    BarangService barangService;
    
    @Autowired
    KategoriService kategoriService;
    
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(Model model){
        //model.addAttribute("users", userService.getUsers());
        model.addAttribute("kategoris", kategoriService.getKategoris());
        //AppHelper.cantik="";
        model.addAttribute(AppHelper.TAG_CANTIK,AppHelper.cantik);
        if(AppHelper.cantik=="")
        {
            model.addAttribute("user", null);
        }
        else
        {
            model.addAttribute("user",AppHelper.orang);
        }
        //model.addAttribute("barangs", barangService.getBarang());
        return "indeks";
    }
    
    @RequestMapping(value = "tambahUser",method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("user", new User());
        model.addAttribute(AppHelper.TAG_CANTIK,AppHelper.cantik);
        return "tambahUser";
    }
    @RequestMapping(value = "tambah",method = RequestMethod.POST)
    public String adding(@ModelAttribute("user") User user){
        userService.saveUser(user);        
        return "redirect:/";
    }
    
    @RequestMapping(value = "keViewUser",method = RequestMethod.GET)
    public String viewU(Model model){
        
        model.addAttribute("users", userService.getUsers());
        return "viewUser";
    }
}
