<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@page isELIgnored="false" %><%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  ${name}
  ${roll}
  ${date}
   ${marks}<br>
    
   <c:forEach var="item" items="${marks}">
   
    <%-- ${item}<br> --%>
    <c:out value="${item}"></c:out>
   </c:forEach>
</body>
</html>