<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@include file="../../util/checklogin.jsp" %>
<%@include file="../../component/navigation.jsp" %>
<body>
<a href="<%=basePath%>sellergenremanageServlet">商品种类管理</a>
<a href="<%=basePath%>sellerstockmanageServlet">商品库存管理</a>
</body>
</html>