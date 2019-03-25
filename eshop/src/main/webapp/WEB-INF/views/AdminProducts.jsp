<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jscore"
   %>
   <%@ include file="AdminHeader.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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

<div class="container-fluid">


             
  <table class="table table-hover">
    <thead>
      <tr>
        <th>Product ID</th>
        <th>Product Name</th>
        <th>Product Price</th>
        <th>Image</th>
        <th>Delete</th>
       
        
      </tr>
    </thead>
    
<jscore:forEach items= "${productList}" var="p">
<tr>
<td>${p.productId}</td>
<td>${p.productName}</td>
<td>${p.productPrice}</td>
<td><img src="Resources/proimg/${p.productId}.png"  width="50" height="50" />
<td><a href="#">Delete</a></td>
</tr>

</jscore:forEach>
<tfoot>
   <tr>
   <th>ProdutId
     </th>
     <th>ProductName
     </th>
     <th>ProductPrice
     </th>
     <th>Image
     </th>
     <th>Delete
     </th>

   </tr>
 </tfoot>
</body>
</html>



































