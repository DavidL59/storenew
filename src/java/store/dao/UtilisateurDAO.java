/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import store.entity.Article;
import store.entity.Utilisateur;

/**
 *
 * @author admin
 */
public class UtilisateurDAO {
//        public void modifier(Utilisateur utilisateur){
//         EntityManager em = Persistence.createEntityManagerFactory("storePU").createEntityManager(); 
//         em.getTransaction().begin();
//         em.merge(utilisateur);
//         em.getTransaction().commit();
//}
//    public void supprimer(long id){
//         EntityManager em = Persistence.createEntityManagerFactory("storePU").createEntityManager(); 
//         em.getTransaction().begin();
//         Query q =em.createQuery("delete from Utilisateur u where id=:idUtilisateur");
//         Utilisateur u = em.find(Utilisateur.class, id);
//         em.remove(u);
//         em.getTransaction().commit();
//    }
//    
//    // fonction cree car n'exister pas avant pour recuperer

    public List<Utilisateur> rechercheParLogin(String login) {

        EntityManager em = Persistence.createEntityManagerFactory("storePU").createEntityManager();

        Query q = em.createQuery("select u from Utilisateur u where u.login=:monLogin");
        q.setParameter("monLogin", login);
        return q.getResultList();
    }

    public Utilisateur rechercherParLoginEtMdp(String login, String mdp) {

        EntityManager em = Persistence.createEntityManagerFactory("storePU").createEntityManager();

        Query q = em.createQuery("select u from Utilisateur u where u.login=:monLogin and u.mdp=:monMdp");
        q.setParameter("monLogin", login);
        q.setParameter("monMdp", mdp);
        return (Utilisateur) q.getSingleResult();
    }

    public List<Article> listerTous() {

        EntityManager em = Persistence.createEntityManagerFactory("storePU").createEntityManager();
        return em.createQuery("select u from Utilisateur u ").getResultList();
    }

    public void ajouter(Utilisateur u) {

        EntityManager em = Persistence.createEntityManagerFactory("storePU").createEntityManager();
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
    }
}
