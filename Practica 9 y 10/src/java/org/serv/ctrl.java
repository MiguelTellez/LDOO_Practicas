/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.serv;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager; 

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

/**
 *
 * @author PC
 */

public class ctrl extends HttpServlet {
 public static String driver = "com.mysql.cj.jdbc.Driver";
 public static String connection = "jdbc:mysql://127.0.0.1:3306/bd_lsti?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
 public static String userese = "root";
 public static String passwordese = "root";
 public static ResultSet rs;
 public static String u, c;
 public static String resultado;
 private final String  folder = "/WEB-INF";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 
 
    private Cookie cook;
   private Connection con;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        response.setContentType("text/html;charset=UTF-8");
       
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
         String action = request.getServletPath();
        
        // Control de las acciones a realizar según el *.htm
        if(action.equals("/index.htm")){
            // Guardar un atributo en la petición
            request.setAttribute("saludo", "Bienvenido a mi programa");
            
// Mostrar index.jsp
            request.getRequestDispatcher(folder+"/index.jsp").
                    forward(request, response);
            
        }else if(action.equals("/usuario.htm")){
            request.getRequestDispatcher(folder+"/usuario.jsp").
                    forward(request, response);
        }
//            else if(action.equals("/registrado.htm")){
//            request.getRequestDispatcher(folder+"/registrado.jsp").
//             forward(request, response);
            else if(action.equals("/login.htm")){
           
                
            request.getRequestDispatcher(folder+"/login.jsp").
                    forward(request, response);
          
        }
            
  
           else if(action.equals("/sesion.htm")){
               
               
      try{
      Class.forName(driver);
      con = DriverManager.getConnection(connection, userese, passwordese);
      u = request.getParameter("Usuario");
      c = request.getParameter("Pass");
      String query = "select * from bd_lsti.usuarios where usuario = '" + u + "' and contrasena = '" + c + "';";
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
                   request.getRequestDispatcher(folder+"/login.jsp").
                    forward(request, response);
               }
        }
//            else if(action.equals("/sesion.htm")){
//                String [] usuario;
//                String [] passw;
//                int cantidad  = 0;
//                Cookie ck[]=request.getCookies();  
//               
//                usuario = new String [ck.length - 1];
//                passw = new String [ck.length - 1];
//               
//                for(int i=0;i<ck.length;i++){  
//                usuario [i] = ck[i].getName();
//                passw [i] = ck[i].getValue();  
//                }  
//                
//                cantidad = ck.length;
//                
////                request.setAttribute("ps", cantidad);
//                request.getRequestDispatcher(folder+"/sesion.jsp").
//                    forward(request, response);
//        }
               
        else if(action.equals("/registrado.htm")){
            int valida = 0;
            // Obtener campos de la página
            String user = request.getParameter("Usuario");
            String pass = request.getParameter("Pass");
            String correo = request.getParameter("Correo");
          
            
            // Validación
            if(user== null || user.equals("")){
                request.setAttribute("errorUser", "Campo requerido");
                valida++;
                
            }
            if(pass==null || pass.equals("")){
                request.setAttribute("errorPass", "Campo requerido");
                valida++;
         
            }
            if(correo == null || correo.equals("")){
                request.setAttribute("errorCorreo", "Campo requerido");
                valida++;
            }
            if(valida == 0){// Todo OK
                cook = new Cookie(request.getParameter("Usuario"), "");
                cook.setMaxAge(60 * 60 * 24 * 365 * 1);
                cook.setValue(user);
                cook.setValue(correo);
                response.addCookie(cook);
                
                
                
                 
                // Hacer uso de clases Java, guardar el usuario
                // en la BD, etc...}
      try{
      Class.forName(driver);
      con = DriverManager.getConnection(connection, userese, passwordese);
      String query = " INSERT INTO bd_lsti.usuarios" +"(" +"usuario," +"contrasena)" + " values (?, ?)";
      PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setString (1, user);
      preparedStmt.setString (2, pass);
      // execute the preparedstatement
      preparedStmt.execute();
      
            con.close();
                }catch(Exception e){
                   System.out.println("no se pudo :c  " + e + con);
                }
      
                
                request.setAttribute("mensaje", "Usuario Creado correctamente");
                request.setAttribute("usuario", "");
                request.setAttribute("Pass", "");
                request.setAttribute("Correo", "");
                request.getRequestDispatcher(folder+"/registrado.jsp").
                    forward(request, response);
                
                
            }else{// ERROR
                request.setAttribute("user", user);
                request.setAttribute("pass", "");
                request.setAttribute("Correo", correo);
               
            }
            
            request.getRequestDispatcher(folder+"/usuario.jsp").
                    forward(request, response);
            
        }else{
            request.getRequestDispatcher(folder+"/error.jsp").
                    forward(request, response);
        }
    }
        }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        processRequest(request, response);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
