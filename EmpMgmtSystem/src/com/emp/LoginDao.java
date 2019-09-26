package com.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao 
{
	String sql = "select username,password from Employees where username=? and password=?";
	String url="jdbc:mysql://localhost:3306/EmpMgmt";
	String username = "root";
	String password = "root";
	
		public boolean checklogin(String uname,String pass)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,username,password);
				PreparedStatement st = con.prepareStatement(sql);
				st.setString(1,uname);
				st.setString(2,pass);
				ResultSet rs = st.executeQuery();
				if(rs.next())
				{
					return true;
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return false;
		}
}
