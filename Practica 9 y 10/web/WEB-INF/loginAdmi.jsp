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
         Numero de Empleado: <input id="NoEmpleado" name="Numero de Empleado" type="text" value="${user}" />
            <span style="color: red">${errorNoEmpleado}</span></center>
            <br>
            <br>
            <br>
            <br>
            <br><center>
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