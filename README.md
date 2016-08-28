## Workshop de Spring Boot ##


## Requisitos

* [Java Platform (JDK) 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Apache Maven 3.x](http://maven.apache.org/)
* IDE recomendados: [Eclipse STS](https://spring.io/tools/sts), IntelliJ
* GIT

## Objetivos
- Introducción a Spring Boot
- Crear Proyecto REST de Demo
- Persistir Datos en H2

## Introducción a Spring Boot

- Enfocado en deploy rápido de programas que ofrecen un servicio REST
- Convención sobre configuración. Se deja de usar archivos XML
- El proyecto se auto-configura con:
   1. Dependencias agregadas al CLASSPATH
   2. Nombres de clases en el proyecto
   3. Anotaciones sobre clases 

Para más referencia recurrir a la [documentación oficial de Spring Boot](http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/).


### 1) Crear un endpoint: GET - /saludo 

- Crear la clase: py.com.pronet.web.PronetController
- Crear el endpoint: **"/saludo"** que retorne un String "Hola Mundo"
- Ir a la URL desde el navegador: [http://localhost:8080/saludo]()

El resultado de esta parte se encuentra en la rama: **demo-1-rest**

## Persistir Datos en H2
- Agregar soporte para JPA y H2 al proyecto:
	
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
		</dependency>


- Crear la entidad (@Entity): **User**

- Crear el repositorio: **UserRepository** extendiendo de JpaRepository
 
- Crear el servicio: **UserService**, con métodos findAll() y save()

- Agregar usuarios de prueba luego de arrancar la Aplicación

- Crear un controlador: **UserController**. Con un endpoint **'/users'** que devuelve todos los usuarios de la BD

El resultado de esta parte se encuentra en la rama: demo-2-h2
