# API de Festivos

Este proyecto es una **API REST desarrollada con Spring Boot** que permite gestionar los días festivos de distintos países.  
Fue creada con fines académicos y utiliza una base de datos en memoria **H2** para facilitar las pruebas.

---

## Tecnologías utilizadas

- Java 17  
- Spring Boot 3.4.10  
- Spring Data JPA  
- H2 Database  
- Maven

---

## Estructura del proyecto


---

## Endpoints principales

### 1. Listar todos los festivos
**GET** `/api/festivos`

### 2. Buscar festivo por ID
**GET** `/api/festivos/{id}`

### 3. Crear un nuevo festivo
**POST** `/api/festivos`

**Body ejemplo:**
```json
{
  "nombre": "Día de la Independencia",
  "dia": 20,
  "mes": 7,
  "pais": { "id": 1 },
  "tipo": { "id": 2 }
}
