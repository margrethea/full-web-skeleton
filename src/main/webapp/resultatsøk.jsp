<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <link rel="stylesheet" href="main.css">
        <meta charset="UTF-8">
        <title>Resultatsøk - Roforbundet</title>
    </head>

    <body>
        <div class="topnav">
            <a href="index.jsp">Hjem</a>
            <a href="registrer-resultat.jsp">Registrer resultat</a>
            <a href="toppscore.jsp">Toppscore</a>
        <div class="topnav-right">
            <a href="min-side.jsp">Min side</a>
            <a class="active" href="resultatsøk.jsp">Resultatsøk</a>
            <a href="innstillinger.jsp">Innstillinger</a>
        </div>
        </div>

        <a href="index.jsp"><img src="https://assets.website-files.com/5b3335ab4ca8551124a2ba8f/5cbf778b0cdebda6ec56b4a6_norges-roforbund-logo-p-500.png"
                         alt="logo" class="center" ></a>

        <h1>Resultatsøk</h1>

        <label for="fornavn"><b>Fornavn</b></label><br>
        <input type="text" placeholder="søk fornavn" name="fornavn" id="fornavn">


        <form action="Hentbruker" method="post">
            navn <input type="text" name="bruker">
            <input type="submit">
        </form>

    </body>

</html>
