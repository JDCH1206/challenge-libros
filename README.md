
<h1 align="center"> LiterAlura - Challenge </h1>


<p align="center">
  <a href=""><img src="https://img.shields.io/twitter/follow/docusaurus.svg?style=social" align="right" alt="Twitter Follow" /></a>
  <a href="https://github.com/JDCH1206" alt="sponsors on Open Collective"><img src="https://github.com/JDCH1206" /></a>
  <a href="https://www.npmjs.com/package/@docusaurus/core"><img src="https://img.shields.io/npm/v/@docusaurus/core.svg?style=flat" alt="npm version"></a>
  <a href="https://github.com/facebook/docusaurus/actions/workflows/tests.yml"><img src="https://github.com/facebook/docusaurus/actions/workflows/tests.yml/badge.svg" alt="GitHub Actions status"></a>
  <a href="CONTRIBUTING.md#pull-requests"><img src="https://img.shields.io/badge/PRs-welcome-brightgreen.svg" alt="PRs Welcome"></a>
  <a href="https://discord.gg/docusaurus"><img src="https://img.shields.io/discord/102860784329052160.svg" align="right" alt="Discord Chat" /></a>
  <a href= "https://github.com/prettier/prettier"><img alt="code style: prettier" src="https://img.shields.io/badge/code_style-prettier-ff69b4.svg"></a>
  <a href="#license"><img src="https://img.shields.io/github/license/sourcerer-io/hall-of-fame.svg?colorB=ff0000"></a>
  <a href="https://github.com/facebook/jest"><img src="https://img.shields.io/badge/tested_with-jest-99424f.svg" alt="Tested with Jest"></a>
  <a href="https://argos-ci.com" target="_blank" rel="noreferrer noopener" aria-label="Covered by Argos"><img src="https://argos-ci.com/badge.svg" alt="Covered by Argos" width="133" height="20" /></a>
  <a href="https://gitpod.io/#https://github.com/facebook/docusaurus"><img src="https://img.shields.io/badge/Gitpod-Ready--to--Code-blue?logo=gitpod" alt="Gitpod Ready-to-Code"/></a>
  <a href="https://app.netlify.com/sites/docusaurus-2/deploys"><img src="https://api.netlify.com/api/v1/badges/9e1ff559-4405-4ebe-8718-5e21c0774bc8/deploy-status" alt="Netlify Status"></a>
  <a href="https://vercel.com/new/clone?repository-url=https%3A%2F%2Fgithub.com%2Ffacebook%2Fdocusaurus%2Ftree%2Fmain%2Fexamples%2Fclassic&project-name=my-docusaurus-site&repo-name=my-docusaurus-site"><img src="https://vercel.com/button" alt="Deploy with Vercel"/></a>
  <a href="https://app.netlify.com/start/deploy?repository=https://github.com/slorber/docusaurus-starter"><img src="https://www.netlify.com/img/deploy/button.svg" alt="Deploy to Netlify"></a>
</p>

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

### Record 

Un record en Java se diseñó específicamente para encapsular datos de manera eficiente, eliminando la necesidad de escribir métodos comunes como constructores, toString(), equals(), y hashCode(). En este proyecto, los records se utilizan para mapear directamente los datos obtenidos de la API y transformarlos en estructuras de objetos Java. Esto simplifica la manipulación y el acceso a los datos, permitiendo:

Lectura clara y organizada: Los datos son accesibles mediante nombres descriptivos que coinciden con los atributos en el JSON.
Reducción de código repetitivo: Gracias al uso de records, se evita la necesidad de escribir manualmente métodos comunes y constructores.
Facilidad de integración: Los records, en combinación con herramientas como Jackson, permiten una integración directa con la API al mapear automáticamente los datos JSON en objetos Java.
Estos records son esenciales para estructurar de manera robusta los datos provenientes de la API Gutendex, asegurando que puedan ser procesados eficientemente en el sistema.

- **[DatosLibros](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/java/com/alurachallenge/jdch/model/DatosLibros.java)**: Este record define la estructura para representar los datos obtenidos de la API **Gutendex** relacionados con una lista de libros. Utiliza las anotaciones de `Jackson` (`@JsonAlias` y `@JsonIgnoreProperties`) para mapear automáticamente los datos JSON en un objeto de tipo Java. El atributo principal, `libros`, es una lista de objetos `DatosLibro` que contiene la información detallada de cada libro, permitiendo una integración eficiente con la API.
- **[DatosLibro](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/java/com/alurachallenge/jdch/model/DatosLibro.java)**: Este record representa la estructura de un libro obtenido desde la API **Gutendex**. Utiliza las anotaciones de `Jackson` (`@JsonAlias` y `@JsonIgnoreProperties`) para mapear automáticamente los datos JSON a objetos Java. Los atributos incluyen:
  - `titulo`: El título del libro.
  - `autor`: Una lista de objetos `DatosAutor`, que representan la información de los autores del libro.
  - `lenguaje`: Una lista de cadenas que especifican los idiomas disponibles del libro.
  - `numeroDescargas`: El número total de descargas del libro.
  
