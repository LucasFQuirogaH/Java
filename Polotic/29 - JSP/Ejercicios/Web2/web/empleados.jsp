<%-- 
    Document   : empleados
    Created on : 09/12/2021, 06:11:19
    Author     : lucquifer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administracion</title>
    </head>
    <body>
        <h1>Alta empleados</h1>
        
        <p> Ingrese los datos </p>
        <form action="SvEmpleado"method="POST">
        <p> <label>Nombre:</label><input type="text" name = "nombre"></p>
        <p> <label>Apellido:</label><input type="text" name = "apellido"></p>
        <p> <label>Sueldo:</label><input type="text" name = "sueldo"></p>
        <p> <label>Nombre de Usuario:</label><input type="text" name = "nombreUsu"></p>
        <p> <label>Contraseña:</label><input type="password" name = "contrasenia"></p>
                
        <button type="submit">Enviar</button>
        </form>
    </body>
</html>
