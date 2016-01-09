<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@page contentType="text/html;charset=UTF-8" %>
<%@page pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Mr & Mrs Jewelsmith</title>
    <link rel="stylesheet" href="/css/default.css" type="text/css" media="screen"/>

</head>

<body>
<%@include file="header.jsp"%>

<ul class="nav">
    <li><a class="selected" title="Go Home" href="/home">Home</a></li>
    <c:forEach var="listValue" items="${lists}">
        <li><a class="nav-link" title="${listValue.description}" href="/category/${listValue.categoryName}">${listValue.categoryName}</a></li>
    </c:forEach>
    <li><a class="nav-link" title="Contact Us" href="/category/Contact">Contact us</a></li>
</ul>
</body>
</html>