Este record simplifica la integración y manipulación de datos de libros obtenidos de la API.

- **[DatosAutor](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/java/com/alurachallenge/jdch/model/DatosAutor.java)**: Este record representa la estructura de un autor obtenido desde la API **Gutendex**. Utiliza las anotaciones de `Jackson` (`@JsonAlias`) para mapear automáticamente los datos JSON a objetos Java. Los atributos incluyen:

  - **`nombre`**: El nombre del autor, representado como una cadena de texto.
  - **`fechaNacimiento`**: El año de nacimiento del autor, representado como un número entero.
  - **`fechaMuerte`**: El año de fallecimiento del autor, también representado como un número entero. Este atributo puede ser `null` si el autor sigue vivo.

Este record simplifica la integración y manipulación de datos de autores obtenidos de la API.

### Descripción

- **Uso de `@JsonAlias`**: Permite mapear los nombres de los campos del JSON (como `"name"`, `"birth_year"`, `"death_year"`) a los atributos definidos en el record.
- **Atributos clave**:
  - **`nombre`**: Mapea el campo `"name"` del JSON, que contiene el nombre del autor.
  - **`fechaNacimiento`**: Mapea el campo `"birth_year"` del JSON, que especifica el año de nacimiento del autor.
  - **`fechaMuerte`**: Mapea el campo `"death_year"` del JSON, que especifica el año de fallecimiento del autor o es `null` si no aplica.

---
## Modo de Uso

El aplicativo presenta las siguientes opciones para interactuar con la base de datos y la API **Gutendex**:

### Menú de Opciones

1. **Buscar libro por título**  
   Permite buscar un libro específico en la API **Gutendex** por título y agregarlo a la base de datos, si no existe.

2. **Buscar libro por idioma en la base de datos**  
   Filtra y muestra los libros almacenados en la base de datos por el idioma seleccionado.

3. **Buscar libros por autor en la base de datos**  
   Busca y muestra todos los libros en la base de datos que estén relacionados con un autor específico.

4. **Buscar libros por rango de número de descargas en la base de datos**  
   Permite filtrar libros por un rango definido de descargas.

5. **Buscar autor por rango de fecha de nacimiento en la base de datos**  
   Muestra los autores nacidos dentro de un rango de fechas específico.

6. **Buscar autor por rango de fecha de fallecimiento en la base de datos**  
   Busca autores que hayan fallecido dentro de un rango de fechas específico.

7. **Buscar autor por edad**  
   Filtra autores que tengan una edad exacta especificada.

8. **Buscar autor por rango de edad en la base de datos**  
   Busca y muestra autores cuyas edades estén dentro de un rango definido.

9. **Mostrar todos los libros existentes en la base de datos**  
   Lista todos los libros almacenados en la base de datos.

10. **Estadísticas de autores**  
    Genera y muestra estadísticas relevantes sobre los autores almacenados en la base de datos.

11. **Estadísticas de libros**  
    Genera y muestra estadísticas relevantes sobre los libros almacenados en la base de datos.

0. **Salir**  
   Finaliza la ejecución del programa.

---

### Instrucciones de Uso

1. **Seleccionar una opción del menú**  
   El usuario selecciona una de las opciones del menú principal para interactuar con la base de datos o la API.

2. **Proporcionar información requerida**  
   Según la opción seleccionada, el sistema puede solicitar datos adicionales como un rango de fechas, un autor o un título de libro.

3. **Revisar los resultados**  
   El sistema mostrará los resultados en pantalla basados en la consulta realizada. Si no hay datos coincidentes, se mostrará un mensaje indicando que no se encontraron resultados.

4. **Decidir continuar o salir**  
   - Si el usuario desea realizar otra operación, puede seleccionar una nueva opción del menú principal.
   - Si el usuario desea salir, selecciona la opción `0`, y el programa muestra un mensaje de despedida antes de cerrar.

---

### Notas adicionales

- **Persistencia de datos**  
   Toda la información se almacena en una base de datos **PostgreSQL**, y las consultas se realizan utilizando **Spring JPA** para garantizar eficiencia y escalabilidad.

- **Uso de la API**  
   Al buscar libros por título, el sistema realiza solicitudes a la API **Gutendex** para obtener datos actualizados.

Este flujo asegura una experiencia de usuario intuitiva y una integración fluida con la base de datos y la API.
---
## Pruebas

El funcionamiento del sistema fue verificado mediante diversas pruebas. A continuación, se describe el proceso y resultados para cada una de las opciones del menú principal:

1. **Inicio del Programa y Saludo Inicial**  
   Se muestra un mensaje de bienvenida inicial al usuario.  
   ![Imagen de entrada](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/resources/testimages/SaludoInicial.png)

2. **Menú Principal**  
   Se despliega el menú principal con todas las opciones disponibles.  
   ![Menú Inicial](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/resources/testimages/MenuPrincipal.png)

3. **Opción 1 - Buscar libro por título**  
   El usuario puede buscar libros por su título.  
   ![Opción 1](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/resources/testimages/ResultadoOpcion1.png)

