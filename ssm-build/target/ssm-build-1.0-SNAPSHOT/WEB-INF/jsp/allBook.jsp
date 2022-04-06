<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>书籍列表</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- 引入 Bootstrap -->
        <%--在线引用 BootStrap--%>
        <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>

        <div class="container">
            <%--清除浮动--%>
            <div class="row clearfix">
                <%--屏幕分为 12 份--%>
                <div class="col-md-12 column">
                    <div class="page-header">
                        <h1>
                            <small>书籍列表 —— 显示所有书籍</small>
                        </h1>
                    </div>
                </div>
            </div>

            <%--添加转换的按钮--%>
            <%--跳转界面，在 controller 进行跳转--%>
            <div class="row">
                <div class="col-md-4 column">
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddBook">新增</a>
                </div>
            </div>

            <div class="row clearfix">
                <div class="col-md-12 column">
                    <%--表格隔行变色的前端页面--%>
                    <table class="table table-hover table-striped">
                        <%--表格头--%>
                        <thead>
                        <tr>
                            <th>书籍编号</th>
                            <th>书籍名字</th>
                            <th>书籍数量</th>
                            <th>书籍详情</th>
                            <th>操作</th>
                        </tr>
                        </thead>

                        <%--表格身体--%>
                        <tbody>
                        <%--数据从后端的 list 返回来，在这里需要进行遍历操作--%>
                        <c:forEach var="book" items="${requestScope.get('list')}">
                            <tr>
                                <td>${book.getBookID()}</td>
                                <td>${book.getBookName()}</td>
                                <td>${book.getBookCounts()}</td>
                                <td>${book.getDetail()}</td>
                                <td>
                                        <%--让 controller 进行页面的跳转工作--%>
                                        <%--这里的 book 是循环里面的，就是循环中的每一行数据，向后端传递数据，需要传递数据到后端--%>
                                    <a href="${pageContext.request.contextPath}/book/toUpdateBook?id=${book.getBookID()}">更改</a>
                                    |
                                    <a href="${pageContext.request.contextPath}/book/del/${book.getBookID()}">删除</a>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>