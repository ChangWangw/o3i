<%--
  Created by IntelliJ IDEA.
  User: Change
  Date: 2019/11/18
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
</head>
<body>
<h1>hello</h1>
<script type="text/javascript">
    $(function () {
        window.location.href = "${pageContext.request.contextPath}/schools/insert"
    })
</script>
</body>
</html>
