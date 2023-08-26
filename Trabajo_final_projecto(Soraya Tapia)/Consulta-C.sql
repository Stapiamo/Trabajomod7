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