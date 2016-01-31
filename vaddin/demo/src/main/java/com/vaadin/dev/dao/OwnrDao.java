package com.vaadin.dev.dao;
// Generated Nov 25, 2015 8:58:05 PM by Hibernate Tools 4.3.1


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.vaadin.dev.model.Ownr;
import com.vaadin.dev.model.OwnrId;

/**
 * Home object for domain model class Ownr.
 * @see gov.txdmv.etags.Ownr
 * @author Hibernate Tools
 */
@Repository
public class OwnrDao {

    private static final Log log = LogFactory.getLog(OwnrDao.class);

    @PersistenceContext private EntityManager entityManager;

    public void persist(Ownr transientInstance) {
        log.debug("persisting Ownr instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Ownr persistentInstance) {
        log.debug("removing Ownr instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Ownr merge(Ownr detachedInstance) {
        log.debug("merging Ownr instance");
        try {
            Ownr result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Ownr findById( OwnrId id) {
        log.debug("getting Ownr instance with id: " + id);
        try {
            Ownr instance = entityManager.find(Ownr.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

