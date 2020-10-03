<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>

<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
 <script>
    

 function del(element){
	 
	 var table = document.getElementById("table");
	 var serial = table.rows[element].cells[1].innerHTML;
	 var type = table.rows[element].cells[2].innerHTML;
	 var name = table.rows[element].cells[3].innerHTML;
	 var param = {
		    	"serialNumber" : serial,
				"licenseType" : type,
				"licenseName" : name
				
		    }

		    $.ajax({
		      type : "post",
		      data : param,
		      url : "${path}/delete.do",
		      success : function(){
		    	  
		    	  refresh();
		    	  
		      }
		    });
		  
	 
	 
	 
 }
 
 function refresh(){
		location.reload();
	}
 
 function update(serialNumber, licenseType, licenseName) { 
	
	 
	 location.href="update.do?serialNumber="+serialNumber+"&licenseType="+licenseType+"&licenseName="+licenseName;
	 
	 //location.href='update.do?a=serialNumber&b=licenseType&c=licenseName';
	 //alert(serialNumber); 
	 
	  var param = {
		    	"serialNumber" : serialNumber,
				"licenseType" : licenseType,
				"licenseName" : licenseName
				
		    }
	  
	 $.ajax({
	      type : "get",
	      data : param,
	      url : "/update.do",
	      success : function(){
	    	  
	      }
	    });
		
 }


    
    
    </script>
<title>목록</title>
</head>
<form action="insertForm.do" method="get">
	<body>
		<table id="table" border="1" width="880">
			<tr>
				<td>index </td>
				<td >
					<p align="center">serialNumber</p>
				</td>
				<td >
					<p align="center">licenseType</p>
				</td>
				<td >
					<p align="center">licenseName</p>
				</td>
				<td >
					<p align="center">수정</p>
				</td>
				<td >
					<p align="center">삭제</p>
				</td>
			</tr>

			<tbody>
				<c:forEach items="${licenseInfoList}" var="license" varStatus="status">
					<tr id ="${status.count}">
						<td>${status.count}</td>
						<td>${license.serialNumber}</td> 
						<td>${license.licenseType}</td>
						<td>${license.licenseName}</td>
						
						<td><button type=submit formaction="update.do" formMethod ="get">수정</button> </td>
						<td><input type='button' onClick="del(${license.serialNumber},${license.licenseType},${license.licenseName});" value="삭제"/></td>
					</tr>
				</c:forEach>
			</tbody>

		</table>
		<button type="submit">등록</button>
	</body>
</form>

</html>