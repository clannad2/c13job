<%@ taglib prefix="C" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: liuxiaoming
  Date: 2020/10/7
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>影院首页</title>
    <style>
        #movieList{
            font-size: 15px;
        }
        #film{
            width: 1000px;
            height: 700px;
            text-align: center;
        }
    </style>
</head>
<body>
<table id="film" rules=rows border="1" frame="0">
    <tr style="height: 50px">
        <td style="text-align: right;">
            <span>欢迎</span>
            <a>${sessionScope.user.userName}</a>
            &nbsp&nbsp&nbsp&nbsp&nbsp
        </td>
    </tr>
<%--    <tr style="height: 50px">--%>
<%--        <td width="100" style="text-align: left;">万达影城</td>--%>
<%--        <td style="text-align: right;">--%>
<%--            <a href="login">登录</a>--%>
<%--            <a href="register">注册</a>--%>
<%--        </td>--%>
<%--    </tr>--%>

    <tr>
        <td width="170" valign="top">
            <table cellspacing="0" border="1" width="140">
                <tr>
                    <td>CBD店</td>
                </tr>
                <tr>
                    <td>西单店</td>
                </tr>
                <tr>
                    <td>金融街</td>
                </tr>
                <tr>
                    <td>望京店</td>
                </tr>
                <tr>
                    <td>中关村店</td>
                </tr>
                <tr>
                    <td>大兴店</td>
                </tr>
            </table>
        </td>
        <td>
            <div style="height: 50px;text-align: left">
                <span>放映厅：</span>
                <select>
                    <option>所有厅</option>
                    <option>1号厅</option>
                    <option>2号厅</option>
                    <option>3号厅</option>
                </select>
                <span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
                <span>上映时间：</span>
                <select>
                    <option></option>
                    <option>2020年8月10号</option>
                    <option>2020年8月11号</option>
                    <option>2020年8月12号</option>
                    <option>2020年8月13号</option>
                </select>
                <button>搜索</button>
            </div>

            <div style="height: 600px">
                <c:if test="${empty requestScope.films}">
                        很抱歉，暂时没有影片上映
                </c:if>
                <c:if test="${!empty requestScope.films}">
                    <table id="movieList">
                        <%
                            int i=0;
                        %>
                        <c:forEach items="${films}" var="film">
                            <%
                                if (i%4==0){
                                    out.write("</tr>");
                                }
                            %>
                            <td style="height: 330px;width: 190px">
                                <div>
                                    <img src="img/img.jpg" width="150px" height="200px"/>
<%--                                    <div>--%>
<%--                                        <form action="getMovieInfo" method="post" name="getMovieInfo" style="margin-bottom: 0">--%>
<%--                                            <input type="hidden" name="movieId" value="${movieInfo.id}">--%>
<%--                                            <span>片名:</span>--%>
<%--                                            <span>${film.filmName}</span>--%>
<%--                                            <button type="submit">详情</button>--%>
<%--                                        </form>--%>
<%--                                    </div>--%>
                                    <div>
                                        <span>片名:</span>
                                        <span>${film.filmName}</span>
                                    </div>
                                    <div>
                                        <span>类型:</span>
                                        <span>${film.filmType}</span>
                                    </div>
                                    <div>
                                        <span>主演:</span>
                                        <span>${film.filmRole}</span>
                                    </div>
                                    <div>
                                        <form action="toticketdetail" method="post">
                                            <input type="hidden" name="filmId" value="${film.filmId}">
                                            <input type="submit" value="购票">
                                        </form>

                                    </div>
                                    <%
                                        i++;
                                    %>
                                </div>
                            </td>
                            <%
                                if (i%4==0){
                                    out.write("</tr>");
                                }
                            %>
                        </c:forEach>
                    </table>

                </c:if>

            </div>

            <div id="page_nav" style="text-align: center">
                <a href="#">首页</a>
                <a href="#">1</a>
                <a href="#">2</a>
                <a href="#">3</a>
                <a href="#">4</a>
                <a href="#">5</a>
                <a href="#">6</a>
                <a href="#">末页</a>
            </div>


        </td>
    </tr>

</table>
</body>
</html>
