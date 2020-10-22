
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registrer Bruker DAO</title>
</head>
<body>

    <div align="center">
        <h2>Dynamic Drop Down List Demo</h2>
        <form action="UtøverList" method="post">
            Select a Category:&nbsp;
            <select name="Utøverliste">
                <c:forEach items="${listUtøver}" var="bruker">
                    <option value="${Utøverlist.id}"
                            <c:if test="${Utøverliste.id eq SelectedBrukerId}">selected="selected"</c:if>
                    >${category.name}
                    </option>
                </c:forEach>
            </select>
            <br/><br/>
            <input type="submit" value="Submit" />
        </form>
    </div>
    </body>
    </html>

