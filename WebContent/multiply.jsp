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
	<p class="title">Calculator App</p>
	<div class="calc">

		<form method="post" action="Servlet">
			<div class="table">
			<table>
				<tr>
				<td>${display}</td>
				</tr>
				<tr>
					<td><input type="submit" name="sel" value="1" class="button"></td>
					<td><input type="submit" name="sel" value="2" class="button"></td>
					<td><input type="submit" name="sel" value="3" class="button"></td>
					<td><input type="submit" name="sel" value="+" class="button"></td>
					<td><input type="submit" name="sel" value="-" class="button"></td>
				</tr>
				
				<tr>
					<td><input type="submit" name="sel" value="4" class="button"></td>
					<td><input type="submit" name="sel" value="5" class="button"></td>
					<td><input type="submit" name="sel" value="6" class="button"></td>
					<td><input type="submit" name="sel" value="*" class="button"></td>
					<td><input type="submit" name="sel" value="/" class="button"></td>
				</tr>
				<tr>
					<td><input type="submit" name="sel" value="7" class="button"></td>
					<td><input type="submit" name="sel" value="8" class="button"></td>
					<td><input type="submit" name="sel" value="9" class="button"></td>
					<td><input type="submit" name="sel" value="Clr" class="button"></td>
				</tr>
			</table>
			</div>
		</form>

		<p>Answer Is: ${answer}</p>
	</div>
	<p class="divErr">${error}</p>
</body>
</html>