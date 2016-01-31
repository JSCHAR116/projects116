package com.vaadin.dev.dao;
// Generated Nov 25, 2015 8:58:05 PM by Hibernate Tools 4.3.1




import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.vaadin.dev.model.DlrUser;

/**
 * Home object for domain model class DlrUser.
 * @see gov.txdmv.etags.DlrUser
 * @author Hibernate Tools
 */
@Repository
public class DlrUserDao {

    private static final Log log = LogFactory.getLog(DlrUserDao.class);

    @PersistenceContext private EntityManager entityManager;

    public void persist(DlrUser transientInstance) {
        log.debug("persisting DlrUser instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(DlrUser persistentInstance) {
        log.debug("removing DlrUser instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public DlrUser merge(DlrUser detachedInstance) {
        log.debug("merging DlrUser instance");
        try {
            DlrUser result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public DlrUser findById( com.vaadin.dev.model.DlrUserId id) {
        log.debug("getting DlrUser instance with id: " + id);
        try {
            DlrUser instance = entityManager.find(DlrUser.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

