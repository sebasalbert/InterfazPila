package entidades;

import java.time.LocalDateTime;

/**
 * Clase que representa una reserva de pista deportiva.
 * Contiene la información sobre la pista reservada, la fecha de la reserva y la duración de la misma.
 */

public class Reserva {
    private int idPista;
    private LocalDateTime fecha;
    private int duracion;
    
    /**
     * Constructor para crear una nueva reserva.
     * 
     * @param idPista El ID de la pista que se está reservando.
     * @param fecha La fecha en la que se realiza la reserva.
     * @param duracion La duración de la reserva en minutos.
     */

    public Reserva(int idPista, LocalDateTime fecha, int duracion) {
        this.idPista = idPista;
        this.fecha = fecha;
        this.duracion = duracion;
    }
    

    public int getIdPista() {
        return idPista;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public int getDuracion() {
        return duracion;
    }
}