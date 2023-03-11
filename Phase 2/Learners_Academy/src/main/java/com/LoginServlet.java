package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
		RequestDispatcher rd1 = request.getRequestDispatcher("welcome.html");
		RequestDispatcher rd2 = request.getRequestDispatcher("login.html");
		response.setContentType("text/html");
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		if(username.equals("admin") && password.equals("admin123")) {
			rd1.forward(request, response);
		}else {
			pw.println("Bad username or password");
			rd2.include(request, response);
		}
	}

}
