<%--
  Created by IntelliJ IDEA.
  User: Change
  Date: 2019/11/7
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>choc在线编辑</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
    <style type="text/css">
        * {
            margin: 0;
            padding: 0;
            list-style: none;
            text-align: center;
        }

        .app-up {
            width: 100%;
            height: 100%;
        }

        .up {
            margin: 15% 2%;
            width: 20%;
            height: 20%;
            display: inline-block;
            border-radius: 10%;
            padding-top: 5%;
            transition: all 0.5s;
            border: #d2dae9 1px solid;
        }

        .up:hover {
            box-shadow: 5px 5px 20px 2px #909090;
        }

        span {
            font-family: Cursive;
            font-size: 200%;
        }
    </style>
</head>
<body>
<div class="app-up">
    <div class="up left"><span class="wj">文件编辑</span></div>
    <div class="up right"><span class="gr">个人编辑</span></div>
</div>
<script type="text/javascript">
    $(function () {
        $(".up").hover(function () {
            $(this).animate({})
        })
    })

</script>
</body>
</html>
