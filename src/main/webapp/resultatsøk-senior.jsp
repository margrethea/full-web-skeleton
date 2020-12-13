<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
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

<div class="resultatsøk_linker" style="text-align: center"><div>
    <a class="active" href="resultatsøk-senior.jsp">Senior</a>
    <a href="resultatsøk-juniorA.jsp">Junior A</a>
    <a href="resultatsøk-juniorB.jsp">Junior B</a>
    <a href="resultatsøk-juniorC.jsp">Junior C</a>
</div></div><br>

<form action="HentResultat" method="post">
    <ul class="form-style-1">

        <li><label>Navn</label><input type="text" name="fornavn" class="field-divided" placeholder="Fornavn"><input type="text" name="etternavn" class="field-divided" placeholder="Etternavn"></li>

        <li>
            <label>Testperiode</label>
            <select name="periode" class="field-long">
                <option value="Periode"> Velg testperiode... </option>
                <option value="1">Testperiode 1</option>
                <option value="2">Testperiode 2</option>
                <option value="3">Testperiode 3</option>
            </select>
        </li>

        <li>
            <label>Kjønn</label>
            <select name="gender" class="field-long">
                <option value="Gender">Velg kjønn...</option>
                <option value="kvinne">Kvinne</option>
                <option value="mann">Mann</option>
            </select>
        </li>

        <li>
            <label>År</label>
            <select name="year" class="field-long">
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
        </li>

        <li>
            <label>Roklubb</label>
            <input type="text" name="roklubb" class="field-long">
        </li>

        <li>
            <input type="submit" name="action" value="Søk">
        </li>
    </ul>
</form>
</body>
</html>
