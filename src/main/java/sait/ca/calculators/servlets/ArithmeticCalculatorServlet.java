/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package sait.ca.calculators.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lucky
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/arithmetic"})
public class ArithmeticCalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     *
     */
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
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
        
        int i = Integer.parseInt(request.getParameter("number1"));
        int j = Integer.parseInt(request.getParameter("number2"));
        int k;
   
//        try {
        if(request.getParameter("button").equals("+")){
            k = i + j;
            String result = String.format("Result:%d", k);
        
            request.setAttribute("result", result);
        }
        else if(request.getParameter("button").equals("-")){
            k = i - j;
            String result = String.format("Result:%d", k);
        
            request.setAttribute("result", result);
        }
        else if(request.getParameter("button").equals("%")){
            k = i / j;
            String result = String.format("Result:%d", k);
        
            request.setAttribute("result", result);
        }
        else if(request.getParameter("button").equals("*")){
            k = i * j;
            String result = String.format("Result:%d", k);
        
            request.setAttribute("result", result);
        }
        else {
            String result = String.format("Result: ---");
      
            request.setAttribute("result", result);
            
        }
//        }catch (NumberFormatException e){
//            String result = String.format("Result: ---");
//      
//            request.setAttribute("result", result);
//        }
       
        
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
     }
    

}
