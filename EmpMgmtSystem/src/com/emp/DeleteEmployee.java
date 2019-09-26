package com.emp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
   
    public DeleteEmployee() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		/* PrintWriter out = response.getWriter();
		 out.print("<script type=\"text/javascript\">");
	     out.print("alert('Do you want to delete the record?');");
	     out.print("window.top.location.href='homepage.jsp'");
	     out.print("</script>");*/
		
		EmployeeDao.delete(request.getParameter("EmployeeId"));
		response.sendRedirect("ViewEmployees");
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
