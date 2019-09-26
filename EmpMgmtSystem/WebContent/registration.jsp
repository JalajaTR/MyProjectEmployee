    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    	pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>User Data</title>
    </head>
    <style>
    
    	
		#header{
			height:30%;
			width:100%;
			border: 1px light grey;
			padding: 35px;
			
			align-content:flex-end;
			background-repeat: no-repeat;
			background-image: url("Images/emp5.jpg");
			background-size: cover;
    div.ex {
    	text-align: right width:300px;
    	padding: 10px;
    	border: 5px solid grey;
    	margin: 0px
    }
    </style>
  
  <%
 	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
	response.setDateHeader("Expires", 0);
		if(session==null || session.getAttribute("username")==null)
		{
			response.sendRedirect("homepage.jsp");
		}
	%>
   </head>
    <body>
    	<h1>Registration Form</h1>
    	<div class="ex">
    		<form action="SaveEmployee" method="post">
    			<table style="with: 50%">
    				<tr>
    					<td>EmployeeId</td>
    					<td><input type="text" name="EmployeeId" /></td>
    				</tr>
    				<tr>
    					<td>FirstName</td>
    					<td><input type="text" name="FirstName" /></td>
    				</tr>
    				<tr>
    					<td>LastName</td>
    					<td><input type="text" name="LastName" /></td>
    				</tr>
    				<tr>
    					<td>DOB</td>
    					<td><input type="Date" name="DOB" /></td>
    				</tr>
    				<tr>
    					<td>Gender</td>
    					<td><input type="text" name="Gender" /></td>
    				</tr>
    				<tr>
    					<td>Qualification</td>
    					<td><input type="text" name="Qualification" /></td>
    				</tr>
    				<tr>
    					<td>Phone</td>
    					<td><input type="number" name="Phone" /></td>
    				</tr>
    				<tr>
    					<td>Address</td>
    					<td><input type="text" name="Address" /></td>
    				</tr>
    				<tr>
    					<td>Designation</td>
    					<td><input type="text" name="Designation" /></td>
    				</tr>
    				<tr>
    					<td>DateOfJoining</td>
    					<td><input type="Date" name="DateOfJoining" /></td>
    				</tr>
    				<tr>
    					<td>Manager</td>
    					<td><input type="text" name="Manager" /></td>
    				</tr>
    				<tr>
    					<td>WorkingOnProject</td>
    					<td><input type="text" name="WorkingOnProject" /></td>
    				</tr>
    				<tr>
    					<td>Project Start Date</td>
    					<td><input type="Date" name="ProjectFromDate"  /></td>
    				</tr>
    				<tr>
    					<td>Project To Date</td>
    					<td><input type="Date" name="ToDate" /></td>
    				</tr>
    				<tr>
    					<td>SkillSet</td>
    					<td><input type="text" name="SkillSet" /></td>
    				</tr>
    				<tr>
    					<td>username</td>
    					<td><input type="text" name="username" /></td>
    				</tr>
    				<tr>
    					<td>Password</td>
    					<td><input type="password" name="password" /></td>
    				</tr>
    				
    			<input type="submit" value="Save" />
    		</form>
    	</div>
    </body>
    </html>