<%-- 
    Document   : Empleado
    Created on : 14/12/2021, 07:43:45
    Author     : lucquifer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en"><head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <title>Agencia de Viajes</title>
        <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/swiper-bundle.css"><link rel="stylesheet" href="css/style.css">

    </head>
    <body>
        <!-- partial:index.partial.html -->
        <div class="container">
            <div class="header">
                <a class="menu-icon" href="#">

                </a>
                <img class="logo" src="index_archivos/Silicome.webp">
                <div class="header-menu">
                    <a href="Empleado.jsp">Empleado</a>
                    <a href="Ventas.jsp">Ventas</a>
                    <a href="Paquete.jsp">Paquete</a>
                    <a href="Servicio.jsp">Servicio</a>
                    <a href="Usuario.jsp">Usuario</a>
                </div>
                <div class="header-icons">
                </div>
            </div>


            <div class="mySwiper swiper-fade swiper-initialized swiper-horizontal swiper-pointer-events">
                <div class="main-wrapper swiper-wrapper" style="transition-duration: 0ms;" id="swiper-wrapper-1fab63c6dbff25a0" aria-live="polite"><div class="main swiper-slide swiper-slide-duplicate swiper-slide-prev" id="coral" data-swiper-slide-index="3" style="width: 1023px; transition-duration: 0ms; opacity: 1; transform: translate3d(0px, 0px, 0px);" role="group" aria-label="4 / 4">
                        <div class="left-side">
                            <div class="main-wrapper">
                                <h3 class="main-header">Closca Bottle</h3>
                                <h1 class="main-title">Coral</h1>
                                <h2 class="main-subtitle">€ 39.90</h2>
                            </div>
                            <div class="main-content">
                                <div class="main-content__title">We will have lost 60% of our coral reefs by 2030.
                                </div>
                                <div class="main-content__subtitle">Coral reefs are essential to humans, as they protect the shorelines and are a source of
                                    nutrients and habitat for thousands of marine species.</div>
                                <div class="more-menu">
                                    Shop Now
                                    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" stroke-width="1.7" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round">
                                    <path stroke="none" d="M0 0h24v24H0z" fill="none"></path>
                                    <line x1="-5" y1="12" x2="19" y2="12"></line>
                                    <line x1="15" y1="16" x2="19" y2="12"></line>
                                    <line x1="15" y1="8" x2="19" y2="12"></line>
                                    </svg>
                                </div>
                            </div>
                        </div>
                        <div class="center">
                            <div class="right-side__img">
                                <img class="bottle-bg" src="index_archivos/photo-1546500840-ae38253aba9b.avif" alt="">
                                <img class="bottle-img" src="index_archivos/Coral_OK.webp">
                            </div>
                        </div>
                    </div>






                    <div class="main swiper-slide swiper-slide-next" id="savanna" data-swiper-slide-index="1" style="width: 1023px; transition-duration: 0ms; opacity: 0; transform: translate3d(-2046px, 0px, 0px);" role="group" aria-label="2 / 4">
                        <div class="left-side">
                            <div class="main-wrapper">
                                <h3 class="main-header">Empleado</h3>
                                <h1 class="main-title">INTERFAZ DE EMPLEADO</h1>
                                <h2 class="main-subtitle"></h2>
                            </div>
                            <div class="main-content">
                                <div class="main-content__title">
                                </div>
                                <div class="main-content__subtitle"></div>
                                <div class="more-menu">
                                </div>
                            </div>
                        </div>
                        <div class="center">
                            <div class="right-side__img">

                                
                                <form action="SvAltaEmpleado" method="POST">

                                    <p><label>Nombre: </label><input type="text" name="nombre"></p>
                                    <p><label>Apellido: </label><input type="text" name="apellido"></p>
                                    <p><label>Direccion: </label><input type="text" name="direccion"></p>
                                    <p><label>DNI: </label><input type="text" name="dni"></p>
                                    <label for="start">Fecha de Nacimiento:</label>
                                    <input type="date" id="start" name="fecha_nac"
                                           value="07-22-2018"
                                           min="1900-01-01" max="2020-12-31">
                                    <p><label>Nacionalidad: </label><input type="text" name="nacionalidad"></p>
                                    <p><label>Celular: </label><input type="text" name="celular"></p>
                                    <p><label>Email: </label><input type="text" name="email"></p>
                                    <p><label>Cargo: </label><input type="text" name="cargo"></p>
                                    <p><label>Sueldo: </label><input type="text" name="sueldo"></p>
                                    <p><label>Nombre del usuario: </label><input type="text" name="nombreUsu"></p>
                                    <p><label>Contraseña: </label><input type="password" name="contrasenia"></p>

                                    <BUTTON type="submit">Enviar</BUTTON>
                                </form>
                            </div>
                        </div>
                    </div>





                    <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>

                <script src="js/swiper-bundle.js"></script><script src="js/script.js"></script>



                </body></html>
