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


        <!--
        <form>
        <div style="text-align: center;"><div>
            <h3 class="bevegelighet">Bevegelighet</h3>
                <input type="text" name="Bevegelighet" placeholder="Skriv resultat her">

            <h3 class="liggendeRoing">Liggende roing</h3>
                <input type="text" name="Liggenderoing" placeholder="Skriv resultat her">

            <h3 class="knebøy">Knebøy</h3>
                <input type="text" name="Knebøy" placeholder="Skriv resultat her">
        </div></div>

        <div style="text-align: center;"><div>
            <h3 class="klasse">Klasse</h3>
                <select name="Klasser" id="klasser">
                    <option value="Velg Klasse">Velg klasse...</option>
                    <option value="SeniorMenn">Senior Menn</option>
                    <option value="SeniorKvinne">Senior Kvinner</option>
                    <option value="JuniorAGutt">Junior A Gutt</option>
                    <option value="JuniorAJente">Junior A Jenter</option>
                    <option value="JuniorBGutt">Junior B Gutt</option>
                    <option value="JuniorBJente">Junior B Jente</option>
                    <option value="JuniorCGutt">Junior C Gutt</option>
                    <option value="JuniorCJenter">Junior C Jenter</option>
                </select>

            <h3 class="testPeriode">Test Periode</h3>
                <select name="Test periode" id="testperiode">
                    <option value="velgperiode">Velg periode...</option>
                    <option value="periode1">Periode 1</option>
                    <option value="periode2">Periode 2</option>
                    <option value="periode3">Periode 3</option>
                </select>

            <h3 class="utøver">Utøver</h3>
                <select name="Test periode" id="velgutøver">
                    <option value="velgutøver">Velg Utøver...</option>
                </select>
        </div></div>

        <div style="text-align: center;"><div>
            <h3 class="høyde">Høyde</h3>
                <input type="text" name="Høyde" placeholder="Skriv resultat her">

            <h3 class="vekt">Vekt</h3>
                <input type="text" name="Vekt" placeholder="Skriv resultat her">

            <h3 class="toppscore">Toppscore</h3>
                <input type="text" name="Toppscore" placeholder="Skriv resultat her">

            <br><input type="submit" value="Registrer">
        </div></div>
        </form>
        !-->
        <form action="servlets.Senior" method="get">
            <select name="option">
                <option name="Mann">Mann</option>
                <option name="Kvinne">Kvinne</option>
            </select>
            <input type="text" name="fornavn" >
            <input type="text" name="etternavn" >
            <input type="submit" name="action" value="Submit name">

        </form>
      <!--  <form action="servlets.Senior" method="get">
            <div class="registrer_resultat">
                <label for="klasse">Klasse</label>
                <select class="registrer_resultat" id="klasse">
                    <option>Senior Menn</option>
                    <option>Senior Kvinner</option>
                    <option>Junior A Gutter</option>
                    <option>Junior A Jenter</option>
                    <option>Junior B Gutter</option>
                    <option>Junior B Jenter</option>
                    <option>Junior C Gutter</option>
                    <option>Junior C Jenter</option>
                </select>
            </div><br>

            <div class="registrer_resultat">
                    <input type="text" name="fornavn" placeholder="Skriv fornavn her..."> -->
           <!-- </div><br> -->


         <!--   <div class="registrer_resultat">
                    <label for="enavn">Etternavn</label>
                    <input type="text" class="registrer_resultat" id="enavn" placeholder="Skriv etternavn her...">
            </div><br>-->
   <!--
            <div class="registrer_resultat">
                <label for="testperiode">Testperiode</label>
                <select class="registrer_resultat" id="testperiode">
                    <option>Testperiode 1</option>
                    <option>Testperiode 2</option>
                    <option>Testperiode 3</option>
                </select>
            </div><br>

            <div class="registrer_resultat">
                <label for="5000m_w">5000m (watt)</label>
                <input type="text" class="registrer_resultat" id="5000m_w" placeholder="Skriv resultat her...">
            </div><br>

            <div class="registrer_resultat">
                <label for="5000m_t">5000m (tid)</label>
                <input type="text" class="registrer_resultat" id="5000m_t" placeholder="Skriv resultat her...">
            </div><br>

            <div class="registrer_resultat">
                <label for="3000m_w">3000m (watt)</label>
                <input type="text" class="registrer_resultat" id="3000m_w" placeholder="Skriv resultat her...">
            </div><br>

            <div class="registrer_resultat">
                <label for="3000m_t">3000m (tid)</label>
                <input type="text" class="registrer_resultat" id="3000m_t" placeholder="Skriv resultat her...">
            </div><br>

            <div class="registrer_resultat">
                <label for="2000m_w">2000m (watt)</label>
                <input type="text" class="registrer_resultat" id="2000m_w" placeholder="Skriv resultat her...">
            </div><br>

            <div class="registrer_resultat">
                <label for="2000m_t">2000m (tid)</label>
                <input type="text" class="registrer_resultat" id="2000m_t" placeholder="Skriv resultat her...">
            </div><br> -->

          <!--  <input type="submit" name="action" value="Registrer">-->







        </form>
    </body>

</html>