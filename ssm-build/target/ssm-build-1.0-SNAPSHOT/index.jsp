<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
    <head>
        <title>首页</title>
        <style type="text/css">
            a {
                text-decoration: none;
                color: black;
                font-size: 18px;
            }

            h3 {
                width: 180px;
                height: 38px;
                margin: 100px auto;
                text-align: center;
                line-height: 38px;
                background: deepskyblue;
                border-radius: 4px;
            }
        </style>
    </head>
    <body>

        <%--
                 ${pageContext.request.contextPath }是一个jsp内部提供的，帮我们自动匹配上下文环境的，
                 不需要我们像以前一样把代码写死
                 自动匹配到的绝对地址，保证项目的正常运行
        --%>
        <h3>
            <a href="${pageContext.request.contextPath}/book/allBook">点击进入列表页</a>
        </h3>
    </body>
</html>