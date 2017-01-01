<%--
  Created by IntelliJ IDEA.
  User: zhuo
  Date: 2016/11/7
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style="width: 80%;margin: 0 auto">
<div class="container">
    <ul class="nav nav-pills" role="tablist" >
        <li role="presentation" class="active"><a href="#">主页</a></li>
        <li role="presentation" ><a href="/textSubmit">我也来一句</a></li>
        <li role="presentation"><a href="#">关于网站</a></li>
    </ul>
    <br/>

    <c:forEach items="${boards}" var="board">
        <div class="panel panel-success">
            <div class="panel-heading">${board.name} : ${board.submitTime}</div>
            <div class="panel-body">
                ${board.message}
            </div>
        </div>
    </c:forEach>

    <br/>

    <a href="/hello?page=${page-1}" class="btn btn-primary btn-lg" role="button">上一页</a>
    <a href="/hello?page=${page+1}" class="btn btn-primary btn-lg" role="button">下一页</a>

    <br/>
    <br/>
    <br/>
    <%--<div class="panel panel-success">--%>
        <%--<div class="panel-heading">Panel heading without title</div>--%>
        <%--<div class="panel-body">--%>
            <%--Panel content--%>
        <%--</div>--%>
    <%--</div>--%>

</div> <!-- /container -->

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>
