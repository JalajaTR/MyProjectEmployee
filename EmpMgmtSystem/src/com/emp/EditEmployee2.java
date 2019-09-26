package com.emp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EditEmployee2")
public class EditEmployee2 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    
    public EditEmployee2() 
    {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
		Employee e=new Employee();
		e.setEmployeeId(request.getParameter("EmployeeId"));
		e.setFirstName(request.getParameter("FirstName"));
		e.setLastName(request.getParameter("LastName"));
		
		
		String DOBdate = request.getParameter("DOB");
		SimpleDateFormat availDate = new SimpleDateFormat("yyyy-mm-dd");
		Date dobdate = new Date(availDate.parse(DOBdate).getTime());
		e.setDOB(dobdate);
		
		
		e.setGender(request.getParameter("Gender"));
		e.setQualification(request.getParameter("Qualification"));
		e.setPhone(request.getParameter("Phone"));
		e.setAddress(request.getParameter("Address"));
		e.setDesignation(request.getParameter("Designation"));
		e.setManager(request.getParameter("Manager"));
		
		String DOJdate = request.getParameter("DateOfJoining");
		SimpleDateFormat Doj = new SimpleDateFormat("yyyy-mm-dd");
		Date dojdate = new Date(Doj.parse(DOJdate).getTime());
		e.setDateOfJoining(dojdate);
		e.setManager(request.getParameter("Manager"));
		e.setWorkingOnProject(request.getParameter("WorkingOnProject"));
		String PFD = request.getParameter("ProjectFromDate");
		if(PFD!=null && PFD!="") 
		{
			SimpleDateFormat pfd = new SimpleDateFormat("yyyy-mm-dd");
			Date pfdate = new Date(pfd.parse(PFD).getTime());
			e.setProjectFromDate(pfdate);
		}
		else
			e.setProjectFromDate(null);
		
		String PTD = request.getParameter("ProjectFromDate");
		if(PTD!=null && PTD!="")
		{
			SimpleDateFormat ptd = new SimpleDateFormat("yyyy-mm-dd");
			Date ptdate = new Date( ptd.parse(PTD).getTime());// availableDate is a String Array not a String.
			e.setToDate(ptdate);
		}
		else
		{
			e.setToDate(null);
		}
		
		
		e.setSkillSet(request.getParameter("SkillSet"));
		e.setUsername(request.getParameter("username"));
		
		e.setPassword(request.getParameter("password"));
		
		int status=EmployeeDao.update(e);
		if(status>0)
		{
			response.sendRedirect("ViewEmployees");
		}
		else
		{
			out.println("Sorry! unable to update record");
		}}
		catch(Exception e)
		{
			out.print(e);
		}
		
		out.close();
	}



	}


