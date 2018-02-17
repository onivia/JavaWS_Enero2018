<%-- 
    Document   : cliente
    Created on : 10/02/2018, 11:38:46 AM
    Author     : ONivia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="wscliente.NewJerseyClient" session="true"%>

<!DOCTYPE html>
<%!
    enum Estados {FORMULARIO, RESPUESTA, MENSAJE};
%>
<%
    NewJerseyClient equipo;
    Estados estado = Estados.FORMULARIO;
    String cuenta = null;
    int saldo = 0;
      
    if(request.getParameter("cuenta") != null){
        cuenta = request.getParameter("cuenta");
        estado = Estados.RESPUESTA;
        saldo = Integer.valueOf(cuenta);
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cliente Rest</title>
    </head>
    <body>
        <h1>Cliente Rest - Cartera</h1>
        <% if ( estado == Estados.FORMULARIO ){%>
        <form name="form1" method="post" action="cliente.jsp">
            <table width="354">
                <tr>
                    <td width="130">Codigo de Cuenta</td>
                    <td width="84"><input type="text" name="cuenta"></td>
                    <td width="130">Abono</td>
                    <td width="84"><input type="text" name="abono"></td>
                    <td width="124"><input type="submit" value="Actualizar"></td>
                </tr>
            </table>
        </form>
        <%}else if( estado == Estados.RESPUESTA){ %>
        <table width ="257">
            <tr>
                <td width="78">Cuenta</td>
                <td width="167"><%=cuenta%></td>
            </tr>
            <tr>
                <td>Saldo</td>
                <td><%=saldo%></td>
            </tr>
        </table>
            <p><a href="cliente.jsp">Regresar</a></p>    
        <%}%>
    </body>
</html>
