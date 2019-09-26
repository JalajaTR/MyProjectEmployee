package com.emp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EditEmployees")
public class EditEmployees extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    
    public EditEmployees() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Update Employee</h1>");
		
		
		Employee e=EmployeeDao.getEmployeeById(request.getParameter("EmployeeId"));
		
		out.print("<form action='EditEmployee2' method='post'>");
		out.print("<table>");
		out.print("<tr><td>EmployeeId</td><td><input type='text' name='EmployeeId' value='"+e.getEmployeeId()+"'/></td></tr>");
		out.print("<tr><td>FirstName:</td><td><input type='text' name='FirstName' value='"+e.getFirstName()+"'/></td></tr>");
		out.print("<tr><td>LastName:</td><td><input type='text' name='LastName' value='"+e.getLastName()+"'/></td></tr>");
		out.print("<tr><td>DOB:</td><td><input type='date' name='DOB' value='"+e.getDOB()+"'/></td></tr>");
		out.print("<tr><td>Gender:</td><td><input type='text' name='Gender' value='"+e.getGender()+"'/></td></tr>");
		out.print("<tr><td>Qualification:</td><td><input type='text' name='Qualification' value='"+e.getQualification()+"'/></td></tr>");
		out.print("<tr><td>Phone:</td><td><input type='number' name='Phone' value='"+e.getPhone()+"'/></td></tr>");
		out.print("<tr><td>Address:</td><td><input type='text' name='Address' value='"+e.getAddress()+"'/></td></tr>");
		out.print("<tr><td>Designation:</td><td><input type='text' name='Designation' value='"+e.getDesignation()+"'/></td></tr>");
		out.print("<tr><td>DateOfJoining:</td><td><input type='Date' name='DateOfJoining' value='"+e.getDateOfJoining()+"'/></td></tr>");
		out.print("<tr><td>Manager:</td><td><input type='text' name='Manager' value='"+e.getManager()+"'/></td></tr>");
		out.print("<tr><td>WorkingOnProject:</td><td><input type='text' name='WorkingOnProject' value='"+e.getWorkingOnProject()+"'/></td></tr>");
		out.print("<tr><td>ProjectFromDate:</td><td><input type='Date' name='ProjectFromDate' value='"+e.getProjectFromDate()+"'/></td></tr>");
		out.print("<tr><td>ToDate:</td><td><input type='Date' name='ToDate' value='"+e.getToDate()+"'/></td></tr>");
		out.print("<tr><td>SkillSet:</td><td><input type='text' name='SkillSet' value='"+e.getSkillSet()+"'/></td></tr>");
		out.print("<tr><td>username:</td><td><input type='text' name='username' value='"+e.getUsername()+"'/></td></tr>");
		out.print("<tr><td>password:</td><td><input type='text' name='password' value='"+e.getPassword()+"'/></td></tr>");
		out.print("</table>");
		out.print("<input type='submit' value='Edit &amp; Save '/>");
		out.print("</form>");
		out.close();
	}




	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
