/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.controller;

import com.projectf.projectf.AppHelper;
import com.projectf.projectf.model.User;
import com.projectf.projectf.service.KategoriService;
import com.projectf.projectf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author Sofrie
 */
@Controller
@SessionAttributes("cantik")
public class LoginController {
    @Autowired
    UserService userService;
    
    @Autowired
    KategoriService kategoriService;
    
    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String loginu(Model model){
        model.addAttribute("user", new User());
        model.addAttribute(AppHelper.TAG_CANTIK,AppHelper.cantik);
        return "login";
    }
    @RequestMapping(value = "logout",method = RequestMethod.GET)
    public String logout(Model model){
        model.addAttribute("user", new User());
        AppHelper.cantik="";
        model.addAttribute(AppHelper.TAG_CANTIK,AppHelper.cantik);
        model.addAttribute("kategoris", kategoriService.getKategoris());
        AppHelper.orang=null;
        return "indeks";
    }
    
    @RequestMapping(value = "loginuser",method = RequestMethod.POST)
    public String logged(Model model,@ModelAttribute("user") User user){
        User log=userService.getUser(user.getUsername(), user.getPassword());
        if(log==null){
            return "login";
        }
        else
        {            
            model.addAttribute("users", userService.getUsers());
            AppHelper.cantik=log.getNama();
            model.addAttribute(AppHelper.TAG_CANTIK,AppHelper.cantik);
            model.addAttribute("kategoris", kategoriService.getKategoris());
            model.addAttribute("user", log.getUserid());
            AppHelper.orang=log;
            if(log.getUserid()==1)
            {
                return "admin";
            }
            else
            {
                return "redirect:/";
            }
            
                
        }
    }
    @RequestMapping(value = "keViewIndeks",method = RequestMethod.GET)
    public String keIndeks(Model model){
        model.addAttribute("kategoris", kategoriService.getKategoris());
        return "indeks";
        
    }
    
    
}
