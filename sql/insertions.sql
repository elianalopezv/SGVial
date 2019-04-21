COPY segmento(id,longitud,tipo_via,estrato) 
FROM 'C:\temp\csv\segmentos.csv' DELIMITER ';' CSV HEADER;

COPY nomenclatura(segmento_id,via_generadora,n_via_gen,cruce_desde,n_cruce_desde,cruce_hasta,n_cruce_hasta) 
FROM 'C:\temp\csv\nomenclatura.csv' DELIMITER ';' CSV HEADER;

COPY funcionalidad(id,funcionalidad) 
FROM 'C:\temp\csv\funcionalidad.csv' DELIMITER ';' CSV HEADER;

COPY superficie(id,superficie) 
FROM 'C:\temp\csv\superficie.csv' DELIMITER ';' CSV HEADER;

COPY estado(id,estado) 
FROM 'C:\temp\csv\estado.csv' DELIMITER ';' CSV HEADER;

COPY calzada(segmento_id,funcionalidad_id,superficie_id,mdr,opi,iri) 
FROM 'C:\temp\csv\calzadas.csv' DELIMITER ';' CSV HEADER;

COPY bordillo(segmento_id,estado_id, longitud,orden,indice_condicion) 
FROM 'C:\temp\csv\bordillos.csv' DELIMITER ';' CSV HEADER;