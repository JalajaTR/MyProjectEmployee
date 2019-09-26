package com.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;


@WebServlet("/EmployeeSaveDao")
public class EmployeeDao extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	public static Connection getConnection()
	{
		Connection conn=null;
		 try 
    	 {
    		 Class.forName("com.mysql.jdbc.Driver");
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpMgmt","root","root");
    	 }
    	 catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
		return conn;
    }
	
	
	public static int save(Employee e){
		int status=0;
		try{
			HttpServletRequest req;
			Connection con=EmployeeDao.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into Employees(EmployeeId,FirstName,LastName,DOB,Gender,Qualification,Phone,Address,Designation,DateOfJoining,Manager,WorkingOnProject,ProjectFromDate,ToDate,SkillSet,username,password) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, e.getEmployeeId());
			ps.setString(2, e.getFirstName());
			ps.setString(3, e.getLastName());
			
			ps.setDate(4, e.getDOB());
			ps.setString(5, e.getGender());
			ps.setString(6, e.getQualification());
			ps.setString(7, e.getPhone());
			ps.setString(8, e.getAddress());
			ps.setString(9, e.getDesignation());
			ps.setDate(10, e.getDateOfJoining());
			ps.setString(11, e.getManager());
			ps.setString(12, e.getWorkingOnProject());
			ps.setDate(13, e.getProjectFromDate());
			ps.setDate(14, e.getToDate());
			ps.setString(15, e.getSkillSet());
			ps.setString(16, e.getUsername());
			ps.setString(17, e.getPassword());
			
			
			status=ps.executeUpdate();
			
			con.close();
		}
		catch(Exception ex){ex.printStackTrace();}
		
		return status;
	}
	
	
	
	public static List<Employee> getAllEmployees(){
		List<Employee> list=new ArrayList<Employee>();
		
		try{
			Connection con=EmployeeDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from Employees");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Employee e=new Employee();
				e.setEmployeeId(rs.getString(1));
				e.setFirstName(rs.getString(2));
				e.setLastName(rs.getString(3));
				e.setDOB(rs.getDate(4));
				e.setGender(rs.getString(5));
				e.setQualification(rs.getString(6));
				e.setPhone(rs.getString(7));
				e.setAddress(rs.getString(8));
				e.setDesignation(rs.getString(9));
				e.setDateOfJoining(rs.getDate(10));
				e.setManager(rs.getString(11));
				e.setWorkingOnProject(rs.getString(12));
				e.setProjectFromDate(rs.getDate(13));
				e.setToDate(rs.getDate(14));
				e.setSkillSet(rs.getString(15));
				e.setUsername(rs.getString(16));
				e.setPassword(rs.getString(17));
				list.add(e);
			}
			con.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
	public static int update(Employee e)
	{
		int status=0;
		try
		{
			Connection con=EmployeeDao.getConnection();
			PreparedStatement ps=con.prepareStatement("update Employees set FirstName=?,LastName=?,DOB=?,Gender=?,Qualification=?,Phone=?,Address=?,Designation=?, DateOfJoining=?, Manager=?, WorkingOnProject=?, ProjectFromDate=?,ToDate=?, SkillSet=?, username=?, password=? where EmployeeId=?");
			
			ps.setString(1, e.getFirstName());
			ps.setString(2, e.getLastName());
			
			ps.setDate(3, e.getDOB());
			ps.setString(4, e.getGender());
			ps.setString(5, e.getQualification());
			ps.setString(6, e.getPhone());
			ps.setString(7, e.getAddress());
			ps.setString(8, e.getDesignation());
			ps.setDate(9, e.getDateOfJoining());
			ps.setString(10, e.getManager());
			ps.setString(11, e.getWorkingOnProject());
			ps.setDate(12, e.getProjectFromDate());
			ps.setDate(13, e.getToDate());
			ps.setString(14, e.getSkillSet());
			ps.setString(15, e.getUsername());
			ps.setString(16, e.getPassword());
			ps.setString(17, e.getEmployeeId());
			
			status=ps.executeUpdate();
			
			con.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return status;
	}
	public static int delete(String id)
	{
		int status=0;
		try
		{
			Connection con=EmployeeDao.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from Employees where EmployeeId=?");
			ps.setString(1,id);
			status=ps.executeUpdate();
			
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
	}
	
	
	public static Employee getEmployeeById(String id)
	{
		Employee e=new Employee();
		
		try
		{
			Connection con=EmployeeDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from Employees where EmployeeId=?");
			ps.setString(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				
				e.setEmployeeId(rs.getString(1));
				e.setFirstName(rs.getString(2));
				e.setLastName(rs.getString(3));
				e.setDOB(rs.getDate(4));
				e.setGender(rs.getString(5));
				e.setQualification(rs.getString(6));
				e.setPhone(rs.getString(7));
				e.setAddress(rs.getString(8));
				e.setDesignation(rs.getString(9));
				e.setDateOfJoining(rs.getDate(10));
				e.setManager(rs.getString(11));
				e.setWorkingOnProject(rs.getString(12));
				e.setProjectFromDate(rs.getDate(13));
				e.setToDate(rs.getDate(14));
				e.setSkillSet(rs.getString(15));
				e.setUsername(rs.getString(16));
				e.setPassword(rs.getString(17));
				
			}
			con.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return e;
	}
}
