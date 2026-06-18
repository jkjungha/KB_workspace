<%--
  Created by IntelliJ IDEA.
  User: junghakim
  Date: 2026. 6. 17.
  Time: 오후 3:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Todo Register Page</title>
</head>
<body>
    <form action="/todo/register" method="post">
        <div> Title : <input type="text" name="title"></div>
        <div> DueDate : <input type="date" name="dueDate" value="2026-06-17"> </div>
        <div> Writer : <input type="text" name="writer"> </div>
        <div> Finished : <input type="checkbox" name="finished"> </div>
        <div> </div>
    </form>
Todo register
</body>
</html>
