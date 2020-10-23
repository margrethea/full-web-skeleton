
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registrer Bruker DAO</title>
</head>
<body>

    <div align="center">
        <h2>Drop down</h2>
        <form action="UtøverList" method="post">
            Velg bruker:&nbsp;
            <select name="ListUtøver">
                <c:forEach items="${Utøverliste}" var="bruker">
                    <option value="${bruker.id}">${bruker.navn}</option>
                </c:forEach>
            </select>
            <br/><br/>
            <input type="submit" value="Submit" />
        </form>
    </div>
    </body>
    </html>

