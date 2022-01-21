package sait.ca.calculators.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Determines the next age of 
 * @author Lucky
 */
public class AgeCalculatorServlet extends HttpServlet {

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
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
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
        String ageInput = request.getParameter("age");    
        
        
        if(ageInput != null) {
            try {
        int age = Integer.parseInt(ageInput);
        
        age++;
        
        String message = String.format("You will be %d after your next birthday.", age);
        
        request.setAttribute("message", message);
            } catch (Exception ex){
            String message = String.format("You must give your current age.");
        
        request.setAttribute("message", message);
            }
    
        } else{
          String message = String.format("You must give your current age.");
        
        request.setAttribute("message", message);
        }
        
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }


}
