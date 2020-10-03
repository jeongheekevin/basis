<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>

<!DOCTYPE html> 
<html>
<head>
<title>read</title>
</head>
<form>
<body>

<p><label>Serial</label> <input type="text" name ="serialNumber" value ="${license.serialNumber}" readonly="readonly"></p>
<p><label>Type</label> <input type="text" name ="licenseType" style="background-color:#B0E0E6;" value ="${license.licenseType}" readonly="readonly"></p>
<p><label>Name</label> <input type="text" name="licenseName" size="15" value = "${license.licenseName}"readonly="readonly"><p>


	<td>${license.serialNumber}</td>
	<td>${license.licenseType}</td>
	<td>${license.licenseName}</td>

<button type="submit" formaction="update" formmethod="get">수정</button>
<button type="submit" formaction="delete" formmethod="post">삭제</button>
<button type="submit" formaction="select" formmethod="get">목록</button>
</body>
</form>
</html>