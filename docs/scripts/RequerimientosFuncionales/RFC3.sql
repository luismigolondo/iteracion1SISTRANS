SELECT r.ID_HABITACION as HABITACIONES_LIBRES
FROM HABITACIONES h INNER JOIN RESERVAS_HABITACIONES r ON h.ID=r.ID_HABITACION AND r.FECHA_INICIO>='17/03/2019' AND r.FECHA_FIN<='17/03/2019';