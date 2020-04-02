<%--
  Created by IntelliJ IDEA.
  User: Change
  Date: 2019/10/12
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common.jsp" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>choc在线编辑</title>
    <style type="text/css">
        body {
            /*background: transparent;*/
            Font-size: 25%;
            /*font-size: 60.5%;*/
        }

        div {
            height: 15%;
            display: inline-block;

        }

        * {
            margin: 0;
            padding: 0;

        }

        body, p, div, span, input, img, a, li {
            list-style: none;
            text-align: center;
            font-family: sans-serif;
            font-size: 1em;
        }

        #top-left {
            text-align: center;
            float: left;
            width: 15%;
            height: 100%;
            display: inline-block;
        }

        #appBar {
            height: 100%;
            width: 80%;
        }

        .abed {
            background-color: #a5bad7;
            font-weight: bold;
            color: #0f3b55;
            width: 10%;
            height: 70%;
            margin: 1% 2%;
            /*line-height: 50px;*/
            border-radius: 10px;
            line-height: 400%;
            text-align: center;
        }

        img {
            /*margin-top: 2%;*/
            /*margin-left: 5%;*/
            width: 75%;
            height: 95%;
            border-radius: 10px;
        }

        .submenu {
            display: none;
            position: absolute;
            z-index: 999;
        }

        .abed-right {
            float: right;
            width: 5%;
            height: 100%;
            font-size: 0.6em;
        }

        .right-top {
            width: 100%;
            height: 50%;
        }

        .exit {
            margin-left: 60%;
            height: 40%;
            width: 25%;
            target: parent;
        }

        .right-button {
            width: 100%;
            height: 50%;
        }
    </style>
</head>
<body>
<div id="top-left">
    <img src="${pageContext.request.contextPath}/images/logo.png" alt="图片无法显示">
</div>
<div id="appBar">
    <div id="appBa1" class="abed abase1">
        <span>首页</span>
        <div class="defs-1 submenu">

        </div>
    </div>

    <div id="appBa2" class="abed abase2">
        <span>编辑</span>
        <div class="defs-2 submenu">

        </div>
    </div>

    <div id="appBa3" class="abed abase3">
        <span>查看</span>
        <div class="defs-3 submenu">

        </div>
    </div>

    <div id="appBa4" class="abed abase4">
        <span>打印</span>
        <div class="defs-4 submenu">

        </div>
    </div>

    <div id="appBa5" class="abed abase5">
        <span>导入导出</span>
        <div class="defs-5 submenu">

        </div>
    </div>

    <div id="appBa6" class="abed abase6">
        <span>关于</span>
        <div class="defs-6 submenu">

        </div>
    </div>

</div>
<div class="abed-right">
    <div class="right-top"><img class="exit" src="${pageContext.request.contextPath}/images/cross.png" alt=""></div>
    <div class="right-button">
        <span class="abed-right-date"></span><br>
        <span class="abed-right-user">${sessionScope.user.name},你好！</span>
    </div>
</div>
<script type="text/javascript">
    $(function () {
        $(".abed:eq(0)").css("background-color", "transparent");
        $(".abed").each(function () {
            $(this).click(function () {
                $(this).css("background-color", "transparent");
                $(this).siblings().css("background-color", "#a5bad7")
            })
        });
        $("#appBa1").click(function () {
            $("#iframeContent", parent.document).attr("src", "home.jsp");
        });
        $("#appBa2").click(function () {
            $("#iframeContent", parent.document).attr("src", "update.jsp");
        });
        $("#appBa3").click(function () {
            $("#iframeContent", parent.document).attr("src", "select.jsp");
        });
        $("#appBa4").click(function () {
            $("#iframeContent", parent.document).attr("src", "dayin.jsp");
        });
        $("#appBa5").click(function () {
            $("#iframeContent", parent.document).attr("src", "rcpoi.jsp");
        });
        $("#appBa6").click(function () {
            $("#iframeContent", parent.document).attr("src", "guanyu.jsp");
        });
        $(".exit").click(function () {
            if (confirm("您确定要退出程序？")) {
                $.ajax({
                    url: "${pageContext.request.contextPath}/tbUser/login.del",
                    type: "GET",
                    async: false,
                    dataType: 'json',
                    xhrFields: {
                        withCredentials: true
                    },
                    crossDomain: true,
                    success: function () {
                        window.parent.location.href = "${pageContext.request.contextPath}/index.jsp";
                    }
                });
            }
        });
        setInterval(function () {
            var date = new Date();
            this.day = ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"][date.getDay()];
            this.hour = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
            this.minute = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
            this.second = date.getSeconds() < 10 ? "0" + date.getSeconds() : date.getSeconds();
            var currentTime = this.day + "\n" + this.hour + ":" + this.minute + ":" + this.second;
            $(".abed-right-date").html(currentTime);
        }, 100);
    });

</script>
</body>
</html>
