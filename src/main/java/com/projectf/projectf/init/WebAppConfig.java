/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectf.projectf.init;

import java.util.Properties;
import javax.annotation.Resource;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
/**
 *
 * @author Sofrie
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.projectf.projectf")
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class WebAppConfig {
    
    @Resource
    Environment env;
    
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getRequiredProperty("db.driver"));
        dataSource.setUrl(env.getRequiredProperty("db.url"));
        dataSource.setUsername(env.getRequiredProperty("db.username"));
        dataSource.setPassword(env.getRequiredProperty("db.password"));
        
        return dataSource;
    }
    
    private Properties hibernateProperties(){
        Properties p=new Properties();
        p.put("hibernate.dialect", env.getRequiredProperty("hibernate.dialect"));
        p.put("hibernate.show_sql", env.getRequiredProperty("hibernate.show_sql"));
        p.put("hibernate.hbm2ddl.auto", env.getRequiredProperty("hibernate.hbm2ddl.auto"));
        return p;
    }
    
    @Bean
    public LocalSessionFactoryBean sessionFactory(){
        LocalSessionFactoryBean factoryBean=new LocalSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
        factoryBean.setPackagesToScan(env.getRequiredProperty("entitymanager.packages.to.scan"));
        factoryBean.setHibernateProperties(hibernateProperties());
        return factoryBean;
        
    }
    
    @Bean
    public HibernateTransactionManager transactionManager(){
        HibernateTransactionManager hibernateTransactionManager=new HibernateTransactionManager();
        hibernateTransactionManager.setSessionFactory(sessionFactory().getObject());
        return  hibernateTransactionManager;
    }
    
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver resolver=new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}