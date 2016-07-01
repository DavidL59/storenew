<%-- 
    Document   : ajout_articles
    Created on : 1 juil. 2016, 10:37:01
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <c:import url="_STYLESHEET.jsp"/>
    </head>
    <body>    
        <div class="menu">
            <c:import url="_MENU.jsp"/>
        </div>

        <div class="contenu">
            
            <h1>${utilisateur.login} veuillez ajouter un article</h1>

            <h2> Ajout des articles </h2>

            <form method="post" >
                
 <!--               <p>
                    <label for="articleid">articleid :</label>
                    <input type="hidden" name="articleid"  />
                </p>
-->
                <p>
                    <label for="titre">Nom de l'article :</label>
                    <input type="text" name="titre" placeholder="Ex : james bond" size="30" maxlength="10" />
                </p>

   <!--             <p>
                    <label for="pseudo">Description :</label>
                    <input type="text" name="description" placeholder="Ex : description sommaire de l'articile" size="30" maxlength="1200" />
                </p>
-->  
              <p>
                    <label for=genre>Prix :</label><br />
                    <input type="number" name="prix" size="30" maxlength="4" />
                </p>
                
                <p>
                    <label for=genre>Stock :</label><br />
                    <input type="number" name="stock" size="30" maxlength="4" />
                </p>
                <input type="submit" value="ajouter" />

            </form>

        </div>
    </body>
</html>