<%-- 
    Document   : salir
    Created on : Mar 24, 2023, 9:53:11 AM
    Author     : valeriaalfaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.FileWriter"%>
<%@page import="java.io.PrintWriter"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        
        <%! public String fecha() {
        return (new java.util.Date()).toString();
        }
        %>
        
        <%
           
            FileWriter fichero =null;
            PrintWriter pw =null;  
        try{
            pw=response.getWriter();  
            fichero = new FileWriter("//Users//valeriaalfaro//Desktop//proyectoValeriaAlfaro//salidaUsuarios.txt",true);
            
            pw = new PrintWriter(fichero);
            pw.println(" ****"); 
            pw.println(" Fecha y hora de salida: "+fecha()); 
            response.sendRedirect("index.jsp"); 
            
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
        
        %>
    </body>
</html>
