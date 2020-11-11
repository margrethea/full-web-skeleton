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
    <form action="HentResultat_A" method="post">
    <div class="resultatsøk_linker" style="text-align: center"><div>
    <a href="resultatsøk-senior.jsp">Senior</a>
    <a class="active" href="resultatsøk-juniorA.jsp">Junior A</a>
    <a href="resultatsøk-juniorB.jsp">Junior B</a>
    <a href="resultatsøk-juniorC.jsp">Junior C</a>
</div></div><br>

<div class="resultatsøk">
    <label for="fornavn">Fornavn</label>
    <input type="text"  name="fornavn" id="fornavn" >

    <label for="etternavn">Etternavn</label>
    <input type="text" name="etternavn" id="etternavn">

    <div class="resultatsøk_linker">
        <label for="testperiode">Testperiode</label>
        <%--  <input type="text" name="periode" id="testperiode" > --%>
        <select class="resultatsøk" id="testperiode" name ="periode" >
            <option>Periode</option>
            <option>1</option>
            <option>2</option>
            <option>3</option>
        </select>
    </div><br>

    <div class="resultatsøk">
        <label for="kjønn">Kjønn</label>
        <%-- <input type="text" name="kjønn" id="kjønn">--%>
        <select name="gender" id="kjønn">
            <option>Gender</option>
            <option value="mann">Mann</option>
            <option value="kvinne">Kvinne</option>
        </select>
    </div><br>

    <%-- <div class="resultatsøk">
          <label for="øvelse">Øvelse</label>
          <input type="text" name="øvelse" id="øvelse">
          <select name="Øvelse" id="øvelse">
              <option value="Velg_øvelse">Velg øvelse...</option>
              <option value="5000m_w">5000 meter watt</option>
              <option value="5000m_t">5000 meter tid</option>
              <option value="2000m_w">2000 meter watt</option>
              <option value="2000m_t">2000 meter tid</option>
              <option value="60">60"</option>
              <option value="Liggende_roing_p">Liggende roing prosent</option>
              <option value="Liggende_roing_kg">Liggende roing kg</option>
              <option value="Bevegelighet">Bevegelighet</option>
              <option value="Knebøy_p">Knebøy prosent</option>
              <option value="Knebøy_kg">Knebøy kg</option>
          </select>--%>
</div><br>

        <div class="resultatsøk">
            <label for="årstall">Årstall</label>
            <%--  <input type="text" name="testår" id="årstall">--%>
            <select name="year" id="årstall">
                <option>Year</option>
                <option value="2004">2004</option>
                <option value="2005">2005</option>
                <option value="2006">2006</option>
                <option value="2007">2007</option>
                <option value="2008">2008</option>
                <option value="2009">2009</option>
                <option value="2010">2010</option>
                <option value="2011">2011</option>
                <option value="2012">2012</option>
                <option value="2013">2013</option>
                <option value="2014">2014</option>
                <option value="2015">2015</option>
                <option value="2016">2016</option>
                <option value="2017">2017</option>
                <option value="2018">2018</option>
                <option value="2019">2019</option>
                <option value="2020">2020</option>
            </select>
        </div><br>

        <input type="submit" name="action" value="Søk">
    </form>


</body>
</html>