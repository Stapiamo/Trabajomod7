Consulta-A

SELECT titulo, anio_lanzamiento, id_genero from peliculas ORDER BY anio_lanzamiento asc



Consulta B 

SELECT
    generos.nombre_genero AS 'Género',
    COUNT(peliculas.id_pelicula) AS 'Número de Películas'
FROM
    generos
LEFT JOIN
    peliculas ON generos.id_genero = peliculas.id_genero
GROUP BY
    generos.nombre_genero
ORDER BY
    COUNT(peliculas.id_pelicula) DESC;



Consulta C


SELECT
    peliculas.titulo AS 'Título de la Película',
    AVG(calificaciones.puntuacion) AS 'Promedio de Calificaciones'
FROM
    peliculas
JOIN
    calificaciones ON peliculas.id_pelicula = calificaciones.id_pelicula
WHERE
    peliculas.id_pelicula = 9
GROUP BY
    peliculas.titulo;



Consulta D


SELECT
    peliculas.titulo , AVG(calificaciones.puntuacion) 
FROM peliculas
JOIN  calificaciones ON peliculas.id_pelicula = calificaciones.id_pelicula
GROUP BY  peliculas.titulo
ORDER BY AVG(calificaciones.puntuacion) DESC LIMIT 3;

Consulta E


SELECT
    usuarios.nombreusuario ,peliculas.titulo ,calificaciones.resena AS 'Reseña'
FROM usuarios
JOIN calificaciones ON usuarios.id_usuario = calificaciones.id_usuario
JOIN peliculas ON calificaciones.id_pelicula = peliculas.id_pelicula
WHERE usuarios.nombreusuario = 'usuario6';




