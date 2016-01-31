package com.vaadin.dev.dao;
// Generated Nov 25, 2015 8:58:05 PM by Hibernate Tools 4.3.1


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.vaadin.dev.model.Cntct;
import com.vaadin.dev.model.CntctId;

/**
 * Home object for domain model class Cntct.
 * @see gov.txdmv.etags.Cntct
 * @author Hibernate Tools
 */
@Repository
public class CntctDao {

    private static final Log log = LogFactory.getLog(CntctDao.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Cntct transientInstance) {
        log.debug("persisting Cntct instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Cntct persistentInstance) {
        log.debug("removing Cntct instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Cntct merge(Cntct detachedInstance) {
        log.debug("merging Cntct instance");
        try {
            Cntct result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Cntct findById( CntctId id) {
        log.debug("getting Cntct instance with id: " + id);
        try {
            Cntct instance = entityManager.find(Cntct.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

