<%--
  Created by IntelliJ IDEA.
  User: 超
  Date: 2017/10/20
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>users.jsp</title>
</head>
<body>
<table cellpadding="5px" cellspacing="0" border="2px">
   <c:forEach items="${users}" var="user">
       <tr>
           <td>${user.id}</td>
           <td>${user.name}</td>
           <td>${user.password}</td>
           <td>${user.gender}</td>
           <td>${user.age}</td>
       </tr>
   </c:forEach>
</table>
</body>
</html>
