<!DOCTYPE html>
<%@ page errorPage="error.jsp" %>  

<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
	<style>
		*{
			box-sizing: border-box;
		}
		
		#header
		{
			height:30%;
			width:100%;
			border: 1px light grey;
			/*padding: 10px;*/
			font-size:30px;
			align-content:flex-end;
			background-repeat: no-repeat;
			/*bachground-color: #7FFFD4;*/
			background-image: url("Images/emp5.jpg");
			background-size: cover;
		}
		
		#TibilInfo
		{
			
			width:50%;
			padding-left : 30px;
			float:left;
			align-self: center;
		}
		#Login
		{
			width:50%;
			padding-left : 100px;
			float:left;
		}
			
		
		
	</style>
	
</head>
<body>
	<div id="header">
	
	<img src="./Images/tibillogo.jpg" />
	<p> Employee Management System</p>
	</div>
	<div id="TibilInfo">
	 <p align="justify" style="padding-left: 5px" >  
	We are a data engineering and analytics company with a global clientele. We enable businesses from Banking & Financial Services, Retail and Healthcare industries achieve better productivity, growth and compliance powered by informed decisions in real-time.
	Founded in 2010, TIBIL is headquartered in Bangalore, India. Business intelligence - enabled by data science and predictive analytics - drives everything we do. Our services and solutions are driven by our proprietary data analytics platform that
	ingests structured & unstructured data in real-time from diverse, disparate data sources and systems using
     integrates, curates and transforms the data to make it available for diverse, multiple users in real-time
      delivers focused business analytics leveraging ML/AI algorithms
     offers the ability to build customized, industry-centric analytics solutions.
	</p>
	</div>
	<div id="Login">
	<img src="./Images/login5.png" height="90" width="90"  />
	
	<form action="Login" method="post">
		Enter UserName : <input type="text" name="uname" value=""><br>
		Enter Password : <input type="password" name="pass" value=""><br>
		
		<input type="Submit"  value="Login" >
	</form>
	
	
	</div>
	
</body>
</html>