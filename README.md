# Sistema de Gestión de Objetos 
| React | SpringBoot | MySQL |

## Aplicación de Gestión de Objetos con React JS, Spring Boot y MySQL

![Final App FullStack](https://github.com/Julian1699/Base-React-SpringBoot/assets/114323630/13991635-d262-4461-b7cc-36ddab60bcc0)

¡Bienvenido al repositorio del proyecto de la Aplicación de Gestión de Objetos! En esta versión, hemos empleado MySQL para una mayor escalabilidad y rendimiento. La aplicación utiliza tecnologías modernas como React y Spring Boot.

## Descripción

El objetivo central de esta aplicación es proporcionar una plataforma eficiente y centralizada para la gestión de objetos abstractos. Hemos combinado React JS en el frontend y Spring Boot en el backend para ofrecer una experiencia de usuario dinámica y una base sólida.

## Características Clave

### Frontend React JS
Hemos utilizado React JS para construir una interfaz de usuario altamente interactiva y dinámica. Los componentes de React están organizados jerárquicamente, brindando una experiencia fluida y receptiva a los usuarios.

### Gestión de Estilos con Bootstrap
La apariencia profesional y amigable para el usuario se logra mediante el uso de Bootstrap, que permite aplicar estilos y diseño de manera coherente.

### Comunicación Asincrónica
La biblioteca Axios gestiona las peticiones HTTP asincrónicas entre el frontend y el backend, lo que garantiza respuestas eficientes y en tiempo real.

### Backend Spring Boot con Java
Hemos implementado Spring Boot en el backend para crear un sistema robusto y seguro. Esto nos permite manejar rutas, autenticación, autorización y la lógica empresarial en general.

### Controladores REST
Hemos utilizado controladores REST de Spring para definir y gestionar las diversas rutas y acciones disponibles en la aplicación.

### Persistencia con JPA y Hibernate
La capa de persistencia y gestión de datos se realiza a través de JPA y Hibernate. En esta versión hemos utilizado MySQL, lo que mejora la escalabilidad y el rendimiento.

## Tecnologías Empleadas

### Frontend
- **React**: Biblioteca de JavaScript para construir interfaces de usuario.
- **Bootstrap**: Framework CSS para el diseño responsivo.
- **Font Awesome**: Biblioteca de iconos vectoriales.
- **Axios**: Cliente HTTP para realizar solicitudes a la API.

### Backend
- **Spring Boot**: Framework para construir aplicaciones Java.
- **Spring Data JPA**: Para interactuar con la base de datos.
- **Swagger**: Documentación interactiva de la API.
- **MySQL**: Sistema de gestión de bases de datos relacional.

## Instalación y Ejecución

### Prerrequisitos
- Node.js y npm instalados en su máquina.
- Java JDK 17 instalado en su máquina.
- MySQL instalado y configurado.

### Pasos
1. Clonar el repositorio:
    ```bash
    git clone https://github.com/Julian1699/Base-React-SpringBoot.git
    ```

2. Instalar dependencias del frontend:
    ```bash
    cd frontend-react
    ```

    ```bash
    npm install
    ```

3. Ejecutar el frontend:

    ```bash
    npm start
    ```

4. Configurar Conexión a tu Base de Datos

Es importante configurar el archivo `application.properties` con las credenciales de conexión a tu base de datos local. Este proyecto está diseñado para aceptar conexiones a bases de datos MySQL, PostgreSQL y OracleSQL. En este caso, se proporcionan las credenciales de conexión para MySQL.

![image](https://github.com/Julian1699/Base-React-SpringBoot/assets/114323630/7eb29dfa-653c-4f3f-9246-fe1afa1abe26)

5. Instalar dependencias del backend y ejecutarlo:
    ```bash
    cd ../backend-springboot
    ```
    
    ```bash
    ./mvnw install
    ```
    
    ```bash
    ./mvnw spring-boot:run
    ```
6. Acceder a la aplicación:
   - Frontend: `http://localhost:4200`
   - Backend: `http://localhost:8080`
