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
	<form action="<%=basePath %>/releasegoodServlet" method="post" enctype="multipart/form-data">
          	商品名称：<input type="text" name="goodname" placeholder="请输入商品名称"><br/>
          	商品价格：<input type="text" name="goodprice" placeholder="请输入商品价格"><br/>
          	商品数量：<input type="text" name="goodnum" placeholder="请输入商品数量"><br/>
          	商品图片：<input type="file" name="goodimgfile"><br/>
                                 商品描述：<textarea rows="10" cols="16" name="goodinf" placeholder="请输入商品简介"></textarea><br/>
          		   <input type="submit" value="发布"/>
   </form>
</body>
</html>