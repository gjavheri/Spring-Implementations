<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer KYC Upload</title>
</head>
<body>

<form action="/customer" method="post">
 Customer Name : <input type="text" name="uname" /><br/>
 Customer Last Name: <input type="text" name="lname" /><br/>
 Customer Designation: <input type="text" name="desg" /><br/>
   <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
 <input type="submit" />
</form>


</body>
</html>