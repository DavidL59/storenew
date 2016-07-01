<%-- 
    Document   : _MENU
    Created on : 30 juin 2016, 12:03:19
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>





    <c:if test="${utilisateur.login==null}">
        <a href="connexion">connection</a>
        <a href="inscription">Inscription</a>
    </c:if>

    <c:if test="${utilisateur.utilType=='ADMIN'}">
            <a href="ajout_article">ajout d'un article</a>
            <a href="ajout_stock_article">ajout du stock pour un article</a>
    </c:if>      

    <c:if test="${utilisateur.login!=null}">
            <a href="deconnexion">Deconnection</a>
    </c:if>  








<%--

--%> 