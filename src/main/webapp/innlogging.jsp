<%--
  Created by IntelliJ IDEA.
  User: rikkesolvang
  Date: 06/11/2020
  Time: 09:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <head>
        <meta charset="UTF-8">
        <title>Norges Roforbund</title>
        <link rel="stylesheet" href="innloggging.css">
    </head>
<body>

<div class='bold-line'></div>
<div class='container'>
    <div class='window'>
        <div class='overlay'></div>
        <div class='content'>
            <div class='welcome'>Velkommen</div>
            <br>
            <div class='subtitle'>
                Fyll inn e-post og brukernavn for å få tilgang til registreringsprogrammet</div>
            <br>
            <div class='input-fields'>
                <input type='email' placeholder='E-post' class='input-line full-width'></input>
                <input type='password' placeholder='Passord' class='input-line full-width'></input>

            </div>
            <div class='spacing'>Glemt passord? Trykk <span class='highlight'>her</span></div>
            <div>
                <a href="index.jsp"><button class='ghost-round full-width'>Logg inn</button></a>
            </div>
        </div>
    </div>
</div>

</body>
</Html>
