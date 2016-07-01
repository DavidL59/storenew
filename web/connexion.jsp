<%-- 
    Document   : pageConnexion
    Created on : 30 juin 2016, 13:55:44
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <body>    
        <div class="menu">
            <c:import url="_MENU.jsp"/>
        </div>
        
        <div class="contenu">
            
           <h2>Veuillez remplir les champs indiqués ci-dessous afin de vous connecter</h2>
            
            <form method="post">

                <p>
                    <label for="pseudo">login :</label>
                    <input type="text" name="login" placeholder="Ex : jamesBond" size="30" maxlength="10" />
                </p>

                 <p>
                    <label for="pseudo">mot de passe :</label>
                    <input type="password" name="mdp" placeholder="" size="30" maxlength="10" />
                </p>
                <input type="submit" value="envoyer" />

            </form>
            
        </div>
    </body>
</html>
