<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="js" %>
<%@ include  file="GuestHeader.jsp" %>
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

<th class="th-sm">Cart ID</th>
<th class="th-sm">ProductName</th>
<th class="th-sm">ProductPrice</th>
<th class="th-sm">TotalPrice</th>
<th class="th-sm">Quantity</th>

</tr>
</thead>
<tbody>
<js:forEach items="${pro}"  var="cart">

  <tr>
    <td>${cart.cartId}</td>
    <td>${cart.productName}</td>
     <td>${cart.productPrice}</td>
    <td>${cart.totalPrice}</td>
    <td>${cart.quantity}</td>

  </tr>

</js:forEach>

</tbody>
<tfoot>
  <tr>

<th class="th-sm">Cart ID</th>
<th class="th-sm">ProductName</th>
<th class="th-sm">ProductPrice</th>
<th class="th-sm">TotalPrice</th>
<th class="th-sm">Quantity</th>

</tr>
</tfoot>
</table>

</body>
</html>