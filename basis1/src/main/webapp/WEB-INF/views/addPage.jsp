<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="resources/crud_script.js"></script>
</head>
<body>
<div id="wrapper">
<table align='center' cellspacing=2 cellpadding=5 id="data_table" border=1>

<tr>
<th>Name</th>
<th>Country</th>
<th>Age</th>
</tr>


<tr id="row2">
<td id="name_row2">Shawn</td>
<td id="country_row2">Canada</td>
<td id="age_row2">26</td>

<td>
<input type="button" id="edit_button2" value="Edit" class="edit" onclick="edit_row('2')">
<input type="button" id="save_button2" value="Save" class="save" onclick="save_row('2')">
<input type="button" value="Delete" class="delete" onclick="delete_row('2')">
</td>

</tr>


<tr>
<td><input type="text" id="new_name"></td>
<td><input type="text" id="new_country"></td>
<td><input type="text" id="new_age"></td>
<td><input type="button" class="add" onclick="add_row();" value="Add Row"></td>
</tr>

</table>
</div>

</body>
</html>
