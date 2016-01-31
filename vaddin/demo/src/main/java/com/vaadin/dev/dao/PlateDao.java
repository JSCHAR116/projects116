package com.vaadin.dev.dao;
// Generated Nov 25, 2015 8:58:05 PM by Hibernate Tools 4.3.1



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.vaadin.dev.model.Plate;
import com.vaadin.dev.model.PlateId;

/**
 * Home object for domain model class Plate.
 * @see gov.txdmv.etags.Plate
 * @author Hibernate Tools
 */
@Repository
public class PlateDao {

    private static final Log log = LogFactory.getLog(PlateDao.class);

    @PersistenceContext private EntityManager entityManager;

    public void persist(Plate transientInstance) {
        log.debug("persisting Plate instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Plate persistentInstance) {
        log.debug("removing Plate instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Plate merge(Plate detachedInstance) {
        log.debug("merging Plate instance");
        try {
            Plate result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Plate findById( PlateId id) {
        log.debug("getting Plate instance with id: " + id);
        try {
            Plate instance = entityManager.find(Plate.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

