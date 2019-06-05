package org.serv;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager; 

class conexion{  
    
    
 String driver = "com.mysql.cj.jdbc.Driver";
 String connection = "jdbc:mysql://127.0.0.1:3306/bd_lsti?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
 String userese = "root";
 String passwordese = "root";
    
public void conectar(int accion, String nombre, String contrasena){
    try{  
Class.forName(driver);
Connection con = DriverManager.getConnection(connection, userese, passwordese);
//switch (accion){
//
//    case 1:
      String query = " INSERT INTO bd_lsti.usuarios" +"(" +"usuario," +"contrasena)" + " values (?, ?)";
      PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setString (1, nombre);
      preparedStmt.setString (2, contrasena);
      // execute the preparedstatement
      preparedStmt.execute();
//        break;
//
//    case 2:
//        break;
//        
//        
//    default:
//        con.close();
//        break;
//}
con.close();
}catch(Exception e){

System.out.println("conectado");


}  
}
}

