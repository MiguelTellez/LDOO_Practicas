<%-- 
    Document   : loginNormal
    Created on : 5/06/2019, 10:25:43 AM
    Author     : PC
--%>

<<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
    <head>
        <link rel="stylesheet" href="index.css">
        <title>Iniciar Sesion</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>

    <body><font color="white"> <form action="sesion.htm" method="post">
            <br>
            <br>
            <br>
            <br>
            <br><center>
            Usuario: <input id="Usuario" name="Usuario" type="text" value="${user}" />
            <span style="color: red">${errorUser}</span></center>
            <br>
            <br><center>
            Email: <input id="Email" name="Email" type="text" value="${email}"
            <br>
            <br>
            <br><center>
            Password: <input id="Pass" name="Pass" type="password" value="${pass}" />
            <span style="color: red">${errorPass}</span>
            <br>
            <br>
            <br>
             <body>
            <br><input type="submit" value="Login" name="lo" /></div>
            <br>
            <br>
             </color></form>

            <form action="index.htm" method="post"> 
         <br><input type="submit" value="Volver" name="o" /></div>
    </form>
            </center>
        </body>
   
</html>