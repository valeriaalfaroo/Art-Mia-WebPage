<%-- 
    Document   : acercaDe
    Created on : Apr 6, 2023, 9:38:14 PM
    Author     : valeriaalfaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Acerca De</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!--Favicon-->
    <link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">

    <!-- THEME CSS
	================================================== -->
    <!-- Bootstrap -->
    <link rel="stylesheet" href="bootstrap.min.css">
    <!-- Themify -->
    <link rel="stylesheet" href="themify-icons.css">
    <link rel="stylesheet" href="slick-theme.css">
    <link rel="stylesheet" href="slick.css">
    <!-- Slick Carousel -->
    <link rel="stylesheet" href="owl.carousel.min.css">
    <link rel="stylesheet" href="owl.theme.default.min.css">
    <link rel="stylesheet" href="magnific-popup.css">
    <!-- manin stylesheet -->
    <link rel="stylesheet" href="style.css">
</head>

<body>


    <div class="header-logo py-5 d-none d-lg-block">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-lg-6 text-center">
                    <a class="navbar-brand" href="paginaPrincipal"><img src="images/logo.png" alt=""
                            class="img-fluid w-100"></a>
                </div>
            </div>
        </div>
    </div>

    <header class="header-top bg-grey justify-content-center">
        <nav class="navbar navbar-expand-lg navigation">
            <div class="container">
                <a class="navbar-brand d-lg-none" href="paginaPrincipal"><img src="images/logo.png" alt=""
                        class="img-fluid"></a>

                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarContent"
                    aria-controls="navbarContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="ti-menu"></span>
                </button>
               <div class="collapse navbar-collapse" id="navbarContent">
                     <ul id="menu" class="menu navbar-nav mx-auto">
                        <li class="nav-item"><a href="paginaPrincipal" class="nav-link">Inicio</a></li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown2" role="button" data-toggle="dropdown"
                                aria-haspopup="true" aria-expanded="false">
                                Productos
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown2">
                                <a class="dropdown-item" href="productos.jsp">Agregar</a>
                                <a class="dropdown-item" href="actualizarProductos.jsp">Actualizar</a>
                                <a class="dropdown-item" href="mostrarProductos.jsp">Mostrar</a>
                                <a class="dropdown-item" href="eliminarProductos.jsp">Eliminar</a>
                                
                            </div>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
                                aria-haspopup="true" aria-expanded="false">
                                Personas
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" >Clientes:</a>
                                <a class="dropdown-item" href="clientes.jsp">Agregar</a>
                                 <a class="dropdown-item" href="actualizarClientes.jsp">Actualizar</a>
                                <a class="dropdown-item" href="mostrarClientes.jsp">Mostrar</a>
                                 <a class="dropdown-item" href="eliminarClientes.jsp">Eliminar</a>
                                <a class="dropdown-item" >Usuarios:</a>
                                <a class="dropdown-item" href="usuarios.jsp">Agregar</a>
                                 <a class="dropdown-item" href="actualizarUsuarios.jsp">Actualizar</a>
                                <a class="dropdown-item" href="mostrarUsuarios.jsp">Mostrar</a>
                                 <a class="dropdown-item" href="eliminarUsuarios.jsp">Eliminar</a>
                               
                            </div>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown3" role="button" data-toggle="dropdown"
                                aria-haspopup="true" aria-expanded="false">
                                Facturas
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown3">
                                <a class="dropdown-item" href="facturas.jsp">Agregar</a>
                                 <a class="dropdown-item" href="actualizarFacturas.jsp">Actualizar</a>
                                <a class="dropdown-item" href="mostrarFacturas.jsp">Mostrar</a>
                                 <a class="dropdown-item" href="eliminarFacturas.jsp">Eliminar</a>
                                
                            </div>
                        </li>
                          <li class="nav-item"><a  href="auditoria.jsp" class="nav-link">Auditoría</a></li>

                        <li class="nav-item"><a href="acercaDe.jsp" class="nav-link">Acerca De</a></li>
                        
                        <li class="nav-item"><a href="salir.jsp" class="nav-link">Salir</a></li>
                       
                    </ul>
                </div>

                
            </div>
        </nav>

    </header>
    <!--search overlay start-->
    
    <!--search overlay end-->

    <section class="single-block-wrapper section-padding">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-lg-10 col-md-10 col-sm-12 col-xs-12">
                    <div class="single-post">
                        <div class="post-header mb-5 text-center">
                            <div class="meta-cat">
                                <a class="post-category font-extra text-color text-uppercase font-sm letter-spacing-1"
                                    href="#">Acerca de ,</a>
                                <a class="post-category font-extra text-color text-uppercase font-sm letter-spacing-1"
                                    href="#">Créditos</a>
                            </div>
                            <h2 class="post-title mt-2">
                                Nosotros
                            </h2>

                            
                            
                        </div>
                        <div class="post-body">
                            <div class="entry-content">
                                
                                
   
                                <h2 class="post-title mt-2">Créditos Universitarios</h2>
                                 <h4 class="post-category font-extra text-color text-uppercase font-sm letter-spacing-1">Universidad Latina de Costa Rica</h4>
                                <h2 class="post-title mt-2">Profesora: </h2>
                                <h4 class="post-category font-extra text-color text-uppercase font-sm letter-spacing-1">Adriana Stephanie Rubio</h4>
                                <h2 class="post-title mt-2">Curso: </h2>
                                <h4 class="post-category font-extra text-color text-uppercase font-sm letter-spacing-1">BIS06 Programación III</h4>
                                <br>
                                <h2 class="post-title mt-2">Desarrolladora</h2>
                                <h3 class="post-category font-extra text-color text-uppercase font-sm letter-spacing-1">Valeria Alfaro Quesada</h3>
                                <img src="images/vale.png" alt="" class="img-fluid w-75">
                                <p>Hola! mi nombre es Valeria Alfaro y soy la desarrolladora de esta página web.</p>  
                                <p>Soy estudiante de Ingeniería en Sistemas en 
                                la Universidad Latina de Costa Rica, espero que disfrutes de la página!</p>
                                
                            
                            </div>
                            
                        </div>
                    </div>

                   
                    
                    

                    

                    

                </div>
            </div>
        </div>
    </section>


    <!--footer start-->
    
    <footer class="footer-section bg-grey">
        
    </div>

    <div class="container">
        <div class="row">
            <div class="col-lg-12 text-center">
                <div class="mb-4">
                    <h2 class="footer-logo">Art Mia.</h2>
                </div>
                
            </div>

            <div class="col-md-12 text-center">
                <p class="copyright">© Copyright 2023 - Art Mia <a
                        class="text-white" >Valeria Alfaro Quesada.</a></p>
            </div>
        </div>
    </div>
</footer>
    <!--footer end-->

    <!-- THEME JAVASCRIPT FILES
================================================== -->
    <!-- initialize jQuery Library -->
    <script src="jquery.js"></script>
    <!-- Bootstrap jQuery -->
    <script src="bootstrap.min.js"></script>
    <script src="popper.min.js"></script>
    <!-- Owl caeousel -->
    <script src="owl.carousel.min.js"></script>
    <script src="slick.min.js"></script>
    <script src="magnific-popup.js"></script>
    <!-- Instagram Feed Js -->
    <script src="instafeed.min.js"></script>
    <!-- Google Map -->
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCC72vZw-6tGqFyRhhg5CkF2fqfILn2Tsw"></script>
    <script src="gmap.js"></script>
    <!-- main js -->
    <script src="custom.js"></script>


</body>


</html>