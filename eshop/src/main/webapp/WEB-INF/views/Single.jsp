<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<tr>
<td>${products.productId}</td>
<td>${products.productName}</td>
<td>${products.productPrice}</td>
<td><a href="Cart?proId=${products.productId}">AddToCart</a></td>
</tr>
</body>
</html>