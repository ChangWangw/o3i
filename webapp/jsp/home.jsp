<%--@ page import="com.sun.xml.internal.rngom.ast.builder.Include" %><%--
  Created by IntelliJ IDEA.
  User: Change
  Date: 2019/10/12
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common.jsp" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>choc在线编辑</title>
    <style type="text/css">
        * {
            margin: 0;
            padding: 0;
            list-style: none;
        }

        .hot-app {
            width: 99%;
            height: 99%;
        }

        .hot1 {
            border: #62cedd solid 1px;
            display: inline-block;
            position: absolute;
            top: 1%;
            left: 1%;
            /*margin-top: 1%;*/
            /*margin-left: 1%;*/
            width: 40%;
            height: 47%;
            -webkit-box-shadow: 20px 20px 20px #909090;
            border-radius: 10px;
            background-size:cover;

        }

        .hot1-cuohao {
            display: inline-block;
            width: 1.5%;
            height: 3%;
        }

        .hot1-cuohao img {
            width: 100%;
            height: 100%;
        }
    </style>
</head>
<body>
<%--<input type="text" id="search">--%>
<div class="hot-app">
    <div class="hot1" style="left: 25%; width: 50%; height: 50%; top: 20%; opacity: 1; z-index: 4; display: block;">
        <div class="hot1-cuohao"><img src="${pageContext.request.contextPath}/images/cross.png" alt=""></div>
    </div>
    <div class="hot1" style="left: 60%; width: 30%; height: 30%; top: 30%; opacity: 0.4; display: block; z-index: 1;">
        <div class="hot1-cuohao"><img src="${pageContext.request.contextPath}/images/cross.png" alt=""></div>
    </div>
    <div class="hot1" style="left: 35%; width: 30%; height: 30%; top: 30%; opacity: 0; z-index: 0; display: block;">
        <div class="hot1-cuohao"><img src="${pageContext.request.contextPath}/images/cross.png" alt=""></div>
    </div>
    <div class="hot1" style="left: 10%; width: 30%; height: 30%; top: 30%; opacity: 0.4; z-index: 1; display: block;">
        <div class="hot1-cuohao"><img src="${pageContext.request.contextPath}/images/cross.png" alt=""></div>
    </div>
</div>
<script type="text/javascript">
    $(function () {
        var ss=1;
        $(".hot1").each(function () {
            $(this).css("background-image","url('${pageContext.request.contextPath}/images/home_image/timg"+ss+++".png')")
        });
        // $(".hot1").hover(function() {
        //     $(this).css('width','31%');
        //     $(this).css('height','31%')
        // });
        $(".hot1").click(function () {
            // alert($(this).css('z-index'));
            $(".hot1").stop(true);
            if ($(this).index() === 0) {
                $(this).next().nextAll().each(function () {
                    if ($(this).index() !== $(".hot1").length - 1) {
                        $(this).animate({
                            "left": "35%",
                            "width": "30%",
                            "height": "30%",
                            "top": "30%",
                            "opacity": "0",
                            "z-index": "1"
                        }, 1000)
                    }
                })
            } else {
                $(this).next().nextAll().animate({
                    "left": "35%",
                    "width": "30%",
                    "height": "30%",
                    "top": "30%",
                    "opacity": "0",
                    "z-index": "1"
                }, 1000)
            }
            if ($(this).index() === $(".hot1").length - 1) {
                $(this).prev().prevAll().each(function () {
                    if ($(this).index() !== 0) {
                        $(this).animate({
                            "left": "35%",
                            "width": "30%",
                            "height": "30%",
                            "top": "30%",
                            "opacity": "0",
                            "z-index": "1"
                        }, 1000)
                    }
                })
            } else {
                $(this).prev().prevAll().animate({
                    "left": "35%",
                    "width": "30%",
                    "height": "30%",
                    "top": "30%",
                    "opacity": "0",
                    "z-index": "1"
                }, 1000)
            }
            $(this).animate({
                "top": "20%",
                "width": "50%",
                "height": "50%",
                "left": "25%",
                "opacity": "1",
                "z-index": "4",
                "display": "block"
            }, 1000);
            if ($(this).index() !== $(".hot1").length - 1) {
                $(this).next().animate({
                    "top": "30%",
                    "width": "30%",
                    "height": "30%",
                    "left": "60%",
                    "opacity": "0.4",
                    "z-index": "1",
                    "display": "block"
                }, 1000);
            } else {
                $(".hot1").first().animate({
                    "top": "30%",
                    "width": "30%",
                    "height": "30%",
                    "left": "60%",
                    "opacity": "0.4",
                    "z-index": "1",
                    "display": "block"
                }, 1000);
            }
            if ($(this).index() !== 0) {
                $(this).prev().animate({
                    "top": "30%",
                    "width": "30%",
                    "height": "30%",
                    "left": "10%",
                    "opacity": "0.4",
                    "z-index": "1",
                    "display": "block"
                }, 1000);
            } else {
                $(".hot1").last().animate({
                    "top": "30%",
                    "width": "30%",
                    "height": "30%",
                    "left": "10%",
                    "opacity": "0.4",
                    "z-index": "1",
                    "display": "block"
                }, 1000);
            }
        })
    })
</script>
<script type="text/javascript">
    // $(function () {
    //     var $net=1;
    //     $(".hot1").each(function () {
    //         $(this).hover(function () {
    //             if ($net===1){
    //                 $(this).css("top","0.5%");
    //                 $(this).css("left","0.5%");
    //                 $(this).css("width","41%");
    //                 $(this).css("height","48.5%");
    //             }
    //         },function () {
    //             if ($net===1) {
    //                 $(this).css("top", "1%");
    //                 $(this).css("left", "1%");
    //                 $(this).css("width", "40%");
    //                 $(this).css("height", "47%");
    //             }
    //         });
    //         $(this).click(function () {
    //             if ($net===1) {
    //                 $net += 1;
    //                 $(this).css("width", "99%");
    //                 $(this).css("height", "99%")
    //             }
    //         });
    //         $(this).find(".hot1-cuohao").click(function () {
    //             event.stopPropagation();
    //             if ($net===2) {
    //                 $net-=1;
    //                 $(this).parent().css("top", "0.5%");
    //                 $(this).parent().css("left", "0.5%");
    //                 $(this).parent().css("width", "41%");
    //                 $(this).parent().css("height", "48%");
    //             }else {
    //                 $(this).parent().remove()
    //             }
    //         })
    //     });
    // })
</script>
</body>
</html>
