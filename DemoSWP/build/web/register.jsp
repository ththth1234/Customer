<%-- 
    Document   : register
    Created on : May 29, 2025, 1:00:49 PM
    Author     : QuangAnh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h1>Please register</h1>
        <form action="auth" method="POST">
            Username:<input type="text" name="user" value=""><br>
            Password:<input type="text" name="pass" value=""><br>
            <input type="hidden" name="action" vslue="login">
            <button>Login</button>
            
        </form>
        <a href="login.jsp">Back</a>
        </form>
    </body>
</html>
