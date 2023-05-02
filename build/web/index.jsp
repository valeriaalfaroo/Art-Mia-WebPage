<%-- 
    Document   : index
    Created on : Mar 23, 2023, 11:05:27 PM
    Author     : valeriaalfaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.FileWriter"%>
<%@page import="java.io.PrintWriter"%>
<!DOCTYPE html>


<html>

<head>
  <link rel="stylesheet" href="font-awesome.min.css">
  <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <link rel="stylesheet" href="font-awesome.min.css">
  <title>Sign in</title>
</head>

<body>
    
  <div class="main">
    <p class="sign" align="center">Art Mia</p>
    
        <form class="form1" name="Login" method="POST" action="paginaPrincipal">
            
            <input class="un" type="text" name="usuario" value="" align="center" placeholder="Digite su usuario " required/> <br> 
            
            <input class="pass" type="password" value="" name="password" align="center" placeholder="Digite su contraseña" required /><br>

            <input class="submit" align="center" type="submit" value="Ingresar" name="ingresar" /> 
            <input class="submit" align="center" type="reset" value="Cancelar" name="cancelar" />
           
        </form>
            
    </div>
      
</body>


</html>





