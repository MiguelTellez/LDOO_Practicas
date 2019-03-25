/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
@WebServlet(urlPatterns = {"/index"})
public class index extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
             String usuario = request.getParameter("Usuario");
             String correo = request.getParameter("Correo");
             String dia = request.getParameter("Dia");
             String mes = request.getParameter("Mes");
             String anio = request.getParameter("Anio");
             String password = request.getParameter("Pass");
           
            out.println("<!DOCTYPE html>");
            out.println("<link rel=\"stylesheet\" href=\"index.css\">");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet index</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Informacion del usuario:</p>");
            out.println("<table cellspacing=\"5\" cellpadding=\"5\" border=\"1\">");
            out.println("<tr>\n" + "<td align=\"right\">Usuario:</td>\n" + "<td>" + usuario + "</td>\n" + "</tr>");
            out.println("<tr>\n" +"<td align=\"right\">Correo electronico:</td>\n" + "<td>" + correo + "</td>\n" +"</tr>");
            out.println("<tr>\n" +"<td align=\"right\">Fecha de nacimiento del usuario:</td>\n" +"<td>" + dia + " de " + mes + " de " + anio + "></td>\n" +"</tr>");
            out.println("<tr>\n" + "<td align=\"right\">Password:</td>\n" + "<td>" + password + "</td>\n" +"</tr>\n" +"\n" +"</table>");
            out.println("</body>");
            out.println("</html>");
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
