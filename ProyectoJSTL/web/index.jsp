<%-- 
    Document   : index
    Created on : 3/02/2018, 11:31:55 AM
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
        <form action="siguiente.jsp" method="post">
            <center><h1>Adivine Bandas</h1></center>
            <center><p>Ingrese su nombre: <input type="text" name="nombre"/></p></center>
            <br>
            <center><p>Ingrese su apellido: <input type="text" name="apellido"/></p></center>
            <br>
            
            <p>
            <div align="center"><img src="img/img1.jpg" width="250" height="150"/></div>
            </p>
            <p>
            <div align="center"><input type="text" name="banda1"></p>
                
            <p>
            <div align="center"><img src="img/img2.jpg" width="250" height="150"/></div>
            </p>
            <p>
            <div align="center"><input type="text" name="banda2"></p>
      
            <p>
            <div align="center"><input type="submit" value="enviar"/></p>
        </form>
    </body>
</html>
