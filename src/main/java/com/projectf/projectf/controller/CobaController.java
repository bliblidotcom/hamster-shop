/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.controller;

import com.projectf.projectf.AppHelper;
import com.projectf.projectf.model.Kategori;
import com.projectf.projectf.model.User;
import com.projectf.projectf.service.KategoriService;
import com.projectf.projectf.service.UserService;
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
public class CobaController {
    @Autowired
    KategoriService kategoriService;
    //UserService userService;
   
    @RequestMapping(value = "tambahKategori",method = RequestMethod.GET)
    public String loginu(Model model){
        model.addAttribute("kategori", new Kategori());
        model.addAttribute(AppHelper.TAG_CANTIK,AppHelper.cantik);
        return "tambahKategori";
    }
    @RequestMapping(value = "tambahkanKategori",method = RequestMethod.POST)
    public String adding(Model model,@ModelAttribute("kategoris") Kategori kategori){
        kategoriService.saveKategori(kategori);
        model.addAttribute("kategoris", kategoriService.getKategoris());
        return "kategori";
    }
    @RequestMapping(value = "lihatKategori",method = RequestMethod.GET)
    public String adding(Model model){
        model.addAttribute("kategoris", kategoriService.getKategoris());
        return "kategori";
    }
}
