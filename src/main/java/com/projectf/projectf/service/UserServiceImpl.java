/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.service;

import com.projectf.projectf.dao.KategoriDao;
import com.projectf.projectf.dao.UserDao;
import com.projectf.projectf.model.Kategori;
import com.projectf.projectf.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Sofrie
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;
    
    @Override
    public List<User> getUsers() {
       return userDao.getUsers();
    }

    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }

    @Override
    public User saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public User updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public User deleteUser(User user) {
        return userDao.deleteUser(user);
    }

    @Override
    public User getUser(String username, String password) {
           return userDao.getUser(username, password);
    }

    
}
