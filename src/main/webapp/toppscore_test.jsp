<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Norges Roforbund</title>
    <link rel="stylesheet" href="main2.css">

</head>
<body>
<div class="wrapper">
    <nav class="navbar">
        <img class="logo" src="Bilder/NRF2.JPG" alt="Roforbundet logo">
        <ul>
            <li><a class="active" href="index.jsp">Hjem</a></li>
            <li><a href="registrer-resultat.jsp">Registrer resultat</a></li>
            <li><a href="resultatsøk.jsp">Resultatsøk</a></li>
            <li><a href="toppscore_test.jsp.jsp">Toppscore</a></li>
            <li><a href="min-side.jsp">Min side</a></li>
        </ul>
    </nav>
    <div class="center">
        <h1>Toppscore </h1>

        <div class="nasjklubb" style="text-align: center"><div>
            <a class="active" href="toppscore.jsp">Nasjonalt</a>
            <a href="toppscore2.jsp">Klubb</a>
            <!--<p class="nasjonalt">Nasjonalt</p>
            <p class="klubb">Klubb</p> -->
        </div></div><br>

        <form action="HentToppScore" class="" method="post">
            <input type="submit" name="action" value="Nasjonalt">
        </form>

        <form action="HentTopp" method="post">
            <input type="submit" name="action" value="Klubb">
        </form>


    </body>

</html>
