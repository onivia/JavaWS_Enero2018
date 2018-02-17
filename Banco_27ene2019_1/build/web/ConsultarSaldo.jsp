<%-- 
    Document   : ConsultarSaldo
    Created on : 27/01/2018, 07:51:29 AM
    Author     : ONivia
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
    enum Estados {
        FORMULARIO,
        RESPUESTA,
        MENSAJE
    }
    Connection conn = null;
    String driver = "com.mysql.jdbc.Driver";
    String url = "";
    String user = "";
    String pwd = "";
    String mensaje = "numero de Cuenta NO Existe";
%>
<%
    Estados estado = Estados.FORMULARIO;
    String cuenta = null;
    Double saldo = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String query = "select * from cuenta where chr_cuencodigo = ?";
    
    if(conn == null) {
        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection(url,user,pwd);
    }
    
if(request.getParameter("cuenta") != null) {
    cuenta = request.getParameter("cuenta");
    ps = conn.prepareStatement(query);
    ps.setString(1, cuenta);
    rs = ps.executeQuery();
    
    if (rs.next()) {
        estado = Estados.RESPUESTA;
        saldo = rs.getDouble("dec_cuensaldo");
    }
}
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
