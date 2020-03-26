<%--
  Created by IntelliJ IDEA.
  User: Hang_ccccc
  Date: 2020/3/24
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
<script>
  $(function () {
    $("#button").click(function () {
      $.get("${pageContext.request.contextPath}/loginDemo", {"name":"lisi", "password": "1234"}, function () {
        console.log("完成了")
      })
    });
  });
</script>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <button id="button">按钮</button>
  </body>
</html>
