<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>



</head>
<body>
  
		<table >
			<thead>
				<tr>
					<th>SerialNumber</th>
					<th>LicenseType</th>
					<th>LicenseName</th>
				</tr>
			</thead>

			<tfoot>
				<tr>
					<th>
						<select class="selectpicker" data-live-search="true" id="licenseTypeselectBox">
							<c:forEach items="${licenseInfoList}" var="license">
								<option>${license.licenseType}</option>
							</c:forEach>
						</select>
					</th>
					<th>
						<select class="selectpicker" data-live-search="true" id="serialNumberselectBox">
							<c:forEach items="${licenseInfoList}" var="license">
								<option>${license.serialNumber}</option>
							</c:forEach>

						</select>
					</th>
					<th>
						<select class="selectpicker" data-live-search="true" id="licenseNameselectBox">
							<c:forEach items="${licenseInfoList}" var="license">
								<option>${license.licenseName}</option>
							</c:forEach>
						</select>
					</th>
				</tr>
			</tfoot>


			<tbody>
				<c:forEach items="${licenseInfoList}" var="licenseInfo">
					<tr>
						<td>${licenseInfo.serialNumber}</td>
						<td>${licenseInfo.licenseType}</td>
						<td>${licenseInfo.licenseName}</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>


	<div class="dropdown">
		<button type="button" class="btn btn-primary dropdown-toggle"
			data-toggle="dropdown">LicenceType</button>
		<div class="dropdown-menu">
			<c:forEach items="${licenseInfoList}" var="license">
					<a class="dropdown-item" href="#">${license.serialNumber}</a> 
			</c:forEach>
		</div>
	</div>


</body>


</html>