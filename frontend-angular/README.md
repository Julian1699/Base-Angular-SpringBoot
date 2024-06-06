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

### Crear (AgregarObjeto.js)
Permite a los usuarios agregar nuevos objetos a la base de datos mediante un formulario. Los datos se envían al backend utilizando una solicitud HTTP POST.

## Leer (ListadoObjetos.js)
Permite a los usuarios ver una lista de todos los objetos almacenados. Los datos se obtienen del backend mediante una solicitud HTTP GET.

## Actualizar (EditarObjeto.js)
Permite a los usuarios editar los detalles de un objeto existente. Los datos modificados se envían al backend utilizando una solicitud HTTP PUT.

## Eliminar (ListadoObjetos.js)
Permite a los usuarios eliminar un objeto de la base de datos. La eliminación se realiza mediante una solicitud HTTP DELETE.

## Buscar Objetos (ListadoObjetos.js)

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
    git clone https://github.com/tuusuario/frontend-Angular.git
    ```

2. Instalar las dependencias:
    ```bash
    cd frontend-Angular
    
    npm install
    ```

3. Ejecutar la aplicación:
    ```bash
    npm start
    ```

4. Acceder a la aplicación en [http://localhost:4200].


## Componentes Principales

### Navegacion.js
Este componente define la barra de navegación de la aplicación, utilizando `Angular-router-dom` para la navegación entre diferentes rutas.

### AgregarObjeto.js
Este componente permite agregar un nuevo objeto mediante un formulario. Utiliza `HttpClient` para enviar la solicitud POST al backend.

### EditarObjeto.js
Este componente permite editar un objeto existente. Utiliza `HttpClient` para enviar la solicitud PUT al backend.

### ListadoObjetos.js
Este componente muestra una lista de todos los objetos y permite buscar, editar y eliminar objetos mediante interacciones con el backend.

### Bienvenida.js
Este componente muestra una página de bienvenida con información básica sobre la aplicación y enlaces a otras secciones importantes.