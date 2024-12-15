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

## Notas finales

Este proyecto combina herramientas modernas y conceptos fundamentales de programación para cumplir con los requisitos establecidos en la convocatoria **Oracle Next Education**. La integración de tecnologías como **Spring Boot**, **JPA** y **PostgreSQL** asegura un desarrollo robusto y escalable.
