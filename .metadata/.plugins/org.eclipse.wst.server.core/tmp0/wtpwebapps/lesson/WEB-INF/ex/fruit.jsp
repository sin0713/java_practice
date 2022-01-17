<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>フルーツ</title>
</head>
<body>
<p><c:out value="${strawberry.name}"/>の値段は<c:out value="${strawberry.price}"/>円です</p>

</body>
</html>