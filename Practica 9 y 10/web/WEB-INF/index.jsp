<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <link rel="stylesheet" href="index.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina de bienvenida</title>
    </head>
    <body>
        <table>
            <tr>
        <br>
        <br>
        <br> 
       
        <center><h1><font color="white">¡Bienvenido!</color></h1></center>
        </tr>
        <br><center><img src="naruto.gif" width="587" height="250" alt="naruto.gif"/></center>
        <br>
        <form action="login.htm" method="post">
            <br><center>
        Tipo de usuario:
                 
                 <select name="Usuarios">
                     <option>Administrador</option>
                    <option>Normal</option>
                    <option>Invitado</option>
           
                </select>
                 <br>
                 <button><a href="loginAdmi.jsp">Admin</a></button>
                 <button><a href="loginNormal.jsp">Normal</a>
                 <button><a href="loginInvitado.jsp">Invitado</a></button>
            <center><input type="submit" value="Iniciar Sesion" /></center>
        </form>
        <br>
        <form action="usuario.htm" method="post">
            <center><input type="submit" value="Registrar usuario nuevo" /></center>
        </form>
        </table>
    </body>
</html>
