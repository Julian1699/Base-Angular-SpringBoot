# Frontend del Sistema de Gestión de Objetos 

| Angular|

## Aplicación de Gestión de Objetos con Angular.

¡Bienvenido al repositorio del frontend de la Aplicación de Gestión de Objetos! En esta aplicación, utilizamos Angularpara el desarrollo del frontend, proporcionando una experiencia de usuario dinámica y amigable.

## Descripción

El objetivo central de este frontend es proporcionar una interfaz de usuario eficiente y centralizada para la gestión de objetos abstractos. Angular se utiliza en el frontend para construir una interfaz interactiva y receptiva.

## Características Clave

### Frontend Angular
- **Componentes Dinámicos**: Utilizamos componentes de Angularpara crear una interfaz de usuario dinámica y modular.
- **Bootstrap para Estilos**: Se emplea Bootstrap para asegurar un diseño consistente y responsivo.
- **Iconos con Font Awesome**: Implementación de iconos vectoriales mediante Font Awesome.
- **Comunicación Asincrónica**: HttpClient se utiliza para manejar las solicitudes HTTP asincrónicas hacia el backend.

## Funcionalidades CRUD

### Crear 
Permite a los usuarios agregar nuevos objetos a la base de datos mediante un formulario. Los datos se envían al backend utilizando una solicitud HTTP POST.

## Leer 
Permite a los usuarios ver una lista de todos los objetos almacenados. Los datos se obtienen del backend mediante una solicitud HTTP GET.

## Actualizar
Permite a los usuarios editar los detalles de un objeto existente. Los datos modificados se envían al backend utilizando una solicitud HTTP PUT.

## Eliminar
Permite a los usuarios eliminar un objeto de la base de datos. La eliminación se realiza mediante una solicitud HTTP DELETE.

## Buscar Objetos

Permite a los usuarios buscar objetos en la base de datos utilizando varios filtros (nombre, descripción, precio, fecha de creación). La búsqueda se realiza mediante una solicitud HTTP GET con parámetros de consulta.


## Tecnologías Empleadas

### Frontend
- **Angular**: Biblioteca de JavaScript para construir interfaces de usuario.
- **Bootstrap**: Framework CSS para el diseño responsivo.
- **Font Awesome**: Biblioteca de iconos vectoriales.
- **HttpClient**: Cliente HTTP para realizar solicitudes a la API.

## Instalación y Ejecución

### Prerrequisitos
- Node.js y npm instalados en su máquina.

### Pasos
1. Clonar el repositorio:
    ```bash
    git clone https://github.com/Julian1699/Base-Angular-SpringBoot.git
    ```

2. Instalar las dependencias:
    ```bash
    cd frontend-angular
    
    npm install
    ```

3. Ejecutar la aplicación:
    ```bash
    npm start
    ```

4. Acceder a la aplicación en [http://localhost:4200].


## Componentes Principales

### navbar
Este componente define la barra de navegación de la aplicación, utilizando `@angular/router` para la navegación entre diferentes rutas. Incluye enlaces a las diferentes secciones de la aplicación como Inicio, Agregar Objeto, Listar Objetos, Información y Tecnologías.

### agregar-objeto
Este componente permite agregar un nuevo objeto mediante un formulario. Utiliza `HttpClient` para enviar la solicitud POST al backend. El formulario recoge información sobre el nombre, descripción y precio del objeto.

### editar-objeto
Este componente permite editar un objeto existente. Utiliza `HttpClient` para enviar la solicitud PUT al backend. El formulario prellena los campos con los datos existentes del objeto y permite modificar el nombre, descripción y precio.

### objeto-lista
Este componente muestra una lista de todos los objetos y permite buscar, editar y eliminar objetos mediante interacciones con el backend. Utiliza `HttpClient` para obtener los datos desde el backend y también permite filtrar los objetos según diferentes criterios como nombre, descripción, precio y fecha de creación.

### bienvenida
Este componente muestra una página de bienvenida con información básica sobre la aplicación y enlaces a otras secciones importantes. Está diseñado para proporcionar una visión general del propósito y las funcionalidades de la aplicación.

### informacion
Este componente proporciona detalles adicionales sobre la aplicación, explicando su propósito, características y cómo utilizarla. Es útil para nuevos usuarios que desean aprender más sobre el sistema y sus capacidades.

### tecnologias
Este componente enumera y describe las tecnologías utilizadas en el desarrollo de la aplicación. Incluye descripciones de las tecnologías frontend y backend empleadas, como Angular, Bootstrap, Font Awesome, HttpClient para el frontend, y Spring Boot, Spring Data JPA, Swagger, y MySQL para el backend.
