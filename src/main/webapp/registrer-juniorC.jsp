<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <link rel="stylesheet" href="main.css">
        <meta charset="UTF-8">
        <title>Min side - Roforbundet</title>
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

    <h1>Registrer resultat</h1>

    <div class="registrer-resultat" style="text-align: center"><div>
        <a href="registrer-senior.jsp">Senior</a>
        <a href="registrer-juniorA.jsp">Junior A</a>
        <a href="registrer-juniorB.jsp">Junior B</a>
        <a class="active" href="registrer-juniorC.jsp">Junior C</a>
    </div></div><br>

    <form action="JuniorC" method="post">
        <div class="registrer_resultat">
            <label for="kjønn">Kjønn</label>
            <select class="registrer_resultat" id="kjønn">
                <option>Velg kjønn... </option>
                <option>Gutt</option>
                <option>Jente</option>
            </select>
        </div><br>
<!--
        <div class="registrer_resultat">
            <label for="fornavn">Fornavn</label>
            <input type="text" name="fornavn" class="registrer_resultat" id="fornavn" placeholder="Skriv fornavn her...">
        </div><br>


        <div class="registrer_resultat">
            <label for="etternavn">Etternavn</label>
            <input type="text" name="etternavn" class="registrer_resultat" id="etternavn" placeholder="Skriv etternavn her...">
        </div><br>
--!>
        <div class="registrer_resultat">
            <label for="testperiode">Testperiode</label>
            <select class="registrer_resultat" id="testperiode">
                <option> Velg testperiode... </option>
                <option>Testperiode 1</option>
                <option>Testperiode 2</option>
                <option>Testperiode 3</option>
            </select>
        </div><br>

        <div class="registrer_resultat">
            <label for="60">60"</label>
            <input type="text" name="60" class="registrer_resultat" id="60" placeholder="Skriv resultat her...">
        </div><br>

        <div class="registrer_resultat">
            <label for="bevegelighet">Bevegelighet</label>
            <input type="text" name="bevegelighet" class="registrer_resultat" id="bevegelighet" placeholder="Skriv resultat her...">
        </div><br>

        <div class="registrer_resultat">
            <label for="3000m">3000m</label>
            <input type="text" name="3000m" class="registrer_resultat" id="3000m" placeholder="Skriv resultat her...">
        </div><br>

        <div class="registrer_resultat">
            <label for="kroppshev">Kroppshev</label>
            <input type="text" name="kroppshev" class="registrer_resultat" id="kroppshev" placeholder="Skriv resultat her...">
        </div><br>

        <div class="registrer_resultat">
            <label for="sargeant">Sargeant</label>
            <input type="text" name="sargeant" class="registrer_resultat" id="sargeant" placeholder="Skriv resultat her...">
        </div><br>


        <input type="submit" name="action" value="Registrer">
        <p>trololol</p>
    </form>

    </body>