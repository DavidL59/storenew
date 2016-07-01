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
@WebServlet(name = "ArticleListeServlet", urlPatterns = {"/article_liste"})
public class ArticleListeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        // Charge la liste des articles
         List<Article> articleTrouves = new ArticleService().lister();
        
        // Sette cette liste request attribute
        req.setAttribute("articles", articleTrouves);
        // Forward vers JSP
        req.getRequestDispatcher("article_liste.jsp").forward(req, resp);
    }

}
