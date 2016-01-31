package com.vaadin.dev.dao;
// Generated Nov 25, 2015 8:58:05 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.vaadin.dev.model.Dba;

/**
 * Home object for domain model class Dba.
 * @see gov.txdmv.etags.Dba
 * @author Hibernate Tools
 */
@Repository
public class DbaDao {

    private static final Log log = LogFactory.getLog(DbaDao.class);

    @PersistenceContext private EntityManager entityManager;

    public void persist(Dba transientInstance) {
        log.debug("persisting Dba instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Dba persistentInstance) {
        log.debug("removing Dba instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Dba merge(Dba detachedInstance) {
        log.debug("merging Dba instance");
        try {
            Dba result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Dba findById( BigDecimal id) {
        log.debug("getting Dba instance with id: " + id);
        try {
            Dba instance = entityManager.find(Dba.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

