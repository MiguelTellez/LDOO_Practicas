<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="index.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina de error</title>
    </head>
    <font color="white">
    <body>
        <h1>ERROR</h1>
        
        <%
            if(exception != null){
                out.println(exception.getMessage());
                StackTraceElement[] sts = exception.getStackTrace();
                for(StackTraceElement st : sts){
                    out.println(st);
                }
            }
        %>
        
    </body>
  
</html>
