<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">ProjectAllocation</h1>
<div align="center">
<form action="projectAllocated" method="post">
<table>
<tr>
<td> Select Project :</td>
<td>
<select name="project" >
<option value="0">Select Project</option>
<c:forEach items="${projectList}" var="uObj">
<option value="${uObj.project_Id}">${uObj.project_Name}</option>
</c:forEach>
</select>
</td>
</tr>

<tr>
<td> Select Developer :</td>
<td>
<select name="developer" multiple="multiple" >
<option value="0">Select Developer</option>
<c:forEach items="${developerList}" var="uObj">
<option value="${uObj.id}">${uObj.name}</option>
</c:forEach>
</select>
</td>
</tr>

<tr>
<td> Select Tester :</td>
<td>
<select name="tester" multiple="multiple" >
<option value="0">Select Tester</option>
<c:forEach items="${testerList}" var="uObj">
<option value="${uObj.id}">${uObj.name}</option>
</c:forEach>
</select>
</td>
</tr>

<tr>
<td></td>
<td>
<input type="submit" value="Allocate">





</table></form>
</div>
</body>
</html>
