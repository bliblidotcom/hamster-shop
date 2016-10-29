/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.service;

import com.projectf.projectf.model.Kategori;
import com.projectf.projectf.model.User;
import java.util.List;

/**
 *
 * @author Sofrie
 */
public interface UserService {
    public List<User> getUsers();
    public User getUser(int id);
    public User saveUser(User user);
    public User updateUser(User user);
    public User deleteUser(User user);
    public User getUser(String username,String password);
    
    
}
