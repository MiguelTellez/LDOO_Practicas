<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : index
    Created on : 10/03/2019, 09:13:12 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
   <link rel="stylesheet" href="index.css">
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   <body>

        <%
        // get info from request
        String usuario = request.getParameter("Usuario");
        String correo = request.getParameter("Correo");
        String dia = request.getParameter("Dia");
        String mes = request.getParameter("Mes");
        String anio = request.getParameter("Anio");
        String password = request.getParameter("Pass");
        %>

        <p>Informacion del usuario:</p>
        <table cellspacing="5" cellpadding="5" border="1">
            <tr>
                <td align="right">Usuario:</td>
                <td><%= usuario %></td>
            </tr>
            <tr>
                <td align="right">Correo electronico:</td>
                <td><%= correo %></td>
            </tr>
            <tr>
                <td align="right">Fecha de nacimiento del usuario:</td>
                <td><%= dia %> de <%= mes %> de <%= anio %></td>
            </tr>
            <tr>
                <td align="right">Password:</td>
                <td><%= password %></td>
            </tr>

        </table>

        </body>
</html>
