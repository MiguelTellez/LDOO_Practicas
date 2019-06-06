
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.serv.ctrl.c;
import static org.serv.ctrl.connection;
import static org.serv.ctrl.driver;
import static org.serv.ctrl.passwordese;
import static org.serv.ctrl.resultado;
import static org.serv.ctrl.rs;
import static org.serv.ctrl.u;
import static org.serv.ctrl.userese;

public class Admin implements Ifab {
 public static String driver = "com.mysql.cj.jdbc.Driver";
 public static String connection = "jdbc:mysql://127.0.0.1:3306/bd_lsti?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
 public static String userese = "root";
 public static String passwordese = "root";
 public static ResultSet rs;
 public static String u, c, num, dir, corr;
 public static String resultado;
 private Connection con;
 private final String  folder = "/WEB-INF";
 public boolean login = false;
 
 
 
 
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
            String user = request.getParameter("Usuario");
            String pass = request.getParameter("Pass");
            String correo = request.getParameter("Correo");
            String numero = request.getParameter("numero");
            String direccion = request.getParameter ("direccion");
       
            Admin.u = user;
            Admin.c = pass;
            Admin.num = numero;
            Admin.dir = direccion;
            Admin.corr = correo;
            
            
            
         
      if(login == true){
            
      try{
      Class.forName(driver);
      con = DriverManager.getConnection(connection, userese, passwordese);
      u = request.getParameter("Usuario");
      c = request.getParameter("Pass");
      String query = "select * from bd_lsti.usuarios where usuario = '" + u + "' and contrasena = '" + c + "'" + "and admin = true"+ ";";
      PreparedStatement preparedStmt = con.prepareStatement(query);
      rs = preparedStmt.executeQuery();
    if(rs.next())  {
    resultado=new String(rs.getString(1)); 
}
      //preparedStmt.setString (1, user);
     // preparedStmt.setString (2, pass);
      // execute the preparedstatement
     // preparedStmt.execute();
      
            con.close();
                }catch(Exception e){
                   System.out.println("no se pudo :c  " + e + "select * from bd_lsti.usuarios where usuario = '" + u + "' and contrasena = '" + c + "';" + resultado);
                }
               
               if(resultado != null){
                   System.out.println(resultado);
                   resultado = null;
                   rs = null;
            request.getRequestDispatcher(folder+"/sesion.jsp").
                    forward(request, response);
               }else{
                   
                   System.out.println(resultado);
                   resultado = null;
                   rs = null;
                   request.getRequestDispatcher(folder+"/loginAdmi.jsp").
                    forward(request, response);
               }
        }      
  }
            
            
 @Override
 public void registrar(){
  try{
           
      Class.forName(driver);
      con = DriverManager.getConnection(connection, userese, passwordese);
      String query = " INSERT INTO bd_lsti.usuarios" +"(" +"usuario," +"contrasena," +"numerodeempleado,"+"direccion," +"correo," + "admin)"+ " values (?,?,?,?,?,?)";
      PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setString (1, u);
      preparedStmt.setString (2, c);
      preparedStmt.setString (3, num);
      preparedStmt.setString (4, dir);
      preparedStmt.setString (5, corr);
      preparedStmt.setBoolean (6, true);
      // execute the preparedstatement
      preparedStmt.execute();
      
            con.close();
                }catch(ClassNotFoundException | SQLException e){
                   System.out.println("no se pudo :c  " + e + con);
                }    
 }
 

    @Override
    public void iniciarsesion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}