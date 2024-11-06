package com.rudra;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Pager
 */
@WebServlet("/demo")
public class Pager extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Pager() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String param = request.getParameter("page");
		if(param != null && param.equals("about")) {
			getServletContext().getRequestDispatcher("/about.jsp").forward(request, response);
		} else if(param!=null && param.equals("contact")) {
			getServletContext().getRequestDispatcher("/contact.jsp").forward(request, response);
		} else if(param!=null && param.equals("login")) {
			System.out.print("Login hit");
			getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
		} else if(param!=null && param.equals("signup")) {
			getServletContext().getRequestDispatcher("/signup.jsp").forward(request, response);
		} else {
			response.getWriter().append("Served at: ").append(request.getContextPath());
		}
	}

}
