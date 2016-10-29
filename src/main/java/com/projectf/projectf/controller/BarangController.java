/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.controller;

import com.projectf.projectf.AppHelper;
import com.projectf.projectf.model.Barang;
import com.projectf.projectf.service.BarangService;
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
public class BarangController {
    @Autowired
    BarangService barangService;
    
    //UserService userService;
   
    
    @RequestMapping(value = "SemuaBarang",method = RequestMethod.GET)
    public String lihatBarang(Model model){
        model.addAttribute("barangs", barangService.getBarang());
        return "viewSemuaBarang";
    }
    @RequestMapping(value = "tambahBarang",method = RequestMethod.GET)
    public String loginu(Model model){
        model.addAttribute("barang", new Barang());
        model.addAttribute(AppHelper.TAG_CANTIK,AppHelper.cantik);
        return "viewTambahBarang";
    }
    @RequestMapping(value = "tambahkanBarang",method = RequestMethod.POST)
    public String adding(Model model,@ModelAttribute("barangs") Barang barang){
        barangService.saveBarang(barang);
        model.addAttribute("barangs", barangService.getBarang());
        return "viewSemuaBarang";
    }
   /* @RequestMapping(value = "lihatKategori",method = RequestMethod.GET)
    public String adding(Model model){
        model.addAttribute("kategoris", kategoriService.getKategoris());
        return "kategori";
    }*/
    
}
