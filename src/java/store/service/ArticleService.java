/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.service;

import java.util.List;
import store.dao.ArticleDAO;
import store.entity.Article;

/**
 *
 * @author admin
 */
public class ArticleService {

    public Article rechercherParId(long id) {
        ArticleDAO dao = new ArticleDAO();
        return dao.rechercherParId(id);
    }
//

    public List<Article> lister() {
        ArticleDAO dao = new ArticleDAO();
        return dao.listerTous();
    }

    public void ajouter(Article a) {
        new ArticleDAO().ajouter(a);
    }

//    public void modifier(Article article) {
//        new ArticleDAO().modifier(article);
//    }
//    
//
//    public void supprimer(long id) {
//        new ArticleDAO().supprimer(id);
//    }
}
