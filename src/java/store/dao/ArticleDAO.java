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

/**
 *
 * @author admin
 */
public class ArticleDAO {

//    public void modifier(Article article){
//         EntityManager em = Persistence.createEntityManagerFactory("storePU").createEntityManager(); 
//         em.getTransaction().begin();
//         em.merge(article);
//         em.getTransaction().commit();
//}
//    public void supprimer(long id){
//         EntityManager em = Persistence.createEntityManagerFactory("storePU").createEntityManager(); 
//         em.getTransaction().begin();
//         Query q =em.createQuery("delete from Article a where id=:idArticle");
//         Article a = em.find(Article.class, id);
//         em.remove(a);
//         em.getTransaction().commit();
//    }
//    
//  
    public Article rechercherParId(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("storePU").createEntityManager();
        return em.find(Article.class, id);    
      }
        //    
    public List<Article> listerTous() {
        EntityManager em = Persistence.createEntityManagerFactory("storePU").createEntityManager();
        return em.createQuery("select a from Article a ").getResultList();
    }

    public void ajouter(Article a) {
        EntityManager em = Persistence.createEntityManagerFactory("storePU").createEntityManager();
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
    }

}
