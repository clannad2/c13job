<%--
  Created by IntelliJ IDEA.
  User: liuxiaoming
  Date: 2020/10/7
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>影院登录页面</title>
</head>
<body>
<div>
    <div>
        <span>欢迎登录</span>
    </div>
    <br/>
    <div>
        <div>
            <div>
                <br/>
                <div>
                    <b></b>
                    <span>请输入用户名和密码</span>
                </div>
                <br/>
                <div>
                    <form action="tologin" method="post">
                        <label>用户名称：</label>
                        <input type="text" placeholder="请输入用户名"
                               autocomplete="off" tabindex="1" name="userName"/>
                        <br/>
                        <br/>
                        <label>用户密码：</label>
                        <input type="password" placeholder="请输入密码"
                               autocomplete="off" tabindex="1" name="userPwd"/>
                        <br/>
                        <br/>
                        <input type="submit" value="登录"/>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
