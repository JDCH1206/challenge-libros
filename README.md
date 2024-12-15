# LiterAlura - Challenge

## Introducción

Este proyecto ha sido desarrollado bajo la guía de la plataforma **Alura Latam** en colaboración con **Oracle**, dentro de la convocatoria **Oracle Next Education G7**. El objetivo principal es crear un conversor de moneda en tiempo real utilizando la API **Gutendex**, que ofrece datos de libros. 

Para más información sobre la API, consulta el siguiente enlace: [Gutendex API](https://gutendex.com/books/?search=%20).

---

## Pasos del desarrollo

A continuación, se describen las etapas llevadas a cabo para el desarrollo del proyecto:

1. **Diseño conceptual**  
   - Definición de los objetivos del proyecto y alcance de las funcionalidades.

2. **Arquitectura basada en Programación Orientada a Objetos (POO)**  
   - Diseño de clases, interfaces y métodos para estructurar el código de forma modular.

3. **Implementación con Spring Boot**  
   - Configuración inicial del proyecto con las dependencias necesarias, incluyendo:
     - **Jackson**: Para la serialización y deserialización de datos JSON.
     - **JPA (Java Persistence API)**: Para el mapeo y manejo de datos persistentes en la base de datos.
     - **PostgreSQL**: Conexión con la base de datos mediante la configuración de las dependencias necesarias.

4. **Exploración de la API Gutendex**  
   - Análisis de los endpoints disponibles y los datos ofrecidos por la API.

5. **Pruebas preliminares**  
   - Validación del funcionamiento de la API utilizando [Postman](https://www.postman.com/).

6. **Selección de herramientas y bibliotecas**  
   - Elección de las dependencias necesarias para el desarrollo, como `HttpClient` para la comunicación con la API y `Jackson` para el manejo de datos JSON.

7. **Desarrollo e implementación**  
   - Configuración del entorno de desarrollo en IntelliJ IDEA.
   - Implementación de solicitudes HTTP para interactuar con la API y obtener datos relevantes.
   - Integración de funcionalidades con la base de datos para persistir la información obtenida.

---

## Estructura del proyecto

Para una mejor organización, el proyecto se estructura en los siguientes paquetes:

### Paquetes

- **[model](https://github.com/JDCH1206/challenge-libros/tree/master/src/main/java/com/alurachallenge/jdch/model)**: Contiene las clases y lógica para realizar las conversiones de monedas.
- **[principal](https://github.com/JDCH1206/challenge-libros/tree/master/src/main/java/com/alurachallenge/jdch/principal)**: Contiene las clases y lógica para realizar las conversiones de monedas.
- **[repository](https://github.com/JDCH1206/challenge-libros/tree/master/src/main/java/com/alurachallenge/jdch/repository)**: Contiene las clases y lógica para realizar las conversiones de monedas.
- **[service](https://github.com/JDCH1206/challenge-libros/tree/master/src/main/java/com/alurachallenge/jdch/service)**: Contiene las clases y lógica para realizar las conversiones de monedas.
- **[utils](https://github.com/JDCH1206/challenge-libros/tree/master/src/main/java/com/alurachallenge/jdch/utils)**: Contiene las clases y lógica para realizar las conversiones de monedas.
- **[view](https://github.com/JDCH1206/challenge-libros/tree/master/src/main/java/com/alurachallenge/jdch/view)**: Contiene las clases y lógica para realizar las conversiones de monedas.
---
### Interfaces

Se generaron varias interfaces para definir las operaciones necesarias en cada módulo, siguiendo los principios de POO:

- **[IBuscarEnApi](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/modulos/IBuscarEnApi.java)**: Define métodos para realizar solicitudes a la API.
- **[IComunicacionAppUsuario](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/modulos/IComunicacionAppUsuario.java)**: Interfaz para la comunicación de la app hacia el usuario.
- **[IComunicacionUsuarioApp](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/modulos/IComunicacionUsuarioApp.java)**: Interfaz para la comunicación del usuario hacia la app.
- **[ICrearArchivo](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/modulos/ICrearArchivo.java)**: Define métodos para la creación y escritura de archivos.
- **[ICalculosConversion](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/calculos/ICalculosConversion.java)**: Define las operaciones necesarias para realizar conversiones.

### Clases

Cada clase se diseñó para implementar una interfaz o manejar una funcionalidad específica:

- **[SolicitarDatosApi](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/modulos/SolicitarDatosApi.java)**: Implementa `IBuscarEnApi` y maneja las solicitudes a la API.
- **[ComunicacionAppAUsuario](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/modulos/ComunicacionAppAUsuario.java)**: Implementa `IComunicacionAppUsuario` y maneja los mensajes y la comunicación hacia el usuario.
- **[ComunicacionUsuarioAApp](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/modulos/ComunicacionUsuarioAApp.java)**: Implementa `IComunicacionUsuarioApp` y Controla las interacciones de entrada del usuario hacia la app.
- **[CrearEscribirArchivo](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/modulos/CrearEscribirArchivo.java)**: Implementa `ICrearArchivo` y maneja la creación y escritura de archivos de registro.
- **[Calculo](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/calculos/Calculo.java)**: Implementa `ICalculosConversion` y contiene la lógica de cálculo para la conversión de moneda.
- **[Principal](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/principal/Principal.java)**: Clase principal que inicia el flujo de la aplicación.
- **[PrincipalOptimizada](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/principal/PrincipalOptimizada.java)**: Variante de la clase principal, optimizada para pruebas adicionales o funcionalidad ampliada.

### Record `Monedas`

Este record se diseñó para obtener los datos de la API y darle una estructura de objeto en Java. Esto facilita el manejo de los datos obtenidos de la API, permitiendo acceder a ellos de manera organizada y orientada a objetos.

- **[Monedas](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/modulos/Monedas.java)**: Este record define la estructura de los datos de tipo `Monedas`, que representan las tasas de cambio obtenidas de la API. Incluye atributos para cada moneda y sus tasas de conversión, permitiendo una fácil integración y manipulación dentro de la aplicación.

## Modo de Uso
---
## Notas finales

Este proyecto combina herramientas modernas y conceptos fundamentales de programación para cumplir con los requisitos establecidos en la convocatoria **Oracle Next Education**. La integración de tecnologías como **Spring Boot**, **JPA** y **PostgreSQL** asegura un desarrollo robusto y escalable.
