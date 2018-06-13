<!DOCTYPE html>
<html>
<head>
    <title>index</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
</head>
<body>
<div style="background-image: http://localhost/image/1.jpg;height: auto;width: auto">
    <div align="center">
        <h1>登陆系统</h1>
        <form action="/login" method="post">
            账号：<input type="text" name="username" id="username"><br>
            密码：<input type="password" name="password" id="password"><br>
            <input type="submit" value="确定" id="submit">
        </form>
        <#if ErrorTimes??>
             <p style="color: red">已登陆错误${ErrorTimes!""}次</p>
        </#if>
    </div>
</div>

</body>
</html>