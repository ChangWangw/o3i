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
            padding: 0;
            margin: 0;
            text-align: center;
            font-family: STXihei, monospace;
        }

         td, th {
            border: #009b9b 0.5px solid;
        }

        .app-se {
            width: 100%;
            height: 97%;
        }

        .tb {
            width: 94%;
            margin: 1.5% 2% 0 2%;
        }

        tr {
            transition: all 0.07s;
        }
        td{
            height: 30px;

        }

        tbody tr:hover {
            background-color: rgba(250, 225, 236, 0.4);
        }
        .upd,.det{
            display: inline-block;
            width: 33%;
            height: 80%;
            background-image: url("${pageContext.request.contextPath}/images/jlt2.png");
            background-repeat:no-repeat;
        }
        .det{
            background-position: -190px -40px;
        }
        .upd{
            background-position: -190px -19px;
        }
    </style>
</head>
<body>
<div class="app-se">
    <table class="tb" cellspacing="0">
        <thead>
        <tr style="background-color: rgba(100,100,102,0.15);">
            <th style="width: 3%"><input class="cko1" type="checkbox"></th>
            <th style="width: 45%">标题</th>
            <th style="width: 9%">类型</th>
            <th style="width: 9%">作者</th>
            <th style="width: 9%">关注</th>
            <th style="width: 9%">浏览量</th>
            <th style="width: 9%">发布时间</th>
            <th style="width: 7%">编辑</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td><input class="cko" type="checkbox"></td>
            <td>利物浦3-1曼城</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td>
                <div class="upd"></div>
                <div class="det"></div></td>
        </tr>
        <tr>
            <td><input class="cko" type="checkbox"></td>
            <td>六部门约谈网约车</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td><div class="upd"></div>
                <div class="det"></div></td>
        </tr>
        <tr>
            <td><input class="cko" type="checkbox"></td>
            <td>双十一总成交额</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td><div class="upd"></div>
                <div class="det"></div></td>
        </tr>
        <tr>
            <td><input class="cko" type="checkbox"></td>
            <td>华为发放20亿奖金</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td><div class="upd"></div>
                <div class="det"></div></td>
        </tr>
        <tr>
            <td><input class="cko" type="checkbox"></td>
            <td>腾讯全新使命愿景</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td><div class="upd"></div>
                <div class="det"></div></td>
        </tr>
        <tr>
            <td><input class="cko" type="checkbox"></td>
            <td>创业失败30万补贴</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td><div class="upd"></div>
                <div class="det"></div></td>
        </tr>
        <tr>
            <td><input class="cko" type="checkbox"></td>
            <td>中国橄榄球进奥运</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td><div class="upd"></div>
                <div class="det"></div></td>
        </tr>
        <tr>
            <td><input class="cko" type="checkbox"></td>
            <td>关晓彤回应黑眼圈</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td><div class="upd"></div>
                <div class="det"></div></td>
        </tr>
        <tr>
            <td><input class="cko" type="checkbox"></td>
            <td>海沃德左手骨折</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td><div class="upd"></div>
                <div class="det"></div></td>
        </tr>
        <tr>
            <td><input class="cko" type="checkbox"></td>
            <td>利物浦3-1曼城</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td><div class="upd"></div>
                <div class="det"></div></td>
        </tr>
        <tr>
            <td><input class="cko" type="checkbox"></td>
            <td>六部门约谈网约车</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td><div class="upd"></div>
                <div class="det"></div></td>
        </tr>
        <tr>
            <td><input class="cko" type="checkbox"></td>
            <td>双十一总成交额</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td><div class="upd"></div>
                <div class="det"></div></td>
        </tr>
        <tr>
            <td><input class="cko" type="checkbox"></td>
            <td>华为发放20亿奖金</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td><div class="upd"></div>
                <div class="det"></div></td>
        </tr>
        <tr>
            <td><input class="cko" type="checkbox"></td>
            <td>腾讯全新使命愿景</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td><div class="upd"></div>
                <div class="det"></div></td>
        </tr>
        <tr>
            <td><input class="cko" type="checkbox"></td>
            <td>创业失败30万补贴</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td><div class="upd"></div>
                <div class="det"></div></td>
        </tr>
        <tr>
            <td><input class="cko" type="checkbox"></td>
            <td>中国橄榄球进奥运</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td><div class="upd"></div>
                <div class="det"></div></td>
        </tr>
        <tr>
            <td><input class="cko" type="checkbox"></td>
            <td>关晓彤回应黑眼圈</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td><div class="upd"></div>
                <div class="det"></div></td>
        </tr>
        </tbody>
    </table>
</div>
<script type="text/javascript">
    $(function () {
        $(".cko1").click(function () {
            $(".cko").prop("checked", $(this).get(0).checked);
        });
    })
</script>
</body>
</html>
