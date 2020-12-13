<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <link rel="stylesheet" href="main.css">
        <meta charset="UTF-8">
        <title>Toppscore - Roforbundet</title>
    </head>

    <body>
        <div class="topnav">
            <a href="index.jsp">Hjem</a>
            <a href="registrer-resultat.jsp">Registrer resultat</a>
            <a class="active" href="toppscore.jsp">Toppscore</a>
            <div class="topnav-right">
                <a href="min-side.jsp">Min side</a>
                <a href="resultatsøk.jsp">Resultatsøk</a>
                <a href="innstillinger.jsp">Innstillinger</a>
            </div>
        </div>

        <a href="index.jsp"><img src="https://assets.website-files.com/5b3335ab4ca8551124a2ba8f/5cbf778b0cdebda6ec56b4a6_norges-roforbund-logo-p-500.png"
                                 alt="logo" class="center" ></a>

        <h1>Toppscore</h1>

        <div class="nasjklubb" style="text-align: center"><div>
            <a class="active" href="toppscore.jsp">Nasjonalt</a>
            <a href="toppscore2.jsp">Klubb</a>
            <!--<p class="nasjonalt">Nasjonalt</p>
            <p class="klubb">Klubb</p> -->
        </div></div><br>
        <form action="HentTopp" method="post">
          <input type="submit" name="action" value="Søk">

        <form action="HentTopp" method="post">
            <input type="submit" name="action" value="søk">
        </form>

        <div style="text-align: center;"><div>
            <table style="" class="nasjonalt">
                <caption>Senior Mann</caption>
                <tr>
                    <th>Plassering</th>
                    <th>Toppscore</th>
                </tr>
                <tr>
                    <td>1</td>
                    <td></td>
                </tr>
                <tr>
                    <td>2</td>
                    <td></td>
                </tr>
                <tr>
                    <td>3</td>
                    <td></td>
                </tr>
                <tr>
                    <td>4</td>
                    <td></td>
                </tr>
                <tr>
                    <td>5</td>
                    <td></td>
                </tr>
            </table>

            <table style="" class="nasjonalt">
                <caption>Junior A Gutt</caption>
                <tr>
                    <th>Plassering</th>
                    <th>Toppscore</th>
                </tr>
                <tr>
                    <td>1</td>
                    <td></td>
                </tr>
                <tr>
                    <td>2</td>
                    <td></td>
                </tr>
                <tr>
                    <td>3</td>
                    <td></td>
                </tr>
                <tr>
                    <td>4</td>
                    <td></td>
                </tr>
                <tr>
                    <td>5</td>
                    <td></td>
                </tr>
            </table>

            <table style="" class="nasjonalt">
                <caption>Junior B Gutt</caption>
                <tr>
                    <th>Plassering</th>
                    <th>Toppscore</th>
                </tr>
                <tr>
                    <td>1</td>
                    <td></td>
                </tr>
                <tr>
                    <td>2</td>
                    <td></td>
                </tr>
                <tr>
                    <td>3</td>
                    <td></td>
                </tr>
                <tr>
                    <td>4</td>
                    <td></td>
                </tr>
                <tr>
                    <td>5</td>
                    <td></td>
                </tr>

                <table style="" class="nasjonalt">
                    <caption>Senior Kvinne</caption>
                    <tr>
                        <th>Plassering</th>
                        <th>Toppscore</th>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>4</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>5</td>
                        <td></td>
                    </tr>
                </table>

                <table style="" class="nasjonalt">
                    <caption>Junior A Jente</caption>
                    <tr>
                        <th>Plassering</th>
                        <th>Toppscore</th>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>4</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>5</td>
                        <td></td>
                    </tr>
                </table>

                <table style="" class="nasjonalt">
                    <caption>Junior B Jente</caption>
                    <tr>
                        <th>Plassering</th>
                        <th>Toppscore</th>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>4</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>5</td>
                        <td></td>
                    </tr>
                </table>
            </table>
    </body>

</html>
