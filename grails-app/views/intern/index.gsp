<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta name="layout" content="main"/>
	<title>Intern</title>
    </head>
    <body>
        <div class="nav" role="navigation">
            <ul>
            	<li><a class="home" href="/index.gsp">Home</a></li>
             
            </ul>
	</div>        

        <h1>Intern </h1>

        <table class='display'>

            <g:each status="i" in="${internlist}" var="intern">
            <!-- Alternate CSS classes for the rows. -->
                <tr class="${ (i % 2) == 0 ? 'even' : 'odd'}">
                    <td>${intern.title}</td>
                    <td>${intern.description}</td>
                    
                </tr>
            </g:each>

        </table>


    </body>
</html>
