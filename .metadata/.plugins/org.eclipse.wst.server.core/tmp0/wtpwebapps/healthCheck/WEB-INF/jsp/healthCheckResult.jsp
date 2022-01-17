<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ健康診断</title>
</head>
<body>
<h1>スッキリ健康診断結果</h1>
<p>
身長：${health.height} <br>
体重：${health.weight}<br>
BMI:  ${health.bmi}<br>
体系：${health.bodyType}
</p>

<a href="/healthCheck/HealthCheck">戻る</a>

</body>
</html>