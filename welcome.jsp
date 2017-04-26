<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<style>
#logout-link {
	width: 300px;
	padding: 20px;
	margin: 100px auto;
	background: #fff;
	-webkit-border-radius: 2px;
	position: fixed;
	right: 10px;
	top:0px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Mvc Application</title>
</head>
<body>
	<H1>Spring mvc Application</H1>
	<%
		out.println("Welcome ["
				+ org.springframework.security.core.context.SecurityContextHolder
						.getContext().getAuthentication().getName() + "]");
		out.println("<br/>");
		out.println("Login time is [" + new java.util.Date() + "]");
		out.println("<br/><br/>");
	%>

	<c:if test="${userNameAttribute ne null}">
		<h2>Hello ${userNameAttribute} again.</h2>
	</c:if>
	<div style="float:left">
		<form align="left" method="link" action="/logout">
		<label class="logout-link" >
			<input type="submit" value="Logout" onclick="location.replace('login.jsp')" />
			</label>
		</form>
	</div>
</body>
</html>