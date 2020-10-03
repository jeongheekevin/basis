<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>T32 insert</title>

<!-- Custom fonts for this template -->
<link href="resources/bootstrap/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="resources/bootstrap/css/sb-admin-2.min.css" rel="stylesheet">

<!-- Custom styles for this page -->
<link
	href="resources/bootstrap/vendor/datatables/dataTables.bootstrap4.min.css"
	rel="stylesheet">

</head>

<body id="page-top">

<!-- Bootstrap core JavaScript-->
	<script src="resources/bootstrap/vendor/jquery/jquery.min.js"></script>
	<script src="resources/bootstrap/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script
		src="resources/bootstrap/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="resources/bootstrap/js/sb-admin-2.min.js"></script>

	<!-- Page level plugins -->
	<script
		src="resources/bootstrap/vendor/datatables/jquery.dataTables.min.js"></script>
	<script
		src="resources/bootstrap/vendor/datatables/dataTables.bootstrap4.min.js"></script>

	<!-- Page level custom scripts -->
	<script src="resources/bootstrap/js/demo/datatables-demo.js"></script>
	<script src="http://code.jquery.com/jquery-latest.js"></script>
	
	
<div>
		<form action="insertBoard.do" method="post" enctype="multipart/form-data">
<table border="1" cellpadding="0" cellspacing="0">
<tr>
	<td bgcolor="orange" width="70">제목</td><td align="left">
	<input type="text" name="title" value="${board.title }"/></td>
</tr>
<tr>
	<td bgcolor="orange">작성자</td><td align="left">
	<input type="text" name="writer" size="10" value="${board.writer }"/></td>
</tr>
<tr>
	<td bgcolor="orange">내용</td><td align="left">
	<textarea name="content" cols="40" rows="10">${board.content }</textarea></td>
</tr>
<tr>
	<td bgcolor="orange">업로드</td><td align="left">
	<input type="file" name="uploardFile"/></td>
</tr>
<tr>
	<td colspan="2" align="center">
	<input type="submit" value=" 새글 등록 "/></td>
</tr>
</table>
</form>

	</div>

<% 
	String sn = request.getParameter("serial");
	String tp = request.getParameter("type");
	String nm = request.getParameter("name");
	
	System.out.println("serial");
	System.out.println("type");
	System.out.println("name");
	
	    
%>


			<footer class="sticky-footer bg-white">
				<div class="container my-auto">
					<div class="copyright text-center my-auto">
						<span>Copyright &copy; Your Website 2020</span>
					</div>
				</div>
			</footer>
		</div>
	</div>
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>
	
	
	
</body>

</html>
