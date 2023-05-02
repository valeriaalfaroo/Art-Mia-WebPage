/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ulatina.paginaPrincipal.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author valeriaalfaro
 */
@WebServlet(name = "paginaPrincipal", urlPatterns = {"/paginaPrincipal"})
public class paginaPrincipal extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
     public String fecha() {
        return (new java.util.Date()).toString();
        }
     
     private Cookie userCookie; 
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
        
       
            FileWriter fichero =null;
            PrintWriter pw =null;  
             String usuario= request.getParameter("usuario"); 
             if(usuario!= null){
        try{
           
            
        
             
            fichero = new FileWriter("//Users//valeriaalfaro//Desktop//proyectoValeriaAlfaro//loginUsuarios.txt",true);
            pw = new PrintWriter(fichero);
            pw.println(" ****"); 
            pw.println(" Usuario ingresado: "+usuario); 
            pw.println(" Fecha y hora de ingreso: "+fecha()); 
           
            
        }catch(Exception ex){
           out.print("Sucedio un error"); 
           
        }finally{
          try{
            if(null!=fichero)
            fichero.close(); 
            }
            catch(Exception ex){
             out.print("Sucedio un error"); 
            }
          }
             }
        
        
          
            String username =request.getParameter("usuario");
            if(username!=null)
            userCookie= new Cookie("usuario",username);
         
            String mensaje= userCookie.getValue(); 
           
           if(mensaje!=null){
           mensaje="<h1>Bienvenid@ "+mensaje+" ! </h1>";  
           }
            
           
            
            out.println("<!DOCTYPE html>\n" +
"\n" +
"\n" +
"\n" +
"<html lang=\"en\">\n" +
"\n" +
"<head>\n" +
"	<meta charset=\"utf-8\">\n" +
"	<title>Inicio</title>\n" +
"	<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
"\n" +
"	<!-- theme meta -->\n" +
"	<meta name=\"theme-name\" content=\"revolve\" />\n" +
"\n" +
"	<!--Favicon-->\n" +
"	<link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\n" +
"\n" +
"	<!-- THEME CSS\n" +
"	================================================== -->\n" +
"	<!-- Bootstrap -->\n" +
"	<link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n" +
"	<!-- Themify -->\n" +
"	<link rel=\"stylesheet\" href=\"themify-icons.css\">\n" +
"	<link rel=\"stylesheet\" href=\"slick-theme.css\">\n" +
"	<link rel=\"stylesheet\" href=\"slick.css\">\n" +
"	<!-- Slick Carousel -->\n" +
"	<link rel=\"stylesheet\" href=\"owl.carousel.min.css\">\n" +
"	<link rel=\"stylesheet\" href=\"owl.theme.default.min.css\">\n" +
"	<link rel=\"stylesheet\" href=\"magnific-popup.css\">\n" +
"	<!-- manin stylesheet -->\n" +
"	<link rel=\"stylesheet\" href=\"style.css\">\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"\n" +
"	<header class=\"header-top bg-grey justify-content-center\">\n" +
"		<div class=\"container\">\n" +
"			<div class=\"row align-items-center\">\n" +
"				<div class=\"col-lg-2 col-md-4 text-center d-none d-lg-block\">\n" +
"					<a class=\"navbar-brand \" href=\"paginaPrincipal\">\n" +
"						<img src=\"images/logo.png\" alt=\"\" class=\"img-fluid\">\n" +
"					</a>\n" +
"				</div>\n" +
"\n" +
"				<div class=\"col-lg-8 col-md-12\">\n" +
"					<nav class=\"navbar navbar-expand-lg navigation-2 navigation\">\n" +
"						<a class=\"navbar-brand text-uppercase d-lg-none\" href=\"#\">\n" +
"							<img src=\"images/logo.png\" alt=\"\" class=\"img-fluid\">\n" +
"						</a>\n" +
"						<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar-collapse\"\n" +
"							aria-controls=\"navbar-collapse\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
"							<span class=\"ti-menu\"></span>\n" +
"						</button>\n" +
"\n" +
"						<div class=\"collapse navbar-collapse\" id=\"navbar-collapse\">\n" +
"							<ul id=\"menu\" class=\"menu navbar-nav mx-auto\">\n" +
"								<li class=\"nav-item\"><a href=\"paginaPrincipal\" class=\"nav-link\">Inicio</a></li>\n" +
"								<li class=\"nav-item dropdown\">\n" +
"									<a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown2\" role=\"button\" data-toggle=\"dropdown\"\n" +
"										aria-haspopup=\"true\" aria-expanded=\"false\">\n" +
"										Productos\n" +
"									</a>\n" +
"									<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown2\">\n" +
"										<a class=\"dropdown-item\" href=\"productos.jsp\">Agregar</a>\n" +
"								                <a class=\"dropdown-item\" href=\"actualizarProductos.jsp\">Actualizar</a>\n" +
"										<a class=\"dropdown-item\" href=\"mostrarProductos.jsp\">Mostrar</a>\n" +
"										<a class=\"dropdown-item\" href=\"eliminarProductos.jsp\">Eliminar</a>\n" +
"									</div>\n" +
"								</li>\n" +
"                                                                     <li class=\"nav-item dropdown\">\n" +
"									<a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\"\n" +
"										aria-haspopup=\"true\" aria-expanded=\"false\">\n" +
"										Personas\n" +
"									</a>\n" +
"									<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n" +
"										<a class=\"dropdown-item\" >Clientes:</a>\n" +
"										<a class=\"dropdown-item\" href=\"clientes.jsp\">Agregar</a>\n" +
"								                <a class=\"dropdown-item\" href=\"actualizarClientes.jsp\">Actualizar</a>\n" +
"										<a class=\"dropdown-item\" href=\"mostrarClientes.jsp\">Mostrar</a>\n" +
"										<a class=\"dropdown-item\" href=\"eliminarClientes.jsp\">Eliminar</a>\n" +
"										<a class=\"dropdown-item\" >Usuarios:</a>\n" +
"										<a class=\"dropdown-item\" href=\"usuarios.jsp\">Agregar</a>\n" +
"										<a class=\"dropdown-item\" href=\"actualizarUsuarios.jsp\">Actualizar</a>\n" +
"										<a class=\"dropdown-item\" href=\"mostrarUsuarios.jsp\">Mostrar</a>\n" +
"										<a class=\"dropdown-item\" href=\"eliminarUsuarios.jsp\">Eliminar</a>\n" +
"									</div>\n" +
"								</li>\n" +
"								<li class=\"nav-item dropdown\">\n" +
"									<a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown3\" role=\"button\" data-toggle=\"dropdown\"\n" +
"										aria-haspopup=\"true\" aria-expanded=\"false\">\n" +
"										Facturas\n" +
"									</a>\n" +
"									<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown3\">\n" +
"										<a class=\"dropdown-item\" href=\"facturas.jsp\">Agregar</a>\n" +
"										<a class=\"dropdown-item\" href=\"actualizarFacturas.jsp\">Actualizar</a>\n" +
"										<a class=\"dropdown-item\" href=\"mostrarFacturas.jsp\">Mostrar</a>\n" +
"										<a class=\"dropdown-item\" href=\"eliminarFacturas.jsp\">Eliminar</a>\n" +
"									</div>\n" +
"								</li>\n" +
"\n" +
"						                <li class=\"nav-item\"><a href=\"auditoria.jsp\" class=\"nav-link\">Auditoria</a></li>\n" +
"								<li class=\"nav-item\"><a href=\"acercaDe.jsp\" class=\"nav-link\">Acerca De</a></li>\n" +
"								\n" +
"								<li class=\"nav-item\"><a href=\"salir.jsp\" class=\"nav-link\">Salir</a></li>\n" +
"							</ul>\n" +
"\n" +
"							\n"+
"                                               "+mensaje+"  \n"+                    
"						</div>\n" +
"					</nav>\n" +
"				</div>\n" +
"\n" +
"				\n" +
"			</div>\n" +
"		</div>\n" +
"	</header>\n" +
"\n" +
"	<section class=\"slider mt-4\">\n" +
"		<div class=\"container-fluid\">\n" +
"			<div class=\"row no-gutters\">\n" +
"				<div class=\"col-lg-12 col-sm-12 col-md-12 slider-wrap\">\n" +
"					<div class=\"slider-item\">\n" +
"						<div class=\"slider-item-content\">\n" +
"							<div class=\"post-thumb mb-4\">\n" +
"								<a href=\"mostrarProductos.jsp\">\n" +
"									<img src=\"images/slider/slider1.jpg\" alt=\"\" class=\"img-fluid\">\n" +
"								</a>\n" +
"							</div>\n" +
"\n" +
"							<div class=\"slider-post-content\">\n" +
"								<span class=\"cat-name text-color font-sm font-extra text-uppercase letter-spacing\">Estilos</span>\n" +
"								<h3 class=\"post-title mt-1\"><a href=\"mostrarProductos.jsp\">Alta variedad de estilos en nuestros productos</a></h3>\n" +
"								\n" +
"							</div>\n" +
"						</div>\n" +
"					</div>\n" +
"\n" +
"					<div class=\"slider-item\">\n" +
"						<div class=\"slider-item-content\">\n" +
"							<div class=\"post-thumb mb-4\">\n" +
"								<a href=\"mostrarProductos.jsp\">\n" +
"									<img src=\"images/slider/slider2.jpg\" alt=\"\" class=\"img-fluid\">\n" +
"								</a>\n" +
"							</div>\n" +
"							<div class=\"slider-post-content\">\n" +
"								<span class=\"cat-name text-color font-sm font-extra text-uppercase letter-spacing\">Moda</span>\n" +
"								<h3 class=\"post-title mt-1\"><a href=\"mostrarProductos.jsp\">Seguimos innovando y actualizando diariamente</a></h3>\n" +
"								\n" +
"							</div>\n" +
"						</div>\n" +
"					</div>\n" +
"\n" +
"					<div class=\"slider-item\">\n" +
"						<div class=\"slider-item-content\">\n" +
"							<div class=\"post-thumb mb-4\">\n" +
"								<a href=\"mostrarProductos.jsp\">\n" +
"									<img src=\"images/slider/slider3.webp\" alt=\"\" class=\"img-fluid\">\n" +
"								</a>\n" +
"							</div>\n" +
"							<div class=\"slider-post-content\">\n" +
"								<span class=\"cat-name text-color font-sm font-extra text-uppercase letter-spacing\">Calidad</span>\n" +
"								<h3 class=\"post-title mt-1\"><a href=\"mostrarProductos.jsp\">Productos 100% de calidad</a></h3>\n" +
"								\n" +
"							</div>\n" +
"						</div>\n" +
"					</div>\n" +
"\n" +
"					<div class=\"slider-item\">\n" +
"						<div class=\"slider-item-content\">\n" +
"							<div class=\"post-thumb mb-4\">\n" +
"								<a href=\"mostrarProductos.jsp\">\n" +
"									<img src=\"images/slider/slider4.webp\" alt=\"\" class=\"img-fluid\">\n" +
"								</a>\n" +
"							</div>\n" +
"\n" +
"							<div class=\"slider-post-content\">\n" +
"								<span class=\"cat-name text-color font-sm font-extra text-uppercase letter-spacing\">Precios accesibles</span>\n" +
"								<h3 class=\"post-title mt-1\"><a href=\"mostrarProductos.jsp\">Tratamos de dar los precios más bajos posibles</a></h3>\n" +
"								\n" +
"							</div>\n" +
"						</div>\n" +
"					</div>\n" +
"\n" +
"					<div class=\"slider-item\">\n" +
"						<div class=\"slider-item-content\">\n" +
"							<div class=\"post-thumb mb-4\">\n" +
"								<a href=\"mostrarProductos.jsp\">\n" +
"									<img src=\"images/slider/slider5.webp\" alt=\"\" class=\"img-fluid\">\n" +
"								</a>\n" +
"							</div>\n" +
"\n" +
"							<div class=\"slider-post-content\">\n" +
"								<span class=\"cat-name text-color font-sm font-extra text-uppercase letter-spacing\">Originalidad</span>\n" +
"								<h3 class=\"post-title mt-1\"><a href=\"mostrarProductos.jsp\">Buscamos productos únicos para usted</a></h3>\n" +
"								\n" +
"							</div>\n" +
"						</div>\n" +
"					</div>\n" +
"				</div>\n" +
"			</div>\n" +
"		</div>\n" +
"	</section>\n" +
"\n" +
"	<section class=\"section-padding\">\n" +
"		<div class=\"container\">\n" +
"			\n" +
"		</div>\n" +
"	</section>\n" +
"\n" +
"	<section class=\"footer-2 section-padding gray-bg pb-5\">\n" +
"		<div class=\"container\">\n" +
"			<div class=\"row justify-content-center\">\n" +
"				<div class=\"col-lg-6\">\n" +
"					<div class=\"subscribe-footer text-center\">\n" +
"						<div class=\"form-group mb-0\">\n" +
"							<h2 class=\"mb-3\">Suscríbete a nuestra página</h2>\n" +
"							<p class=\"mb-4\">Suscríbete a nuestra página para avisos de nuevos productos e info.\n" +
"							<p>\n" +
"							<div class=\"form-group form-row align-items-center mb-0\">\n" +
"								<div class=\"col-sm-9\">\n" +
"									<input type=\"email\" class=\"form-control\" placeholder=\"Dirección de correo\">\n" +
"								</div>\n" +
"								<div class=\"col-sm-3\">\n" +
"									<a href=\"#\" class=\"btn btn-dark \">Suscribir</a>\n" +
"								</div>\n" +
"							</div>\n" +
"						</div>\n" +
"					</div>\n" +
"				</div>\n" +
"			</div>\n" +
"\n" +
"			<div class=\"footer-btm mt-5 pt-4 border-top\">\n" +
"				<div class=\"row\">\n" +
"					<div class=\"col-lg-12\">\n" +
"						\n" +
"					</div>\n" +
"				</div>\n" +
"				<div class=\"row justify-content-center\">\n" +
"					<div class=\"col-lg-6\">\n" +
"						<div class=\"copyright text-center \">\n" +
"							@ copyright -2023 <a\n" +
"								>Valeria Alfaro Quesada</a></p>\n" +
"						</div>\n" +
"					</div>\n" +
"				</div>\n" +
"			</div>\n" +
"		</div>\n" +
"	</section>\n" +
"\n" +
"\n" +
"	<!-- THEME JAVASCRIPT FILES\n" +
"================================================== -->\n" +
"	<!-- initialize jQuery Library -->\n" +
"	<script src=\"jquery.js\"></script>\n" +
"	<!-- Bootstrap jQuery -->\n" +
"	<script src=\"bootstrap.min.js\"></script>\n" +
"	<script src=\"popper.min.js\"></script>\n" +
"	<!-- Owl caeousel -->\n" +
"	<script src=\"owl.carousel.min.js\"></script>\n" +
"	<script src=\"slick.min.js\"></script>\n" +
"	<script src=\"magnific-popup.js\"></script>\n" +
"	<!-- Instagram Feed Js -->\n" +
"	<script src=\"instafeed.min.js\"></script>\n" +
"	<!-- Google Map -->\n" +
"	<script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCC72vZw-6tGqFyRhhg5CkF2fqfILn2Tsw\"></script>\n" +
"	<script src=\"gmap.js\"></script>\n" +
"	<!-- main js -->\n" +
"	<script src=\"custom.js\"></script>\n" +
"\n" +
"\n" +
"</body>\n" +
"\n" +
"</html>");
            
           
           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
