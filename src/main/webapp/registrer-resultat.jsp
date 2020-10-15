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
        <form>
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
                    <input type="text" name="fornavn" placeholder="Skriv fornavn her...">
            </div><br>


            <div class="registrer_resultat">
                    <label for="enavn">Etternavn</label>
                    <input type="text" class="registrer_resultat" id="enavn" placeholder="Skriv etternavn her...">
            </div><br>
  
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
            </div><br>

            </div><br>

            <input type="submit" name="action" value="Registrer">

        </form>
    </body>

</html>