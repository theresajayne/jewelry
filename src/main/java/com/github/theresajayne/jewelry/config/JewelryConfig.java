package com.github.theresajayne.jewelry.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.util.Properties;

/**
 *
 * Created by Theresa on 12/09/2015.
 */
@Configuration
@ComponentScan(basePackages = {"com.github.theresajayne.jewelry"})
public class JewelryConfig extends WebMvcConfigurerAdapter
{
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
        registry.addResourceHandler("/css/**").addResourceLocations("/css/").setCachePeriod(32768);
        registry.addResourceHandler("/img/**").addResourceLocations("/img/").setCachePeriod(32768);
        registry.addResourceHandler("/js/**").addResourceLocations("/js/").setCachePeriod(32768);
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer)
    {
        configurer.enable();
    }

    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver()
    {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/pages/");
        resolver.setSuffix(".jsp");
        return resolver;
    }


    //Hibernate Stuff *************************************************************************************************

    @Bean
    public HibernateTemplate hibernateTemplate()
    {
        return new HibernateTemplate(sessionFactory());
    }

    @Bean(name = "sessionFactory")
    public SessionFactory sessionFactory()
    {
        LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(getDataSource());
        sessionBuilder.scanPackages("com.github.theresajayne.jewelry.entity");
        sessionBuilder.addProperties(getHibernateProperties());
        return sessionBuilder.buildSessionFactory();
    }

    @Bean(name = "dataSource")
    public DataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/jewelry");
        dataSource.setUsername("jewelry");
        dataSource.setPassword("secret");
        return dataSource;
    }

    @Bean
    public HibernateTransactionManager hibTransMan()
    {
        return new HibernateTransactionManager(sessionFactory());
    }

    private Properties getHibernateProperties()
    {
        Properties properties = new Properties();
        properties.put("hibernate.show_sql","true");
        properties.put("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
        properties.put("hibernate.hbm2ddl.auto","update");
        return properties;
    }

}
