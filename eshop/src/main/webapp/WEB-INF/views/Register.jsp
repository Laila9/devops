<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<sf:form action="AddUser" method="post" modelAttribute="User">
Email<sf:input path="email"/>
UserName<sf:input path="UserName"/>
Password<sf:input path="password"/>
Mobile<sf:input path="mobile"/>
Role<sf:input path="role"/>
Enabled<sf:input path="Enabled"/>
<input type="submit" value="AddUser">
</sf:form>
</body>
</html>