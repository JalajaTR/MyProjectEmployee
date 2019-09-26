package com.emp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
		response.setDateHeader("Expires", 0);
		if(session==null || session.getAttribute("username")==null)
		{
			response.sendRedirect("homepage.jsp");
		}
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		HttpSession session;
		LoginDao dao = new LoginDao();
		
		
		if(dao.checklogin(uname, pass))
		{
			 HttpSession session = request.getSession();
			 session.setAttribute("username", uname);
			 RequestDispatcher rd = request.getRequestDispatcher("ViewEmployees");
			 rd.forward(request, response);
		}
		else
		{			 
			 out.print("<script type=\"text/javascript\">");
		     out.print("alert('User or password incorrect');");
		     out.print("window.top.location.href='homepage.jsp'");
		     out.print("</script>");
			
		     //response.sendRedirect("homepage.jsp");			
		}
	}

}
