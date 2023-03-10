package com.studentmanagement.authentication;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class logoutServlet
 */
@WebServlet("/logout")
public class logoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public logoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			System.out.println("logoutServlet");
			request.getSession().removeAttribute("userName");
			request.getSession().removeAttribute("role");
			System.out.println(request.getSession().getAttribute("role"));
			System.out.println("--> killing session");
		
		response.sendRedirect("Home.jsp");
		

	}

}
