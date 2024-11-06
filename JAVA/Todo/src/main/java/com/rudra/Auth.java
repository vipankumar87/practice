package com.rudra;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Servlet implementation class Auth
 */
@WebServlet({ "/login", "/register" })
public class Auth extends HttpServlet {
	private static final long serialVersionUID = 1L;
    // Simulated user storage (in a real application, use a database)
    private static final String DUMMY_USERNAME = "user";
    private static final String DUMMY_PASSWORD = "pass";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Auth() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

        String path = request.getServletPath();

        if ("/login".equals(path)) {
            handleLogin(request, response);
        } else if ("/signup".equals(path)) {
            handleSignup(request, response);
        }
    }
	
    private void handleLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        // Simple authentication check
        if (DUMMY_USERNAME.equals(username) && DUMMY_PASSWORD.equals(password)) {
            out.println("<h3>Login successful. Welcome, " + username + "!</h3>");
			response.getWriter().append("Served at: ").append(request.getContextPath());
        } else {
        	out.println("<h3>Invalid username or password.</h3>");
			response.getWriter().append("Invalid at: ").append(request.getContextPath());

        }
    }

    private void handleSignup(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        // Here, you’d save the user data to a database. For simplicity, just echoing the input.
        out.println("<h3>Sign up successful! Welcome, " + username + "</h3>");
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
