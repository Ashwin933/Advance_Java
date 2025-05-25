
 <%@ page import="java.util.*, com.jsp.model.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" language="java"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User List</title>
</head>
<body>
	<h2>User List</h2>
	<a href="jsp/add.jsp">Add New User</a><br/><br/>
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Actions</th>
		</tr>
		
		<%
			List<User> users = (List<User>) request.getAttribute("users");
			for(User u:users){
		%>
		
		<tr>
			<td><%= u.getId() %>></td>
			<td><%= u.getName() %></td>
			<td><%= u.getEmail() %>></td>
			<td>
				<a href="jsp/edit.jsp?id=<%= u.getId() %>">Edit</a>
				<a href="/DeleteUserServlet?id=<%= u.getId() %>">Delete</a>
			</td>
		</tr>
		<% } %>
	</table>
</body>
</html>