<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : siguiente
    Created on : 3/02/2018, 11:52:56 AM
    Author     : ONivia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            int result = 0;
        %>
        
        <h1>****TU PUNTAJE*****</h1>        
        <jsp:useBean id="Ayudante" scope="session" class="coleccion.Adivina" />
        
        <jsp:getProperty name="Ayudante" property="nombre" />
        <jsp:setProperty name="Ayudante" property="nombre" />
        
        <jsp:getProperty name="Ayudante" property="apellido" />
        <jsp:setProperty name="Ayudante" property="apellido" />
        
        <jsp:getProperty name="Ayudante" property="banda1" />
        <jsp:getProperty name="Ayudante" property="banda2" />
        
        <c:if test="${pageContext.request.method == 'POST'}">
            <c:if test="${param.banda1 == 'panchos'}">
                <%result++;%>                
            </c:if>
            <c:if test="${param.banda2 == 'cacos'}">
                <%result++;%>
            </c:if>
        </c:if>
        
        <p>Tu puntaje es: <%=result%></p>
        
    </body>
</html>
