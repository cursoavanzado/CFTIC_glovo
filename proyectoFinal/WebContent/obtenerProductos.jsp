<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page	language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Lista de productos</title>

    <!-- Bootstrap core CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">


    <!-- Custom styles for this template -->
    <link href="carousel.css" rel="stylesheet">
  </head>
  <body>

    <header>
      <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
    <div class="container">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <a class="navbar-brand mr-auto ml-3 mr-sm-3 ml-sm-0" href="#">Glovo</a>
        <div class="collapse navbar-collapse" id="navbarCollapse">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
              <a class="nav-link" href="#">Lista de alimentos <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
              <a class="nav-link disabled" href="#">Historico de pedidos</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Modificar tarjeta</a>
            </li>
          </ul>
      </div>
<!-- 
          <form class="form-inline mt-2 mt-md-0">
            <input class="form-control mr-sm-2" type="text" placeholder="Producto, categoría..." aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
          </form>
 -->
 <a class="nav-link p-2" href="toCesta" aria-label="Cesta">
<!--  <img src="https://www.brandeps.com/icon-download/S/Shopping-basket-02.svg" style="width:45px;" /> -->
 <i class="fas fa-shopping-basket" style="font-size:1.5em; color:white;"></i>

</a>
        </div>
      </nav>
    </header>

    <main role="main">



      <!-- Marketing messaging and featurettes
      ================================================== -->
      <!-- Wrap the rest of the page in another container to center all the content. -->

      <div class="container marketing mt-5">

        <!-- Three columns of text below the carousel -->
        <ul class="row list-unstyled" >
        <c:forEach var="p" items="${requestScope.productos}">
          <li class="col-md-6 col-lg-4">
            <img class="rounded-circle" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image" width="140" height="140">
            <h2>${p.precio}</h2>
            <p>${p.nombre}</p>
            <p><a class="btn btn-info" href="/modificarcarrito/${p.idProducto}" role="button">Añadir a la cesta &raquo;</a></p>
          </li><!-- /.col-lg-4 -->
        </c:forEach>
        </ul><!-- /.row -->



      </div><!-- /.container -->


      <!-- FOOTER -->
      <footer class="container">
        <p class="float-right"><a href="#">Subir</a></p>
        <p>&copy; 2018 CFTIC &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
      </footer>
    </main>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<!--     <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script> -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
<!--     <script src="https://cdnjs.cloudflare.com/ajax/libs/holder/2.9.4/holder.min.js"></script> -->
  </body>
</html>
