package com.emp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.net.httpserver.Filter.Chain;


@WebServlet("/ViewEmployees")
public class ViewEmployees extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    HttpSession session;  
    
    public ViewEmployees() 
    {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
		response.setDateHeader("Expires", 0);
		if(session==null || session.getAttribute("username")==null)
		{
			response.sendRedirect("homepage.jsp");
		}
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<a href='registration.jsp'>Add New Employee</a><br/>");
		//out.println("<br><br><form action="Logout"> <input type="submit" value="Logout"> </form>");
		out.println("<h1>Employees List</h1>");
		
		List<Employee> list=EmployeeDao.getAllEmployees();
		
		out.print("<table border='1' width='100%'");
		out.print("<tr><th>EmploeeId</th><th>FirstName</th><th>LastName</th><th>Qualification</th><th>Designation</th><th>DateOfJoining</th><th>Manager</th><th>WorkingOnProject</th><th>ProjectFromDate</th><th>ToDate</th><th>SkillSet</th><th>Edit/Delete</th></tr>");
		for(Employee e:list)
		{
			out.print("<tr><td>"+e.getEmployeeId()+"</td><td>"+e.getFirstName()+"</td><td>"+e.getLastName()+"</td><td>"+e.getQualification()+"</td><td>"+e.getDesignation()+"</td><td>"+e.getDateOfJoining()+"</td><td>"+e.getManager()+"</td><td>"+e.getWorkingOnProject()+"</td>"
					+ "<td>"+e.getProjectFromDate()+"</td><td>"+e.getToDate()+"</td><td>"+e.getSkillSet()+"</td><td><a href='EditEmployees?EmployeeId="+e.getEmployeeId()+"'>edit</a>     <a href='DeleteEmployee?EmployeeId="+e.getEmployeeId()+"'>delete</a></td></tr>");
		}
		out.print("</table>");
		 
		out.close();
	}
	



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
