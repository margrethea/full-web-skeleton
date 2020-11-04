<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">

    <head>
    <link rel="stylesheet" href="main.css">
    <meta charset="UTF-8">
    <title>Registrer resultat - Roforbundet</title>
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
            <a class="active" href="SeniorDD" >Senior</a>
            <a href="JuniorADD">Junior A</a>
            <a href="JuniorBDD">Junior B</a>
            <a  href="JuniorCDD">Junior C</a>
        </div></div><br>

        <a href='registrer-bruker.jsp'><button>Registrer bruker</button></a><br>

    <form action="servlets.Senior" method="post">
     Velg bruker:&nbsp;
        <select name="ListUtøver">
            <option value="">Velg Utøver</option>
            <c:forEach items="${listUtøver}" var="bruker">
                <option value="${bruker.bruker_id}">${bruker.forNavn} ${bruker.etterNavn}</option>
            </c:forEach>
        </select>

        <br/><br/>
            <div class="registrer_resultat">
                <label for="testperiode">Testperiode</label>
                <select class="registrer_resultat" id="testperiode" name="testperiode">
                    <option> Velg testperiode... </option>
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
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
                <label for="5000m_w">5000m (watt)</label>
                <input type="text" name="5000m_w" class="registrer_resultat" id="5000m_w" placeholder="Skriv resultat her...">
            </div><br>

            <div class="registrer_resultat">
                <label for="5000m_t">5000m (tid)</label>
                <input type="text" name="5000m_t" class="registrer_resultat" id="5000m_t" placeholder="Skriv resultat her...">
            </div><br>

            <div class="registrer_resultat">
                <label for="2000m_w">2000m (watt)</label>
                <input type="text" name="2000m_w" class="registrer_resultat" id="2000m_w" placeholder="Skriv resultat her...">
            </div><br>

            <div class="registrer_resultat">
                <label for="2000m_t">2000m (tid)</label>
                <input type="text" name="2000m_t" class="registrer_resultat" id="2000m_t" placeholder="Skriv resultat her...">
            </div><br>

            <div class="registrer_resultat">
                <label for="ligg_ro_p">Liggende roing (prosent)</label>
                <input type="text" name="ligg_ro_p" class="registrer_resultat" id="ligg_ro_p" placeholder="Skriv resultat her...">
            </div><br>

            <div class="registrer_resultat">
                <label for="ligg_ro_kg">Liggende roing (Kg)</label>
                <input type="text" name="ligg_ro_kg" class="registrer_resultat" id="ligg_ro_kg" placeholder="Skriv resultat her...">
            </div><br>

            <div class="registrer_resultat">
                <label for="kneboy_p">Knebøy (prosent)</label>
                <input type="text" name="kneboy_p" class="registrer_resultat" id="kneboy_p" placeholder="Skriv resultat her...">
            </div><br>

            <div class="registrer_resultat">
                <label for="kneboy_kg">Knebøy (Kg)</label>
                <input type="text" name="kneboy_kg" class="registrer_resultat" id="kneboy_kg" placeholder="Skriv resultat her...">
            </div><br>

            <input type="submit" name="action" value="Registrer">

        </form>
    </body>
</html>