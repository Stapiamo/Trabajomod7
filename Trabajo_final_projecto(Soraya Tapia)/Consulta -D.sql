SELECT
    peliculas.titulo , AVG(calificaciones.puntuacion) 
FROM peliculas
JOIN  calificaciones ON peliculas.id_pelicula = calificaciones.id_pelicula
GROUP BY  peliculas.titulo
ORDER BY AVG(calificaciones.puntuacion) DESC LIMIT 3;