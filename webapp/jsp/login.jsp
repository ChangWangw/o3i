<%--
  Created by IntelliJ IDEA.
  User: Change
  Date: 2019/10/24
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/common.jsp" %>
<html>
<head>
    <title>choc在线编辑</title>
    <style type="text/css">
        body {
            text-align: center;
            margin: 0;
            padding: 0;
            background-image: linear-gradient(to top, #00ffbd, #00b7d2);
        }

        * {
            margin: 0;
            padding: 0;
            font-family: Serif, serif;
        }

        .age {
            width: 5%;
            border: #1b2735;
            background-color: transparent;
        }

        .age option {
            border: #813317;
            background-color: transparent;
        }

        .login {
            height: 100%;
            width: 100%;
        }

        .h2 {
            margin-bottom: 10%;
        }

        .login .div1 {
            margin-bottom: 2%;
        }
    </style>
</head>
<body>
<form action="${pageContext.request.contextPath}/tbUser/insert" method="get">
    <div class="login">
        <div class="h2">
            <h2>注册</h2>
        </div>
        <div class="div1">
            <span>用 户 名：</span>
            <input name="name" class="name" type="text">
        </div>
        <div class="div1">
            <span>密&nbsp;&nbsp;码：</span>
            <input name="password" class="password" type="password">
        </div>
        <div class="div1">
            <span>性&nbsp;&nbsp;别： </span>&nbsp;&nbsp;
            男<input name="sex" type="radio" value="男" checked="true">&nbsp;
            女<input name="sex" type="radio" value="女">&nbsp;&nbsp;
        </div>
        <div class="div1">
            <span>年&nbsp;&nbsp;龄：</span>&nbsp;&nbsp;&nbsp;
            <select name="age" id="age" class="age">
            </select>&nbsp;&nbsp;
        </div>
        <div class="div1">
            <span>手 机 号：</span>
            <input name="phone" class="phone" type="text">
        </div>
        <div class="div1">
            <span>邮&nbsp;&nbsp;箱：</span>
            <input name="email" class="email" type="text">
        </div>
        <input type="hidden" name="state" value="0">
        &nbsp;&nbsp;&nbsp;<button is="btn" style="background-color:transparent; border: antiquewhite" type="submit">确定
    </button>&nbsp;&nbsp;<button type="button" style="background-color:transparent; border: antiquewhite"
                                 onclick="history.back()">
        <img src="${pageContext.request.contextPath}/images/001a_55.png" alt="返回上一层"></button>
    </div>
</form>
<script type="text/javascript">
    $(function () {
        for (var i = 16; i <= 70; i++) {
            $(".age").append("<option>" + i + "</option>")
        }
    })
</script>
</body>
</html>
