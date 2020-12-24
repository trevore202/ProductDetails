<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="model.Product" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>

<%
Product p = (Product) session.getAttribute("product");
response.getWriter().println("Product Details<br/><br/>" + p.getName() + "<br/>" + p.getDetails());
%>


</body>
</html>