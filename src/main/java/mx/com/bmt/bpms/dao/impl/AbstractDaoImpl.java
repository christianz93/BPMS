package mx.com.bmt.bpms.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by BMTHP01 on 6/2/2015.
 */
public class AbstractDaoImpl  extends HibernateDaoSupport {

    private SessionFactory sessionFactory;

    public <T> T save(final T o){
        return (T) sessionFactory.getCurrentSession().save(o);
    }


    public void delete(final Object object){
        sessionFactory.getCurrentSession().delete(object);
    }

    public <T> T get(final Class<T> type, final Long id){
        return (T) sessionFactory.getCurrentSession().get(type, id);
    }


    public <T> T merge(final T o)   {
        return (T) sessionFactory.getCurrentSession().merge(o);
    }


    public <T> void saveOrUpdate(final T o){
        sessionFactory.getCurrentSession().saveOrUpdate(o);
    }

    public <T> List<T> getAll(final Class<T> type) {
        final Session session = sessionFactory.getCurrentSession();
        final Criteria crit = session.createCriteria(type);
        return crit.list();
    }
}
