package com.vaadin.dev.dao;
// Generated Nov 25, 2015 8:58:05 PM by Hibernate Tools 4.3.1


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.vaadin.dev.model.DlrLicns;
import com.vaadin.dev.model.DlrLicnsId;

/**
 * Home object for domain model class DlrLicns.
 * @see gov.txdmv.etags.DlrLicns
 * @author Hibernate Tools
 */
@Repository
public class DlrLicnsDao {

    private static final Log log = LogFactory.getLog(DlrLicnsDao.class);

    @PersistenceContext private EntityManager entityManager;

    public void persist(DlrLicns transientInstance) {
        log.debug("persisting DlrLicns instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(DlrLicns persistentInstance) {
        log.debug("removing DlrLicns instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public DlrLicns merge(DlrLicns detachedInstance) {
        log.debug("merging DlrLicns instance");
        try {
            DlrLicns result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public DlrLicns findById( DlrLicnsId id) {
        log.debug("getting DlrLicns instance with id: " + id);
        try {
            DlrLicns instance = entityManager.find(DlrLicns.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

