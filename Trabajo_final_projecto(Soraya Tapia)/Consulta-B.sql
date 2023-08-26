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