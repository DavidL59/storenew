/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import store.entity.Article;
import store.service.ArticleService;

/**
 *
 * @author admin
 */
@WebServlet(name = "AjoutArticleServlet", urlPatterns = {"/ajout_article"})
public class AjoutArticleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Article> articleListe = new ArticleService().lister();

        req.setAttribute("articles", articleListe);

        req.getRequestDispatcher("ajout_articles.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

      

        Article a = new Article();
        a.setNom(req.getParameter("titre"));
        a.setPrix(Double.parseDouble(req.getParameter("prix")));
        a.setStock(Long.parseLong(req.getParameter("stock")));
        //a.setDescription(req.getParameter("description"));
      

        // persiste
        new ArticleService().ajouter(a);

        // forward vers liste film 
        resp.sendRedirect("article_liste");
    }

}
