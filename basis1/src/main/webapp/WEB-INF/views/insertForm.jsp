<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script> 
<script type="text/javascript">
</script>
<title>글쓰기</title>
</head>

<form method = "post" action="insertForm.do"> 
<body>

<p><label>serialNumber</label><input type="text"  placeholder="Serial 입력. " name="serialNumber"></p>
<p><label>licenseType</label><input type="text" placeholder="Type입력. " name="licenseType" size="15"></p>
<p><label>licenseName</label><input type="text" placeholder="이름 입력. " name="licenseName" size="15"></p>

<button type = "submit">등록</button>

</form>
</body>

</html>