SELECT
    usuarios.nombreusuario ,peliculas.titulo ,calificaciones.resena AS 'Reseña'
FROM usuarios
JOIN calificaciones ON usuarios.id_usuario = calificaciones.id_usuario
JOIN peliculas ON calificaciones.id_pelicula = peliculas.id_pelicula
WHERE usuarios.nombreusuario = 'usuario6';