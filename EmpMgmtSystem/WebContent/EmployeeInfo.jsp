<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
	response.setDateHeader("Expires", 0);
		if(session==null || session.getAttribute("username")==null)
		{
			response.sendRedirect("homepage.jsp");
		}
		
%>

 <a href="registration.jsp">Add Employee</a>
 <form action="ViewEmployees">
 <input type="submit" value="ViewEmployees">
 </form>
 <form action="Logout">
 <input type="submit" value="logout">
 </form>
 
 </form>
</body>
</html>