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
        * {
            margin: 0;
            padding: 0;

        }

        body, p, div, span, input, img, a, li {
            list-style: none;
            font-family: "Arial", "Microsoft YaHei", "黑体", "宋体", sans-serif;
            font-size: 1em;
        }

        a {
            text-decoration: none;
            color: #94fcff;
        }

        #appleft .liedn {
            padding: 20px 10px;
            border: #d2dae9 solid 1px;
            color: #56fcff;
            border-radius: 10px;
        }

        .jt {
            width: 10%;
            height: 3%;
            margin-bottom: -2%;
            margin-left: 30%;
        }

        .linchpin {
            padding: 10px;
            display: none;
        }

        #pkul {
            margin-top: 20px;
        }

        .linchpinch li {
            font-size: 0.8em;
            border-left: solid 0.5px #d7cdb7;
            padding-left: 5px;
            margin-bottom: 5px;
        }
    </style>
</head>
<body>
<div id="appleft">
    <ul id="pkul">
        <li class="liedn">
            <span>最新文档<img class="jt" src="${pageContext.request.contextPath}/images/jiantouyou.png" alt=""></span>
            <div class="linchpin">
                <ul class="linchpinch">
                    <li><a href="">导航1子菜单</a></li>
                    <li><a href="">导航1子菜单</a></li>
                    <li><a href="">导航1子菜单</a></li>
                    <li><a href="">导航1子菜单</a></li>
                    <li><a href="">导航1子菜单</a></li>
                </ul>
            </div>
        </li>
        <li class="liedn">
            <span>分类文档<img class="jt" src="${pageContext.request.contextPath}/images/jiantouyou.png" alt=""></span>
            <div class="linchpin">
                <ul class="linchpinch">
                    <li><a href="">导航2子菜单</a></li>
                    <li><a href="">导航2子菜单</a></li>
                    <li><a href="">导航2子菜单</a></li>
                    <li><a href="">导航2子菜单</a></li>
                    <li><a href="">导航2子菜单</a></li>
                </ul>
            </div>
        </li>
        <li class="liedn">
            <span>历史记录<img class="jt" src="${pageContext.request.contextPath}/images/jiantouyou.png" alt=""></span>
            <div class="linchpin">
                <ul class="linchpinch">
                    <li><a href="">导航3子菜单</a></li>
                    <li><a href="">导航3子菜单</a></li>
                    <li><a href="">导航3子菜单</a></li>
                    <li><a href="">导航3子菜单</a></li>
                    <li><a href="">导航3子菜单</a></li>
                </ul>
            </div>
        </li>
        <li class="liedn">
            <span>删除记录<img class="jt" src="${pageContext.request.contextPath}/images/jiantouyou.png" alt=""></span>
            <div class="linchpin">
                <ul class="linchpinch">
                    <li><a href="">导航4子菜单</a></li>
                    <li><a href="">导航4子菜单</a></li>
                    <li><a href="">导航4子菜单</a></li>
                    <li><a href="">导航4子菜单</a></li>
                    <li><a href="">导航4子菜单</a></li>
                </ul>
            </div>
        </li>
        <li class="liedn">
            <span>正在阅读<img class="jt" src="${pageContext.request.contextPath}/images/jiantouyou.png" alt=""></span>
            <div class="linchpin">
                <ul class="linchpinch">
                    <li><a href="">导航5子菜单</a></li>
                    <li><a href="">导航5子菜单</a></li>
                    <li><a href="">导航5子菜单</a></li>
                    <li><a href="">导航5子菜单</a></li>
                    <li><a href="">导航5子菜单</a></li>
                </ul>
            </div>
        </li>
        <li class="liedn">
            <span>设置中心<img class="jt" src="${pageContext.request.contextPath}/images/jiantouyou.png" alt=""></span>
            <div class="linchpin">
                <ul class="linchpinch">
                    <li><a href="">导航6子菜单</a></li>
                    <li><a href="">导航6子菜单</a></li>
                    <li><a href="">导航6子菜单</a></li>
                    <li><a href="">导航6子菜单</a></li>
                    <li><a href="">导航6子菜单</a></li>
                </ul>
            </div>
        </li>
    </ul>
</div>
<script type="text/javascript">
    $(function () {
        // $(document).bind("click",function(e){
        //     alert(e.stopPropagation())
        // });

        $(".liedn").each(function () {
            $(this).click(function () {
                $(this).nextAll().each(function () {
                    $(this).children("div").hide(100);
                    $(this).find(".jt").attr("src", "${pageContext.request.contextPath}/images/jiantouyou.png")
                });
                $(this).prevAll().each(function () {
                    $(this).children("div").hide(100);
                    $(this).find(".jt").attr("src", "${pageContext.request.contextPath}/images/jiantouyou.png")
                });
                $(this).children("div").toggle(200);
                if ($(this).find(".jt").attr("src") === "${pageContext.request.contextPath}/images/jiantouyou.png") {
                    $(this).find(".jt").attr("src", "${pageContext.request.contextPath}/images/jiantouxia.png")
                } else {
                    $(this).find(".jt").attr("src", "${pageContext.request.contextPath}/images/jiantouyou.png")
                }
                // $(this).children("div").siblings().css("display","block");
            });
            $("sapn").click(function () {
                event.stopPropagation();
            })
        })
    })
</script>
</body>
</html>
