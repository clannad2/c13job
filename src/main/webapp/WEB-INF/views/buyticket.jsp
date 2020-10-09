<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>电影票详情</title>
</head>
<body>
<table id="film" rules=rows border="1" frame="0" align="center">
    <tr style="height: 50px">
        <td width="200" style="text-align: left;">万达影城 <a href="loadingfilm">首页</a></td>
        <td></td>
        <td style="text-align: right;">
            <span>欢迎</span>
            <a>${sessionScope.user.userName}</a>
            &nbsp&nbsp&nbsp&nbsp&nbsp
        </td>
    </tr>
    <tr>
        <td width="170" valign="top">
            <table cellspacing="0" border="1" width="140">
                <img src="/img/img.png" width="150px" height="200px"/>
            </table>
        </td>
<%--        <td width="650">--%>
<%--            <table>--%>
<%--                <tr>--%>
<%--                    <h3>--%>
<%--                        ${film.filmName}--%>
<%--                    </h3>--%>
<%--                </tr>--%>
<%--                <hr/>--%>
<%--                <c:forEach items="${movieInfo.movieReview}" var="movieReview">--%>
<%--                    <br/>--%>
<%--                    <tr>--%>
<%--                        <span>${movieReview.userName}</span>--%>
<%--                        <br/>--%>
<%--                        <span>${movieReview.movieReview}</span>--%>
<%--                    </tr>--%>
<%--                    <br/>--%>
<%--                </c:forEach>--%>
<%--                <div id="page_nav" style="text-align: center">--%>
<%--                    <a href="#">首页</a>--%>
<%--                    <a href="#">1</a>--%>
<%--                    <a href="#">2</a>--%>
<%--                    <a href="#">3</a>--%>
<%--                    <a href="#">4</a>--%>
<%--                    <a href="#">5</a>--%>
<%--                    <a href="#">6</a>--%>
<%--                    <a href="#">末页</a>--%>
<%--                </div>--%>
<%--            </table>--%>

<%--            <form action="addReview" method="post">--%>
<%--                <input name="movieId" type="hidden" value="${movieInfo.id}">--%>
<%--                <br/>--%>
<%--                <textarea rows="10" cols="30" style="width: 500px" name="review"></textarea>--%>
<%--                <br/>--%>
<%--                <button type="submit">发表评论</button>--%>
<%--            </form>--%>
<%--        </td>--%>
        <td width="170" valign="top">
            <table cellspacing="0" border="1" width="140">
                <tr>片名：</tr>
                <tr>${film.filmName}</tr>
                <br/>
                <tr>类型：</tr>
                <tr>${film.filmType}</tr>
                <br/>
                <tr>主演：</tr>
                <tr>${film.filmRole}</tr>
                <br/>
                <tr>价格：</tr>
                <tr>${film.filmPrice}</tr>
                <br/>
                <tr>剩余票数：</tr>
                <tr>${film.filmStock}</tr>
                <tr>
                    <form href="buyticket" method="post">
                        <input type="hidden" name="filmId" value="${film.filmId}">
                        <input type="hidden" name="userId" value="${sessionScope.user.userId}">
                        <input type="text" name="filmNums">
                        <input type="submit" name="确定" value="submit">
                    </form>
                </tr>
            </table>
        </td>
    </tr>

</table>
</body>
</html>
