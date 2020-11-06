<%--
  Created by IntelliJ IDEA.
  User: rikkesolvang
  Date: 06/11/2020
  Time: 09:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Log in</title>
</head>
<body>

<form action="LoginServlet" method="post">
    <input type="text" name="brukernavn" placeholder="Skriv ditt brukernavn"><br>
    <input type="password" name="passord" placeholder="Skriv ditt passord">
    <input type="submit" value="Log in">


</form>

</body>
</html>
