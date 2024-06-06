# Backend del Sistema de Gestión de Objetos 

| Spring Boot | MySQL |

## Aplicación de Gestión de Objetos con Spring Boot y MySQL

¡Bienvenido al repositorio del backend de la Aplicación de Gestión de Objetos! En esta aplicación, utilizamos Spring Boot para el desarrollo del backend, proporcionando una API robusta y segura.

## Descripción

El objetivo central de este backend es proporcionar una API eficiente y centralizada para la gestión de objetos abstractos. Spring Boot se utiliza en el backend para construir un sistema escalable y seguro.

## Características Clave

### Backend Spring Boot

- **Controladores REST**: Utilizamos controladores REST para definir y gestionar las rutas y acciones de la API.
- **Persistencia con JPA y Hibernate**: La gestión de datos se realiza a través de JPA y Hibernate, asegurando una interacción eficiente con la base de datos.
- **Documentación con Swagger**: La API está documentada con Swagger, proporcionando una interfaz interactiva para probar los endpoints.
- **Base de Datos MySQL**: Utilizamos MySQL para la gestión de bases de datos relacional.

## Configurar Conexión a tu Base de Datos

Es importante configurar el archivo `application.properties` con las credenciales de conexión a tu base de datos local. Este proyecto está diseñado para aceptar conexiones a bases de datos MySQL, PostgreSQL y OracleSQL. En este caso, se proporcionan las credenciales de conexión para MySQL.

![image](https://github.com/Julian1699/Base-Angular-SpringBoot/assets/114323630/aa8773ae-80c0-4e39-ae1b-fd37bd532362)

## Funcionalidades CRUD

Dirigirse a la ruta especifica del backend y ejecutarlo:

```bash
    
    cd ../backend-springboot
    
```

Accer a la siguiente ruta una vez se haya puesto a correr la aplicación: 

- http://localhost:8080/swagger-ui/index.html


### Crear Objeto

Permite a los usuarios agregar nuevos objetos a la base de datos mediante una solicitud HTTP POST.

### Leer Objetos

Permite a los usuarios ver una lista de todos los objetos almacenados. Los datos se obtienen mediante una solicitud HTTP GET.

### Leer Objeto por ID

Permite a los usuarios obtener un objeto específico por su ID mediante una solicitud HTTP GET.

### Actualizar Objeto

Permite a los usuarios editar los detalles de un objeto existente. Los datos modificados se envían mediante una solicitud HTTP PUT.

### Eliminar Objeto

Permite a los usuarios eliminar un objeto de la base de datos mediante una solicitud HTTP DELETE.

### Buscar Objetos por Filtros

Permite a los usuarios buscar objetos en la base de datos utilizando varios filtros (nombre, descripción, precio, fecha de creación). La búsqueda se realiza mediante una solicitud HTTP GET con parámetros de consulta.

### Tecnologías Empleadas

### Backend

- Spring Boot: Framework para construir aplicaciones Java.

- Spring Data JPA: Para interactuar con la base de datos.

- Swagger: Documentación interactiva de la API.

- MySQL: Sistema de gestión de bases de datos relacional.
