<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin page</title>
</head>
<body>
	Dear
	<strong>${user}</strong>, Welcome to Admin Page.

	<table class="border" cellpadding="10">
		<tr bgcolor="#99CCFF">
			<th class="th">Username</th>
			<th class="th">First Name</th>
			<th class="th">Last Name</th>
		</tr>
		<c:forEach items="${userList}" var="userDetail">
			<tr>
				<td class="td"><c:out value="${userDetail}" /></td>
				<td class="td"><c:out value="${userDetail}" /></td>
				<td class="td"><c:out value="${userDetail}" /></td>
			</tr>
		</c:forEach>
	</table>

	<a href="<c:url value="/logout" />">Logout</a>
</body>
</html>