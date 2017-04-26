<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="Sat, 26 Jul 2013 05:00:00 GMT" />
<title>Mvc With Spring Security</title>
<style>
.error {
	padding: 10px;
	margin-bottom: 15px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #a94442;
	background-color: #f2dede;
	border-color: #ebccd1;
}
#login-box {
	width: 300px;
	padding: 20px;
	margin: 100px auto;
	background: #fff;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border: 1px solid #000;
}
</style>
<script type="text/javascript">
function init() {
    // Clear forms here
    document.getElementById("loginform").reset();
    document.getElementById("username").focus();
}
window.onload = init;
</script>
</head>
<body>
<div id="login-box">
<h1>Application Login</h1>
	
		<c:if test="${param.error!=null}">
			<h2><div class="error">Invalid username or password!</div></h2>
		</c:if>

	   <form id="loginform" name="loginForm" action="/perform-login" method="POST">
      <table>
	         <tr>
	            <td>User:</td>
	            <td><input type="text" id="username" name="username" value="" autocomplete="off"/></td>
	         </tr>
	         <tr>
	            <td>Password:</td>
	            <td><input type="password" name="password" value="" autocomplete="off"/></td>
	         </tr>
	         <tr>
	         	<td><input name="submit" type="submit" value="Login"/></td>
	         </tr>
	      </table>
	      <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	  </form>
	  </div>
	</body>
</html>