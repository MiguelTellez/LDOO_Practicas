<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : index
    Created on : 10/03/2019, 09:13:12 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link rel="stylesheet" href="index.css">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sesion iniciada</title>
    </head>
    <body>
                <%
        // get info from request
     Cookie ck[]=request.getCookies();  
     String use;
     use = request.getParameter("Usuario");
     boolean validado = false;
     int indice = 0;
    for(int i=0;i<ck.length -1;i++){  
        if(use.equals(ck[i].getName())){
           validado = true;
           indice = i;
           i = ck.length;  
        }      
}  
    if(validado == true){
        out.print("<br><h2><center><font color="+ "white"+ "> Bienvenido de nuevo  </color>" + ck[indice].getName()+"</h2></center>");
    }else{
        out.print("<br><h2><center><font color="+ "white"+ "> El usuario ingresado no existe</color></h2></size></center>" );
    }
        %>
        
       <form action="login.htm" method="post"> 
           <center>
           <br><input type="submit" value="Volver" name="back" /></div>
           </center>
        </form>
    </body>
</html>
