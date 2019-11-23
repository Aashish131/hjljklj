<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Project Allocation Details</title>
</head>
<body>
<h1></h1>


<form action="${path}/BugSuccessfullyAllocated" method="get">
<table>
<tr>
<td> Tester Name: </td>
<td> <input type="text" value="${userObj.name}" readonly="readonly"></td>
</tr>
<tr>
<td> Project Name: </td>
<td> 
 <input type="text" value="${projectObj.projName}" readonly="readonly">

 </td>
</tr>
<tr>
      <td> Buy Type: </td>
  <td><select name="bug">
    <option value="0">select</option>
   <c:forEach items="${bugListObj}" var="bObj">
       <option value="${bObj.bId}">${bObj.bType}</option>
           </c:forEach>    
     </select> 
    </td>
</tr>
<tr>
      <td> Severity : </td>
  <td><select name="severity">
    <option value="0">select</option>
   <c:forEach items="${severityList}" var="sObj">
       <option value="${sObj.sId}">${sObj.sType}</option>
           </c:forEach>    
     </select> 
    </td>
</tr>
  <tr>
<td> Description: </td>
<td> <textarea cols="40" rows="10" name="description"></textarea></td>
</tr>
<tr>
       <td></td>
              <td>
                     <input type="submit" value="Report">
              </td>
       </tr>
</table>
</form>
</body>
</html>
