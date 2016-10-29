/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.dao;

import com.projectf.projectf.model.Kategori;
import com.projectf.projectf.model.User;
import java.util.List;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Sofrie
 */
@Repository
public class UserDaoImpl implements UserDao{
/*
    private JdbcTemplate jdbcTemplate;
 
    public UserDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }*/
    
    @Autowired
    SessionFactory sessionFactory;
        
    @Override
    public List<User> getUsers() {
        List<User> t= sessionFactory.getCurrentSession().createQuery("select u from User u").list();
        return t;
    }
    
    @Override
    public User getUser(int Id) {
        return (User) sessionFactory.getCurrentSession().get(User.class, Id);
    }

    @Override
    public User saveUser(User user) {
        sessionFactory.getCurrentSession().save(user);
        return user;
    }

    @Override
    public User updateUser(User user) {
        sessionFactory.getCurrentSession().update(user);
        return user;
    }

    @Override
    public User deleteUser(User user) {
        sessionFactory.getCurrentSession().delete(user);
        return user;
    }

    @Override
    public User getUser(String username, String password) {
        User t= (User) sessionFactory.getCurrentSession().createQuery("select u from User u where u.username=:username and u.password=:password").setParameter("username", username).setParameter("password", password).uniqueResult();        
        return t;
    }

    
    
    
}
