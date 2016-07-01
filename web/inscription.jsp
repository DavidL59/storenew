<%-- 
    Document   : inscription
    Created on : 30 juin 2016, 11:52:34
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
    </head>
    <body>    
        <div class="menu">
            <c:import url="_MENU.jsp"/>
        </div>

        <div class="contenu">

            <h1>Nouvelle inscription</h1>

            <h3>Veuillez remplir les champs indiqués ci-dessous afin de vous inscrire, vous serez connectez automatiquement</h3>

            <form method="post" >

                <p>
                    <label for="pseudo">login :</label>
                    <input type="text" name="login" placeholder="Ex : jamesBond" size="30" maxlength="10" />
                </p>

                <p>
                    <label for="pseudo">mot de passe :</label>
                    <input type="password" name="mdp" size="30" maxlength="10" />
                </p>
                <input type="submit" value="envoyer" />

            </form>
        </div>
    </body>
</html>
