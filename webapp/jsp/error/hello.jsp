<%--
  Created by IntelliJ IDEA.
  User: Change
  Date: 2019/11/12
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
</head>
<body style="background-color: #b3ecb4">
<div style="text-align: center; margin-top: 200px"><span style="font-size: 100px">√</span><br><span
        style="font-size: 40px">注册成功</span><br><br><br><span>正在跳转..... <span id="mi">5</span></span></div>
<script type="text/javascript">
    $(function () {
        var tim = 5;
        setInterval(function () {
            $("#mi").html(tim);
            tim--;
            if (tim === -1) {
                window.location.href = "${pageContext.request.contextPath}/index.jsp"
            }
        }, 1000);
    })
</script>
</body>
</html>
