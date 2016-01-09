<%--
  Created by IntelliJ IDEA.
  User: Theresa
  Date: 12/09/2015
  Time: 09:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>admin</title>
</head>
<body>
<div>
    <hr/>
    CATEGORY<br/>
    <form name="category" action="/category">
        <c:if test="${not empty lists}">

            <ul>
                <c:forEach var="listValue" items="${lists}">
                    <li>${listValue.categoryName}</li>
                </c:forEach>
            </ul>

        </c:if>
    </form>
</div>
</body>
</html>
