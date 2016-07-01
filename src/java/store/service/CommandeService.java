/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.service;

import java.util.List;
import store.dao.ArticleDAO;
import store.dao.CommandeDAO;
import store.entity.Commande;


/**
 *
 * @author admin
 */
public class CommandeService {
    
//        public Commande rechercherParId(long id) {
//        CommandeDAO dao = new CommandeDAO();
//        return dao.rechercherParId(id);
//    }
//
//    public List<Commande> lister() {
//        CommandeDAO dao = new CommandeDAO();
//        return dao.listerTous();
//    }

    public void ajouter(Commande c) {
        new CommandeDAO().ajouter(c);
    }

//    public void modifier(Commande commande) {
//        new CommandeDAO().modifier(commande);
//    }
//    
//
//    public void supprimer(long id) {
//        new CommandeDAO().supprimer(id);
//    }
}
