/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.webtrade.todelete;

import dk.webtrade.todelete.entity.Person;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author thomas
 */
@WebServlet(name = "MyServlet", urlPatterns = {"/MyServlet"})
public class MyServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        String origin = request.getParameter("origin");
        switch (origin) {
            case "index":
                index(request, response);
                break;
            case "login":
                login(request, response);
                break;
            default:
                throw new AssertionError();
        }
        
    }
    private void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        // ville normalt komme fra databasen.
        Map<Integer,Person> persons = new HashMap();
        persons.put(1, new Person("Hanne", 93, "Østre strandvej 3"));
        persons.put(2, new Person("Josephine", 24, "Østre strandvej 21"));
        persons.put(3, new Person("Karim", 41, "Østre strandvej 94"));
        persons.put(4, new Person("Karen", 44, "Østre strandvej 12"));
        
        // getParameter kommer fra brugeren via requestet
        String username = request.getParameter("username");
        
        // setAttribute bruger vi til at kommunikere fra Control til view.
        request.setAttribute("mytable", new ArrayList<Person>(persons.values()));
        
        // getSession for at sætte variablen fast på noget der ikke dør, når requestet er behandlet færdigt.
        request.getSession().setAttribute("username", username);
        
        request.getRequestDispatcher("view.jsp").forward(request, response);
    }
    private void login(HttpServletRequest req, HttpServletResponse res){
        
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
