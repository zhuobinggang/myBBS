<%--
  Created by IntelliJ IDEA.
  User: zhuo
  Date: 2016/11/7
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-cn">
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
    <ul class="nav nav-pills" role="tablist">
        <li role="presentation" ><a href="/hello?page=0">主页</a></li>
        <li role="presentation" class="active"><a href="#">我也来一句</a></li>
        <li role="presentation"><a href="#">关于网站</a></li>
    </ul>
    <div class="page-header" >
        <h1>欢迎 <small>请写下您此时想说的话</small></h1>
    </div>
    <form role="form"  action="/textSubmit" method="post">
        <div class="form-group" >
            <textarea class="form-control input-lg" rows="6" name="text"></textarea>
            <input type="text" style="width: 35%" name="name" class="form-control" placeholder="输入您的名字">
            <button type="submit" class="btn btn-primary btn-lg">
                发送
            </button>
        </div>

    </form>

</div> <!-- /container -->

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>