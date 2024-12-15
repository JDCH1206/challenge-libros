# LiterAlura - Challenge

## Introducción

Este proyecto ha sido desarrollado bajo la guía de la plataforma **Alura Latam** en colaboración con **Oracle**, como parte de la convocatoria **Oracle Next Education G7**. El objetivo principal es crear un sistema que permita gestionar información de libros en tiempo real utilizando la API **Gutendex**.

Para más información sobre la API, consulta el siguiente enlace: [Gutendex API](https://gutendex.com/books/?search=%20).

---

## Pasos del desarrollo

A continuación, se describen las etapas llevadas a cabo para el desarrollo del proyecto:

1. **Diseño conceptual**  
   - Definición de los objetivos del proyecto y alcance de sus funcionalidades.

2. **Arquitectura basada en Programación Orientada a Objetos (POO)**  
   - Diseño de clases, interfaces y métodos para estructurar el código de manera modular y reutilizable.

3. **Implementación con Spring Boot**  
   - Configuración inicial del proyecto con las siguientes dependencias clave:
     - **Jackson**: Para la serialización y deserialización de datos JSON.
     - **JPA (Java Persistence API)**: Para el mapeo y manejo de datos persistentes en la base de datos.
     - **PostgreSQL**: Para la conexión y manejo de datos persistentes.

4. **Exploración de la API Gutendex**  
   - Análisis de los endpoints disponibles y los datos ofrecidos por la API para integrarlos en el proyecto.

5. **Pruebas preliminares**  
   - Validación del funcionamiento de la API utilizando [Postman](https://www.postman.com/).

6. **Selección de herramientas y bibliotecas**  
   - Elección de dependencias clave como `HttpClient` para la comunicación con la API y `Jackson` para el manejo de datos JSON.

7. **Desarrollo e implementación**  
   - Configuración del entorno de desarrollo en IntelliJ IDEA.
   - Creación de solicitudes HTTP para interactuar con la API y obtener datos relevantes.
   - Integración con una base de datos para almacenar y gestionar los datos obtenidos.

---

## Estructura del proyecto

El proyecto está organizado en los siguientes paquetes para una mejor modularidad:

### Paquetes

- **[model](https://github.com/JDCH1206/challenge-libros/tree/master/src/main/java/com/alurachallenge/jdch/model)**: Contiene las clases que representan la estructura de los datos, como `Libro` y `Autor`.
- **[principal](https://github.com/JDCH1206/challenge-libros/tree/master/src/main/java/com/alurachallenge/jdch/principal)**: Contiene la lógica principal del sistema, incluyendo el flujo de interacción del usuario.
- **[repository](https://github.com/JDCH1206/challenge-libros/tree/master/src/main/java/com/alurachallenge/jdch/repository)**: Maneja la persistencia de datos con JPA y las consultas personalizadas.
- **[service](https://github.com/JDCH1206/challenge-libros/tree/master/src/main/java/com/alurachallenge/jdch/service)**: Contiene los servicios que gestionan la comunicación con la API y la conversión de datos.
- **[utils](https://github.com/JDCH1206/challenge-libros/tree/master/src/main/java/com/alurachallenge/jdch/utils)**: Incluye utilidades para el manejo de datos, entrada del usuario y operaciones auxiliares.
- **[view](https://github.com/JDCH1206/challenge-libros/tree/master/src/main/java/com/alurachallenge/jdch/view)**: Maneja la comunicación visual entre la aplicación y el usuario.

---
### Interfaces

Se generaron varias interfaces para definir las operaciones necesarias en cada módulo, siguiendo los principios de POO:

- **[AutorRepository](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/java/com/alurachallenge/jdch/repository/AutorRepository.java)**: Define métodos para realizar solicitudes a la API.
- **[LibroRepository](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/java/com/alurachallenge/jdch/repository/LibroRepository.java)**: Interfaz para la comunicación de la app hacia el usuario.
- **[IComunicacionAppUsuario](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/java/com/alurachallenge/jdch/view/IComunicacionAppUsuario.java)**: Interfaz para la comunicación de la app hacia el usuario.
- **[IIngresarDatos](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/java/com/alurachallenge/jdch/utils/IIngresarDatos.java)**: Interfaz para la comunicación del usuario hacia la app.
- **[IConvertirDatos](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/java/com/alurachallenge/jdch/service/IConvertirDatos.java)**: convierte los datos suministrados por la api a clases.
---
### Clases

Cada clase se diseñó para implementar una interfaz o manejar una funcionalidad específica:

- **[ConsumoAPI](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/java/com/alurachallenge/jdch/service/ConsumoAPI.java)**: maneja las solicitudes a la API.
- **[ComunicacionAppAUsuario](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/java/com/alurachallenge/jdch/view/ComunicacionAppUsuario.java)**: Implementa `IComunicacionAppUsuario` y maneja los mensajes y la comunicación hacia el usuario.
- **[IngresarDatos](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/java/com/alurachallenge/jdch/utils/IngresarDatos.java)**: Implementa `IIngresarDatos` y Controla las interacciones de entrada del usuario hacia la app.
- **[Principal](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/principal/Principal.java)**: Clase principal que inicia el flujo de la aplicación.
- **[Autor](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/java/com/alurachallenge/jdch/model/Autor.java)**: Clase que representa a un autor en el sistema, incluyendo atributos como nombre, fecha de nacimiento, fecha de fallecimiento y edad, además de su relación con los libros.
- **[Libro](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/java/com/alurachallenge/jdch/model/Libro.java)**: Clase que representa un libro en el sistema, incluyendo atributos como título, idioma, número de descargas, y su relación con los autores.
- **[ConvertirDatos](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/java/com/alurachallenge/jdch/service/ConvertirDatos.java)**: Clase que implementa la interfaz `IConvertirDatos` para manejar la conversión de datos JSON a objetos de tipo Java. Utiliza la biblioteca `Jackson` y su clase `ObjectMapper` para deserializar cadenas JSON en objetos del tipo especificado, facilitando la integración con datos provenientes de APIs.
- **[JdchlibrosApplication](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/java/com/alurachallenge/jdch/JdchlibrosApplication.java)**: Clase principal del proyecto que actúa como el punto de entrada de la aplicación **Spring Boot**. Implementa `CommandLineRunner` para ejecutar la lógica de la aplicación al iniciar. Se encarga de instanciar la clase `Principal`, la cual gestiona el menú principal de la aplicación y las interacciones del usuario. Además, inyecta repositorios `LibroRepository` y `AutorRepository` necesarios para la persistencia de datos en la base de datos.

---

### Record `Monedas`

Este record se diseñó para obtener los datos de la API y darle una estructura de objeto en Java. Esto facilita el manejo de los datos obtenidos de la API, permitiendo acceder a ellos de manera organizada y orientada a objetos.

- **[Monedas](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/modulos/Monedas.java)**: Este record define la estructura de los datos de tipo `Monedas`, que representan las tasas de cambio obtenidas de la API. Incluye atributos para cada moneda y sus tasas de conversión, permitiendo una fácil integración y manipulación dentro de la aplicación.

## Modo de Uso
---
## Notas finales

Este proyecto combina herramientas modernas y conceptos fundamentales de programación para cumplir con los requisitos establecidos en la convocatoria **Oracle Next Education**. La integración de tecnologías como **Spring Boot**, **JPA** y **PostgreSQL** asegura un desarrollo robusto y escalable.
