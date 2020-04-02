<%--
  Created by IntelliJ IDEA.
  User: Change
  Date: 2019/9/29
  Time: 12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/common.jsp" %>
<html>
<head>
    <title>choc在线编辑</title>
    <%--    <link  href="${path}/css/index.css" rel="stylesheet">--%>
    <style type="text/css">
        body {
            text-align: center;
            margin: 0;
            padding: 0;
            /*background-color: #d2dae9;*/
            background-image: linear-gradient(to top, #00ffbd, #00b7d2);
        }

        div {
        <%--background: url("${pageContext.request.contextPath}/images/index.png") no-repeat center;--%> background-size: 100% 100%;
            position: absolute;
            width: 100%;
            height: 100%;
        }

        #iframeTop {
            /*background-color: #A6FFA6;*/
            width: 100%;
            height: 13%;
            /*position: absolute;*/
            /*top: 0px;*/
            position: fixed;
            left: 0;
            top: 0;
            box-shadow: 0 0 10px 0 #909090;
        }

        #iframeLeft {
            width: 15%;
            height: 87%;
            /*background-color: #d2dae9;*/
            position: fixed;
            left: 0;
            top: 13%;
        }

        #iframeContent {
            /*background-color: aqua;*/
            width: 85%;
            height: 87%;
            position: fixed;
            left: 15%;
            top: 13%;
        }

        #home {
            margin-top: 20%;
        }
    </style>
</head>
<body>
<div>
    <iframe id="iframeTop" name="iframeTop" frameborder="0" src="header.jsp"></iframe>
    <iframe id="iframeLeft" name="iframeLeft" frameborder="0" src="left.jsp"></iframe>
    <iframe id="iframeContent" name="iframeContent" frameborder="0" src="home.jsp"></iframe>
</div>
<input class="user" type="hidden" value="${sessionScope.user.dateEnd}">
<script type="text/javascript">
    $(function () {
        if ($(".user").val() !== "" || $(".user").val() !== null) {

        }
        // alert("最近一次登陆时间:"+$(".user").val());
    })
</script>
</body>
</html>
