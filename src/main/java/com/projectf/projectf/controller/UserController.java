/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.controller;

import com.projectf.projectf.AppHelper;
import com.projectf.projectf.model.User;
import com.projectf.projectf.service.UserService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
/**
 *
 * @author Sofrie
 */
@Controller
@SessionAttributes("cantik")
public class UserController {
    @Autowired
    UserService userService;
  
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
    
    @RequestMapping(value = "delete/{id}",method = RequestMethod.GET)
    public String deleting(@PathVariable("id") int id){
        User user=userService.getUser(id);
        if(user==null){
            return "";
        }
        userService.deleteUser(user);
        return "redirect:/";
    }
    @RequestMapping(value = "keAdmin",method = RequestMethod.GET)
    public String keViewAdin(Model model){
        
        return "admin";
    }
    @RequestMapping(value = "ketambahUser",method = RequestMethod.GET)
    public String keViewTambahUser(Model model){
        
        return "tambahUser";
    }
}
