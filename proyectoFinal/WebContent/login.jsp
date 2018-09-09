<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Página de acceso</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
</head>
<body class="text-center">
    <form class="form-signin" action="login" method="post" >
      <img class="mb-4" src="https://glovoapp.com/assets-cdn/images/logo_togo.svg" alt="" width="420" height="150">
      <h1 class="h3 mb-3 font-weight-normal">Elegir de la lista de alimentos</h1>
      <label for="inputUser" class="sr-only">Usuario:</label>
      <input type="text" name="user" id="inputUser" class="form-control" placeholder="Usuario" required autofocus>
      <label for="inputPassword" class="sr-only">Contraseña:</label>
      <input type="password" name="pwd" id="inputPassword" class="form-control" placeholder="Contraseña" required>
      <div class="checkbox mb-3">
        <label>
          <input type="checkbox" value="remember-me"> Recordar mis datos
        </label>
      </div>
      <button class="btn btn-lg btn-warning btn-block" type="submit">Acceder</button>
      <p class="mt-5 mb-3 text-muted">&copy; CFTIC 2018</p>
    </form>

</body>
</html>
