/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haririapps.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mohammahomarhariri
 */
@WebServlet(name = "Exercise6", urlPatterns = {"/Exercise6"})
public class Exercise6 extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("        <title>HTTP project</title>\n"
                    + "        <meta charset=\"utf-8\">\n"
                    + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"
                    + "        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n"
                    + "        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n"
                    + "        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n"
                    + "        <link href=\"newcss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n"
                    + "\n"
                    + "    <nav class=\"navbar navbar-inverse\">\n"
                    + "        <div class=\"container-fluid\">\n"
                    + "            <div class=\"navbar-header\">\n"
                    + "                <p class=\"navbar-brand\">HTTP PROJECT</p>\n"
                    + "            </div>\n"
                    + "            <ul class=\"nav navbar-nav\">\n"
                    + "                <li class=\"active\"><a href=\"index.html\">Home</a></li>\n"
                    + "                <li><a class=\"btn btn-danger\" href=\"Exercises.html\"> Exercises</a></li>\n"
                    + "            </ul>\n"
                    + "        </div>\n"
                    + "    </nav>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Exercise6</h1>");
            out.println("<table style=\"width:100%\">");

            out.println("<tr>");
            out.println("<th>Host:</th>");
            out.println("<td>" + request.getHeader("host") + "</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<th>Connection</th>");
            out.println("<td>" + request.getHeader("connection") + "</td>");
            out.println("</tr>");

            out.println("</tr>");
            out.println("<th>Cache-Control</th>");
            out.println("<td>" + request.getHeader("cache-control") + "</td>");
            out.println("</tr>");

            out.println("</tr>");
            out.println("<th>Accept</th>");
            out.println("<td>" + request.getHeader("accept") + "</td>");
            out.println("</tr>");

            out.println("</tr>");
            out.println("<th>User-Agent</th>");
            out.println("<td>" + request.getHeader("user-agent") + "</td>");
            out.println("</tr>");

            out.println("</tr>");
            out.println("<th>Accept-Encoding</th>");
            out.println("<td>" + request.getHeader("accept-encoding") + "</td>");
            out.println("</tr>");

            out.println("</tr>");
            out.println("<th>Accept-Language</th>");
            out.println("<td>" + request.getHeader("accept-language") + "</td>");
            out.println("</tr>");

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