4. **Opción 2 - Buscar libros por idioma**  
   Muestra una lista de libros en función del idioma seleccionado.  
   ![Opción 2](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/resources/testimages/ResultadoOpcion2.png)

5. **Opción 3 - Buscar libros por autor**  
   Permite buscar libros en la base de datos por el nombre del autor.  
   ![Opción 3](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/resources/testimages/ResultadoOpcion3.png)

6. **Opción 4 - Buscar libros por rango de descargas**  
   Se listan libros en función del rango de número de descargas definido.  
   ![Opción 4](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/resources/testimages/ResultadoOpcion4.png)

7. **Opción 5 - Buscar autor por rango de fecha de nacimiento**  
   El usuario ingresa un rango de fechas de nacimiento y se filtran los autores correspondientes.  
   - **Selección de rango**  
     ![Opción 5 Selección](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/resources/testimages/SeleccionOpcion5.png)  
   - **Resultado**  
     ![Opción 5 Resultado](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/resources/testimages/ResultadoOpcion5.png)

8. **Opción 6 - Buscar autor por rango de fecha de fallecimiento**  
   Similar a la opción anterior, pero filtrando autores por rango de fechas de fallecimiento.  
   - **Selección de rango**  
     ![Opción 6 Selección](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/resources/testimages/SeleccionOpcion6.png)  
   - **Resultado**  
     ![Opción 6 Resultado](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/resources/testimages/ResultadoOpcion6.png)

9. **Opción 7 - Buscar autor por edad**  
   Filtra autores que coincidan con la edad especificada por el usuario.  
   - **Selección de edad**  
     ![Opción 7 Selección](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/resources/testimages/SeleccionOpcion7.png)  
   - **Resultado**  
     ![Opción 7 Resultado](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/resources/testimages/ResultadoOpcion7.png)

10. **Opción 8 - Buscar autor por rango de edad**  
    Permite buscar autores dentro de un rango específico de edad.  
    - **Selección de rango de edad**  
      ![Opción 8 Selección](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/resources/testimages/SeleccionOpcion8.png)  
    - **Resultado**  
      ![Opción 8 Resultado](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/resources/testimages/ResultadoOpcion8.png)

11. **Opción 9 - Mostrar todos los libros en la base de datos**  
    Se listan todos los libros almacenados en la base de datos.  
    ![Opción 9](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/resources/testimages/ResultadoOpcion9.png)

12. **Opción 10 - Estadísticas de Autores**  
    Muestra estadísticas relevantes sobre los autores registrados en la base de datos.  
    ![Opción 10](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/resources/testimages/ResultadoOpcion10.png)

13. **Opción 11 - Estadísticas de Libros**  
    Muestra estadísticas relevantes sobre los libros almacenados en la base de datos.  
    ![Opción 11](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/resources/testimages/ResultadoOpcion11.png)

14. **Salida del Aplicativo**  
    Al seleccionar la opción de salida, se muestra un mensaje de despedida y el programa finaliza.  
    ![Salida Aplicativo](https://github.com/JDCH1206/challenge-libros/blob/master/src/main/resources/testimages/SalidaAplicativo.png)

[Ver video prueba](https://github.com/JDCH1206/challenge-libros/issues/2)
---
## Uso e Instalación

1. **Clona el repositorio en tu máquina local**:  
   Ejecuta el siguiente comando en tu terminal:

   ```bash
   git clone https://github.com/JDCH1206/challenge-libros.git
   ```
## **Recomendaciones de Configuración**

### 1. **Creación de la Base de Datos**
Antes de ejecutar el proyecto, crea una base de datos en **PostgreSQL**:

```sql
CREATE DATABASE literatura;
```
## **2. Configuración de Variables de Entorno**
Define las siguientes variables de entorno en tu sistema:

- **En sistemas Unix/Linux**:
   ```bash
   export DB_HOST_PRUEBA=localhost
   export DB_LITERATURA=literatura
   export DB_USER_PRUEBA=tu_usuario
   export DB_PASSWORD=tu_password
   ```
- **En sistemas Windows (PowerShell)**:
   ```bash
   $env:DB_HOST_PRUEBA = "localhost"
   $env:DB_LITERATURA = "literatura"
   $env:DB_USER_PRUEBA = "tu_usuario"
   $env:DB_PASSWORD = "tu_password"
   ```
### 3. Revisión del Archivo application.properties
Si no necesitas ver las consultas SQL de Hibernate, elimina o comenta las siguientes líneas:

#### **properties**
   ```bash
   spring.jpa.show-sql=true       # Muestra las consultas SQL en consola
   spring.jpa.format-sql=true     # Formatea las consultas SQL
   ```
---
## Notas finales

Este proyecto combina herramientas modernas y conceptos fundamentales de programación para cumplir con los requisitos establecidos en la convocatoria **Oracle Next Education**. La integración de tecnologías como **Spring Boot**, **JPA** y **PostgreSQL** asegura un desarrollo robusto y escalable.
