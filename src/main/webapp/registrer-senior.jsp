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

        <a href='RoklubbList'><button>Registrer bruker</button></a><br>

    <form action="Senior" method="post">
        <ul class="form-style-1">
            <li><label>Utøver</label>
                <select name="ListUtøver" class="field-select">
                    <option disabled selected>Velg Utøver</option>
                    <c:forEach items="${listUtøver}" var="bruker">
                        <option value="${bruker.bruker_id}">${bruker.forNavn} ${bruker.etterNavn}</option>
                    </c:forEach>
                </select>
            </li>

            <li>
                <label>Testperiode</label>
                <select name="testperiode" class="field-select">
                    <option disabled selected> Velg testperiode... </option>
                    <option value="1">Testperiode 1</option>
                    <option value="2">Testperiode 2</option>
                    <option value="3">Testperiode 3</option>
                </select>
            </li>

            <li>
                <label>60"</label>
                <input type="text" name="60" class="field-long" />
            </li>

            <li>
                <label>Bevegelighet</label>
                <input type="text" name="bevegelighet" class="field-long" /></label>
            </li>

            <li><label>5000m</label><input type="text" name="5000m_w" class="field-divided" placeholder="Watt"  /><input type="text" name="5000m_t" class="field-divided" placeholder="Tid"/></li>

            <li><label>2000m</label><input type="text" name="2000m_w" class="field-divided" placeholder="Watt" /><input type="text" name="2000m_t" class="field-divided" placeholder="Tid" /></li>

            <li><label>Liggende roing</label><input type="text" name="ligg_ro_p" class="field-divided" placeholder="Prosent"/><input type="text" name="ligg_ro_kg" class="field-divided" placeholder="KG" /></li>

            <li><label>Knebøy</label><input type="text" name="kneboy_p" class="field-divided" placeholder="Prosent"><input type="text" name="kneboy_kg" class="field-divided" placeholder="KG"></li>

            <li>
            <input type="submit" value="Registrer">
            </li>
        </ul>

    </form>
</body>
</html>