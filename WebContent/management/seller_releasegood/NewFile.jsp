<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>

<script type="text/javascript">
	$(function() {
		$("#addFile").click(addFile);
 
	});
	var addFile = function() {
 
		var $file = $("<input type='file' name='UplodeName'/>");
		$("#fileUplodeDiv").append($file).append($("<br>"));
	};
</script>
</head>
<body>
<form action="${pageContext.request.contextPath }/uplodes.action"
		enctype="multipart/form-data" method="post">
		上传者:<input type="text" name="name"> <br> 
		上文件:<input type="file" name="UplodeName" value="你好">
		<div id="fileUplodeDiv"></div>
		<br> <br> <input type="submit" value="提交文件"> <input type="button"
			value="添加文件" id="addFile" > 
 
	</form>

</body>

</html>