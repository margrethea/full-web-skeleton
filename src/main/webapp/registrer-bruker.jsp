<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <link rel="stylesheet" href="main.css">
    <meta charset="UTF-8">
    <title>Registrer bruker - Roforbundet</title>
</head>

<body>
<div class="topnav">
    <a href="index.jsp">Hjem</a>
    <a class="active" href="registrer-resultat.jsp">Registrer resultat</a>
    <a href="toppscore.jsp">Toppscore</a>
    <div class="topnav-right">
        <a href="min-side.jsp">Min side</a>
        <a href="resultatsøk.jsp">Resultatsøk</a>
        <a href="innstillinger.jsp">Innstillinger</a>
    </div>
</div>

<a href="index.jsp"><img src="https://assets.website-files.com/5b3335ab4ca8551124a2ba8f/5cbf778b0cdebda6ec56b4a6_norges-roforbund-logo-p-500.png"
                         alt="logo" class="center" ></a>

<h1>Registrer bruker</h1>

<form action="" method="post">
    <div class="registrer-bruker">
        <label for="fornavn">Fornavn</label>
        <input type="text" name="fornavn" class="registrer-bruker" id="fornavn" placeholder="Skriv fornavn her...">
    </div><br>

    <div class="registrer-bruker">
        <label for="etternavn">Etternavn</label>
        <input type="text" name="etternavn" class="registrer-bruker" id="etternavn" placeholder="Skriv etternavn her...">
    </div><br>

    <div class="registrer-bruker">
    <label for="epost">E-post</label>
    <input type="text" name="epost" class="registrer-bruker" id="epost" placeholder="Skriv e-post her...">
    </div><br>

    <div class="registrer-bruker">
    <label for="fødselsår">Fødselsår</label>
    <input type="text" name="fødselsår" class="registrer-bruker" id="fødselsår" placeholder="Skriv fødselsår her...">
    </div><br>

    <div class="registrer-bruker">
        <label for="kjønn">Kjønn</label>
        <select name="" class="registrer-bruker" id="kjønn">
            <option> Velg kjønn...</option>
            <option>Mann</option>
            <option>Kvinne</option>
        </select>
    </div><br>

    <div class="registrer-bruker">
        <label for="roklubb">Roklubb</label>
        <input type="text" name="roklubb" class="registrer-bruker" id="roklubb" placeholder="Skriv roklubb her...">
    </div><br>

    <input type="submit" name="action" value="Registrer">

</form>
</body>

</html>