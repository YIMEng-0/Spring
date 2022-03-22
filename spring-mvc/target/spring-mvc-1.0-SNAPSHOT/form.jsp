<%--
  Created by IntelliJ IDEA.
  User: yimeng
  Date: 2022/3/20
  Time: 3:11 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <form action="/spring-mvc/hello" id="form" method="post">
            <h1 id="loginMsg">LOGIN IN</h1>
            <p>Username:<input id="username" name="username" type="text"></p>

            <p>Password:<input id="password" name="password" type="password"></p>

            <input type="submit" class="button" value="login up">
        </form>
    </body>
</html>