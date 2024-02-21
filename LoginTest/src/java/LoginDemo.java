/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */


import java.io.*;
import javax.servlet.http.*;

/**
 *
 * @author Lenovo
 */
public class LoginDemo extends HttpServlet {

   @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response){
        response.setContentType("text/html;charset=utf-8");
    
        
        try{
            String name = request.getParameter("user_name");
        String pass = request.getParameter("password");
            PrintWriter out = response.getWriter();
        out.println("<h2>User Name : " + name + "</h2>");
        out.println("<h2>Paassword : " + pass + "</h2>");
        }catch(Exception e){
            System.out.println(e);
        }
 
    }
    }

