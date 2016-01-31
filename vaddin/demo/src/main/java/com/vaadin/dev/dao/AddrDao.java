package com.vaadin.dev.dao;
// Generated Nov 25, 2015 8:58:05 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.vaadin.dev.model.Addr;

/**
 * Home object for domain model class Addr.
 * @see gov.txdmv.etags.Addr
 * @author Hibernate Tools
 */
@Repository
public class AddrDao {

    private static final Log log = LogFactory.getLog(AddrDao.class);

    @PersistenceContext private EntityManager entityManager;

    public void persist(Addr transientInstance) {
        log.debug("persisting Addr instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Addr persistentInstance) {
        log.debug("removing Addr instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Addr merge(Addr detachedInstance) {
        log.debug("merging Addr instance");
        try {
            Addr result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Addr findById( BigDecimal id) {
        log.debug("getting Addr instance with id: " + id);
        try {
            Addr instance = entityManager.find(Addr.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

