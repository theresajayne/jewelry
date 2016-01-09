package com.github.theresajayne.jewelry.dao;

import com.github.theresajayne.jewelry.entity.Category;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Dao for Category
 * Created by Theresa on 27/12/2015.
 */
@Transactional
@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao
{
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public List<Category> list()
    {

        Query query = hibernateTemplate.getSessionFactory().getCurrentSession().createQuery("from Category");
        return query.list(); //You are accessing  as list<Category>
    }

    @Override
    public List<Category> listActive() {
        Query query = hibernateTemplate.getSessionFactory().getCurrentSession().createQuery("from Category where active = true");
        return query.list(); //You are accessing  as list<Category>
    }

    @Override
    public Category get(long id) {
        return null;
    }

    @Override
    public Category get(String name) {
        Query query = hibernateTemplate.getSessionFactory().getCurrentSession().createQuery("from Category where categoryName = :name");
        query.setString("name", name);
        return (Category) query.uniqueResult(); //You are accessing  as list<Category>
    }


    @Override
    public void saveOrUpdate(Category category)
        {

    }

    @Override
    public void delete(long id) {

    }
}
