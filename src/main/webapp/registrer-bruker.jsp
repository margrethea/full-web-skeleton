<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

<form action="RegistrerBruker" method="post" class="form-style-9">
    <ul>
        <li>
            <input type="text" name="fornavn" class="field-style field-split align-left" placeholder="Fornavn" />
            <input type="text" name="etternavn" class="field-style field-split align-right" placeholder="Etternavn" />
        </li>

        <li>
            <input type="email" name="epost" class="field-style field-full align-left" placeholder="E-post adresse" />
        </li>

        <li>
            <input type="text" name="fødselsår" class="field-style field-split align-left" placeholder="Fødselsår (YYYY)" />
            <select name="kjønn" class="field-style field-split align-right">
                <option disabled selected> Velg kjønn... </option>
                <option value="Kvinne">Kvinne</option>
                <option value="Mann">Mann</option>
            </select>
        </li>

        <li>
        <select name="klasse" class="field-style field-full align-left">
            <option disabled selected> Velg klasse... </option>
            <option value="1">Senior</option>
            <option value="2">Junior A</option>
            <option value="3">Junior B</option>
            <option value="4">Junior C</option>
        </select>
        </li>

        <li>
            <select name="ListRoklubb" class="field-style field-full align-right">
                <option value="">Velg roklubb...</option>
                <c:forEach items="${listRoklubb}" var="roklubb">
                    <option value="${roklubb.roklubb_id}">${roklubb.klubbnavn}</option>
                </c:forEach>
            </select>
        </li>

         <li>
            <input type="submit" name="action" value="Registrer"/>
        </li>
    </ul>
</form>

</body>

</html>