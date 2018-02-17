<%-- 
    Document   : cliente
    Created on : 3/02/2018, 10:52:27 AM
    Author     : ONivia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
     enum Estados {FORMULARIO, RESPUESTA, MENSAJE};
     
%>
<%
    Estados estado = Estados.FORMULARIO;
    String carnet = null;
    
    if(request.getParameter("carnet") != null){
        carnet =  request.getParameter("carnet");
        estado = Estados.RESPUESTA;
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta Carné</title>
    </head>
    <body>
        <% if ( estado == Estados.FORMULARIO ){%>
            <form name="form1" method="post" action="cliente.jsp">
                <h3>Entre Carné:</h3>
                <input type="text" name="carnet"/>
                <input type="submit" value="Consultar"/>
            </form>
        <%}else if( estado == Estados.RESPUESTA){ %>
            <b><%=carnet%></b>
            <p><a href="cliente.jsp">Regresar</a></p>
        <%}%>
    </body>
</html>
