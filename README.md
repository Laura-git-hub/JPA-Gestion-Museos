# JPA Gestión de Museos
Aplicación de consola en Java que gestiona la información de curadores, exposiciones y sedes de un sistema museístico. Utiliza JPA (Jakarta Persistence API) con Hibernate para mapear entidades a una base de datos relacional, insertar y ejecutar consultas JPQL.

## Tecnologías utilizadas

- Java 17+
- JPA (Jakarta Persistence API)
- Hibernate (ORM)
- Base de datos relacional MySQL 
- Visual Studio Code 
- JDK

## Estructura del proyecto

- `Entidades/Curador.java` – Clase entidad con relaciones a Sede y Exposición.
- `Entidades/Exposicion.java` – Clase entidad con relación ManyToOne a Curador.
- `Entidades/Sede.java` – Clase entidad con relación OneToOne a Curador.
- `InsertarDatos.java` – Inserta datos de ejemplo a la base de datos.
- `EjecutarDatos.java` – Realiza consultas con JPQL sobre las entidades.
- `Main.java` – Ejecuta la aplicación, gestiona la transacción y las operaciones principales.

## Funcionalidades principales

- Insertar curadores, exposiciones y sedes asociadas.
- Consultar:
  - Curadores sin exposiciones asignadas.
  - Exposiciones de curadores cuya sede tiene capacidad > 500.
  - Curadores con sede de capacidad < 100.

## Ejecución

1. Clona el repositorio:
   ```bash
   https://github.com/Laura-git-hub/JPA-Gestion-Museos.git
   
