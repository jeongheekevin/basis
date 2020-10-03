<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>

<!DOCTYPE>
<html>
<head>
<title>수정</title>
</head>
<body>
수 정     페 이 지
<form action="update.do" method = "post">
    <body>
    
    <p><label>serialNumber</label> <input type="text" name ="serialNumber" value ="${license.serialNumber}" ></p>
    <p><label>licenseType</label ><input type="text" name ="licenseType" value ="${license.licenseType}" ></p>
    <p><label>licenseName</label> <input type="text" name="licenseName" size="15" value = "${license.licenseName}"></p>
   
    <button type ="submit">완료</button>
 	</body>

 </form>

</html>