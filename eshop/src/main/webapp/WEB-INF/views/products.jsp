<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
 <%@ include file="AdminHeader.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sf:form action="addProduct" method="post" modelAttribute="pr" enctype="multipart/form-data" >
ProductName <sf:input path="ProductName"/><br>
ProductPrice <sf:input path="ProductPrice"/><br>
ProductImage<input type="file" name="image"/><br>
<input type="submit" value="SaveProduct"/>
</sf:form>

</body>
</html>