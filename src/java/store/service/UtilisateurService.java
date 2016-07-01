/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import store.dao.UtilisateurDAO;
import store.entity.Article;
import store.entity.Utilisateur;

/**
 *
 * @author admin
 */
public class UtilisateurService {
    
    public Utilisateur rechercherParLoginEtMdp(String login, String mdp){
        UtilisateurDAO dao= new UtilisateurDAO();
        return dao.rechercherParLoginEtMdp(login, mdp);
    }
    
    public void creerUtilisateur(Utilisateur u){
        UtilisateurDAO dao= new UtilisateurDAO();
       // if(dao.rechercheParLogin(login));
    }

        public List<Utilisateur> rechercheParLogin(String login){
        UtilisateurDAO dao = new UtilisateurDAO();
        return dao.rechercheParLogin(login);
}

        public void inscription(Utilisateur util){
            // trhow exception si login existe
            
            UtilisateurDAO dao = new UtilisateurDAO();
            List<Utilisateur> listeUtilAvecCeLogin = dao.rechercheParLogin(util.getLogin());
            
            if(listeUtilAvecCeLogin.size()>0){
            throw new RuntimeException("ce login existe déjà");
        }
            // passe l'util a un etat visiteur
            util.setUtilType(Utilisateur.TypeUtilisateur.CLIENT);
            // persiste
            dao.ajouter(util);
            }

    public void ajouter(Utilisateur u) {
        new UtilisateurDAO().ajouter(u);
    }
//
//    public void modifier(Utilisateur utilisateur){
//        new UtilisateurDAO().modifier(utilisateur);
//    }
//    
//    public void supprimer(long id){
//        new UtilisateurDAO().supprimer(id);
//}
//    
//    public List<Utilisateur> lister(){
//        UtilisateurDAO dao = new UtilisateurDAO();
//        return dao.listerTous();
//    }

}
