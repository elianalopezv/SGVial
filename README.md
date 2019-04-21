# SGVial 

Herramienta para visualizar información acerca de la malla vial de Medellín. :vertical_traffic_light::red_car::truck::bike:

## Desarrollo de la aplicación

La aplicación se desarrolló a partir de la [entrevista][1] y los [datos][2] suministrados por el cliente interesado.

En la entrevista el cliente solicita poder ver la información disponible de los segmentos de la malla vial y sus elementos asociados a través de una aplicación web.

### :heavy_check_mark: Actividades desarrolladas 

* Creación del modelo de base de datos
* Configuración inicial del backend
* Creación de las clases correspondientes con el modelo en el backend
* Creación de las tablas en base de datos a través del ORM
* Inserción de datos en las tablas
* Creación básica de vistas y sus controladores
* Implementación de las consultas a base de datos en los controladores
* Implementación de código en las vistas para mostrar los resultados de las consultas

__:pushpin: Modelo de base de datos:__
![Modelo ER][ER]

### :wrench: Lenguajes, herramientas y frameworks utilizados 

* __Base de datos:__ Postgres 11.2, pgAdmin4
* __Backend:__ Java 8, Play 2.7, Ebean (ORM)
* __Frontend:__ Twirl, Bootstrap


## Pasos para ejecutar la aplicación

### :arrow_right: Método 1:

#### 1. Configurar base de datos en pgAdmin:

* Crear una nueva base de datos
* Click derecho en la nueva base de datos -> Restore
* Agregar en el campo `Filename` el archivo `sgvial_bk` ubicado en la carpeta :file_folder:backups\
* Restaurar

![Restore database][restore]

#### 2. Configurar url de la base de datos:

* Ir al archivo :file_folder:conf\application.conf
* Editar la línea de configuración del url de la base de datos para que coincida con la configuración nueva:

```
db.default.url="jdbc:postgresql://<hostname>:<port>/<database>?user=<user>&password=<password>"
```
#### 3. Ejecutar la aplicación

* En la carpeta del projecto, ejecutar `sbt run`
* En el navegador, abrir `localhost:9000`


### :arrow_right: Método 2:

#### 1. Crear una nueva base de datos en Postgresql
* En este paso se crea la base de datos, y las tablas se agregarán automáticamente con el ORM en el paso 3.

#### 2. Configurar url de la base de datos:

* Ir al archivo :file_folder:conf\application.conf
* Editar la línea de configuración del url de la base de datos para que coincida con la configuración nueva:

```
db.default.url="jdbc:postgresql://<hostname>:<port>/<database>?user=<user>&password=<password>"
```

#### 3. Ejecutar la aplicación

* En la carpeta del projecto, ejecutar `sbt run`
* En el navegador, abrir `localhost:9000`
* Aparecerá un mensaje como el siguiente:

![Migración de la base de datos][evolution]

* Click en `Apply this script now`. Esto ejecutará el script para crear las tablas en base de datos.

#### 4. Insertar datos

* Abrir un editor el archivo :file_folder:sql\insertions.sql
* Este script copia los datos desde archivos .csv a las tablas. Se debe reemplazar la ruta a la carpeta :file_folder:csv\ por la nueva ruta local.


:warning: Se recomienda copiar la carpeta :file_folder:csv\ a la misma ruta que aparece en el script, ya que en una ruta diferente es posible que postgresql no tenga acceso.
![Script de inserción][insertions]

* Ejecutar el script en la base de datos
* Refrescar la aplicación

### Resultado

Utilizando cualquiera de los dos métodos descritos anteriormente, la aplicación se debe ver así:




[1]: https://drive.google.com/file/d/19wdfAKOND3hYrgpUnLMHqAe0Y7-Zft4D/view
[2]: https://drive.google.com/file/d/1ToTkKGbi8Ju2aZZw6LGlbALOrf7skm1x/view
[ER]: https://github.com/elianalopezv/SGVial/blob/master/screens/ER.JPG
[restore]: https://github.com/elianalopezv/SGVial/blob/master/screens/ER.JPG
[evolution]: https://github.com/elianalopezv/SGVial/blob/master/screens/evolution.JPG
[insertions]: https://github.com/elianalopezv/SGVial/blob/master/screens/evolution.JPG
