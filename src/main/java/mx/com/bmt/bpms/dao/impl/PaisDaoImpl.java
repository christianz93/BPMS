package mx.com.bmt.bpms.dao.impl;

import mx.com.bmt.bpms.dao.PaisDao;
import mx.com.bmt.bpms.entity.Pais;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BMTHP01 on 6/3/2015.
 */
public class PaisDaoImpl implements PaisDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    @Override
    public void savePais(Pais Pais) {
        getSession().merge(Pais);
    }

    @Transactional
    @Override
    public List<Pais> listPaiss() {
        return getSession().createCriteria(Pais.class).list();
    }

    @Transactional
    @Override
    public Pais getPais(Long id) {
        return (Pais) getSession().get(Pais.class, id);
    }

    @Transactional
    @Override
    public void deletePais(Long id) {
        Pais pais = getPais(id);
        if (null != pais) {
            getSession().delete(pais);
        }
    }

    private Session getSession() {
        Session sess = getSessionFactory().getCurrentSession();
        if (sess == null) {
            sess = getSessionFactory().openSession();
        }
        return sess;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
