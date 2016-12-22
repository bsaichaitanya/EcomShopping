<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ShoppingCart</title>
</head>
<body>
<a href="Login">Login</a>
<a href="register">Register </a>
//--we need to jstl jsp library
//if condition

 
<c:if test="${showLoginPage}">  
<jsp:include page="login.jsp"></jsp:include>
</c:if>




<c:if test="${showRegistrationPage}">
<jsp:include page="registration.jsp"></jsp:include>
</c:if>
</body>
</html>