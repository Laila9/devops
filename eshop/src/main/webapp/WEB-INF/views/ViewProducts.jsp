<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jscore"
   %>
   <%@ include file="GuestHeader.jsp" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
$(document).ready(function () {
     $('#dt13table').DataTable();
     $('.dataTables_length').addClass('bs-select');
   });
</script>
</head>
<body>

<table id="dt13table" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
<thead>
      <tr>
        <th>Product ID</th>
        <th>Product Name</th>
        <th>Product Price</th>
        <th>Details</th>
        
      </tr>
    </thead>
    
<jscore:forEach items= "${pro}" var="p">
<tr>
<td>${p.productId}</td>
<td>${p.productName}</td>
<td>${p.productPrice}</td>
<td><a href="ViewProducts?proId=${p.productId}">ViewDetails</a></td>
</tr>

</jscore:forEach>
<tfoot>
  <tr>
  <th>ProductId</th>
    <th>ProductName</th>
    <th>ProductPrice</th>
    <th>Details</th>
    

  </tr>
</tfoot>
</body>
</html>