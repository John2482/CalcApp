<%@page import="java.util.*,com.john.times.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="main.css">

<title>Calculator!</title>
</head>

<body>
	<div class="calc">
		<h2>Number Multiplier!</h2>
		<form method="post" action="Servlet">
			<p>Enter First Number:
			<input type="text" name="1number">
			</p>
			<p>Enter Second number:
			<input type="text" name="2number"> <br> 
			</p>
			<input type="radio" name="sel" value="add"> Add<br> 
			<input type="radio" name="sel" value="sub"> Sub<br>
			<input type="radio" name="sel" value="mult"> Mul<br>
			<input type="radio" name="sel" value="div"> Div<br>
		    
		    <input type="submit" value="Submit"> 
		    <input type="reset" value="Reset">
		</form>

		<p>Answer Is: ${answer}</p>
	</div>
	<p class="divErr">${error}</p>
</body>
</html>