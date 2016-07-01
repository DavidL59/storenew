<%-- 
    Document   : article_liste
    Created on : 30 juin 2016, 14:09:47
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
            
            
            
<c:forEach items="${article}" var="articles">
                ${articles.ID} ${questionAct.nom}</br>
</c:forEach>
            
        </div>
    </body>
</html>

