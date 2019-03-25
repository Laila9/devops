<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sf:form action="addCategory" method="post" modelAttribute="ct">
CategoryId <sf:input path="CategoryId"/>
CategoryName <sf:input path="CategoryName"/>
CategoryDescription <sf:input path="CategoryDescription"/>
<input type="submit" value="SaveCategory"/>
</sf:form>
</body>
</html>