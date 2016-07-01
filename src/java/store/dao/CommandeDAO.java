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
import store.entity.Commande;


/**
 *
 * @author admin
 */
public class CommandeDAO {
//        public void modifier(Commande commande){
//         EntityManager em = Persistence.createEntityManagerFactory("storePU").createEntityManager(); 
//         em.getTransaction().begin();
//         em.merge(commande);
//         em.getTransaction().commit();
//}
//    public void supprimer(long id){
//         EntityManager em = Persistence.createEntityManagerFactory("storePU").createEntityManager(); 
//         em.getTransaction().begin();
//         Query q =em.createQuery("delete from Commande c where id=:idCommande");
//         Commande c = em.find(Commande.class, id);
//         em.remove(c);
//         em.getTransaction().commit();
//    }
//    
//    // fonction cree car n'exister pas avant pour recuperer
//    public Commande rechercherParId(long id){
//        EntityManager em = Persistence.createEntityManagerFactory("storePU").createEntityManager(); 
//        return em.find(Commande.class,id);
//        
//    }
//    
//    public List<Commande> listerTous(){
//        EntityManager em = Persistence.createEntityManagerFactory("storePU").createEntityManager(); 
//        return em.createQuery("select c from Commande c ").getResultList();
//    }

    public void ajouter(Commande c) {

        EntityManager em = Persistence.createEntityManagerFactory("storePU").createEntityManager();
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();

    }
}
