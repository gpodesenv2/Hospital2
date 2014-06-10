/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import com.toedter.calendar.JDateChooser;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import jpa.exceptions.NonexistentEntityException;
import model.CirurgiaMaterial;
import model.Material;
import model.Medicamento;

/**
 *
 * @author Christopher
 */
public class CirurgiaMaterialJpaController implements Serializable {

    public CirurgiaMaterialJpaController() {
        this.emf = Persistence.createEntityManagerFactory("HospitalPU2");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(CirurgiaMaterial cirurgiaMaterial) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(cirurgiaMaterial);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(CirurgiaMaterial cirurgiaMaterial) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            cirurgiaMaterial = em.merge(cirurgiaMaterial);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = cirurgiaMaterial.getId();
                if (findCirurgiaMaterial(id) == null) {
                    throw new NonexistentEntityException("The cirurgiaMaterial with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            CirurgiaMaterial cirurgiaMaterial;
            try {
                cirurgiaMaterial = em.getReference(CirurgiaMaterial.class, id);
                cirurgiaMaterial.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cirurgiaMaterial with id " + id + " no longer exists.", enfe);
            }
            em.remove(cirurgiaMaterial);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<CirurgiaMaterial> findCirurgiaMaterialEntities() {
        return findCirurgiaMaterialEntities(true, -1, -1);
    }

    public List<CirurgiaMaterial> findCirurgiaMaterialEntities(int maxResults, int firstResult) {
        return findCirurgiaMaterialEntities(false, maxResults, firstResult);
    }

    private List<CirurgiaMaterial> findCirurgiaMaterialEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(CirurgiaMaterial.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public CirurgiaMaterial findCirurgiaMaterial(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(CirurgiaMaterial.class, id);
        } finally {
            em.close();
        }
    }

    public int getCirurgiaMaterialCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<CirurgiaMaterial> rt = cq.from(CirurgiaMaterial.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public List getMaterial(String codAgendamento) {
        EntityManager em = getEntityManager();
        Query materiais = em.createQuery("select a from CirurgiaMaterial a where a.agendamento.id=" + codAgendamento);
        List obs = materiais.getResultList();
        return obs;
    }

    public List getListRelatorio(Material material, JDateChooser datai, JDateChooser dataf) {
        EntityManager em = getEntityManager();
        //System.out.println("passou1");
        Query materials = em.createQuery("select a from CirurgiaMaterial a where a.material.id = :m and a.dataCirurgia > :di and a.dataCirurgia < :df");
        //System.out.println("passou2");
        materials.setParameter("di", datai.getCalendar().getTime());
        materials.setParameter("df", dataf.getCalendar().getTime());
        materials.setParameter("m", material.getId());
        // System.out.println("passou3");
        List obs = materials.getResultList();//.getResultList();
        return obs;
    }
}
