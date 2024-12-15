package com.alurachallenge.jdch.view;

public class ComunicacionAppUsuario implements IComunicacionAppUsuario{

    private String saludo = """
            ****************************************************************************
            
            ¡Hola, estimado usuario! Bienvenido a nuestra aplicación
            de datos de libros con actualización de numero de descargas 
            en tiempo real. Este aplicativo utiliza datos actualizados de 
            fuentes confiables a través de una API para proporcionarte 
            los datos más recientes.
            Estamos aquí para ayudarte con tus busqueda de libros y autores
            de manera rápida y eficiente.
            ¡Es un placer atender tu solicitud!
            
            *****************************************************************************
            """;
    private String menuPrincipal = """
            *****************************************************************************
            
            Indica el número de la operación que desea realizar
            1)  Buscar libro por titulo 
            2)  Buscar en la base de datos libro por idioma 
            3)  Buscar libros por Autor en la base de datos
            4)  Buscar libros por rango de número de descargas en la base de datos
            5)  Buscar Autor por rango de fecha de nacimiento en la base de datos
            6)  Buscar Autor por rango de fecha de fallecimiento en la base de datos
            7)  Buscar Autor por edad
            8)  Buscar Autor por rango de edad en la base de datos        
            9)  Mostrar la totalidad de libros existentes en la base de datos
            10) Estadisticas Autores 
            11) Estadisticas Libros    
            0) salir
            
            *****************************************************************************
            """;
    private String mensajeSalida = """
            Gracias por utilizar nuestro aplicativo te esperamos pronto 
            """;
    private String solicitarNombreLibro = """
            ********************************************************
            Por favor indique el nombre del libro que dsea buscar
            ********************************************************
            """;


    @Override
    public void saludo() {
        System.out.println(saludo);
    }

    @Override
    public void menuPrincipal() {
        System.out.println(menuPrincipal);
    }

    @Override
    public void despedida() {
        System.out.println(mensajeSalida);
    }

    @Override
    public void solicitarNombreLibro() {
        System.out.println(solicitarNombreLibro);
    }
}
