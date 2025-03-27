import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entidades.Reserva;

/**
 * Clase que representa un sistema de reservas deportivas.
 * Permite gestionar reservas de pistas, iluminación y verificar disponibilidad
 */
public class SistemaReservasDeportivas {

    /** Lista que almacena todas las reservas realizadas */
    private List<Reserva> reservas;
    
    GestorIluminacion data = new GestorIluminacion();

	/** Constante que define el número máximo de pistas disponibles */
    static final int MAX_PISTAS = 10;

    /**
     * Constructor de la clase. Inicializa la lista de reservas y el array de iluminación
     */
    public SistemaReservasDeportivas() {
        reservas = new ArrayList<>();
        data.iluminacion = new boolean[MAX_PISTAS];
    }

    /**
     * Realiza una reserva de pista
     *
     * @param idPista Metodo de identificador de la pista a reservar
     * @param fecha Represennta la fecha de la reserva
     * @param duracion Es la duración de la reserva
     * @return true si la reserva se realizó con éxito, false en caso contrario
     */
    public boolean reservarPista(Reserva reserva) {
        if (reserva.getIdPista() < 0 || reserva.getIdPista() >= MAX_PISTAS) {
            return false; // ID de pista inválido
        }
        for (Reserva r : reservas) {
            if (r.getIdPista() == reserva.getIdPista() && esFechaDisponible(reserva.getFecha(), r)) {
                return false; // La pista ya está reservada en esa fecha
            }
        }
        reservas.add(reserva);
        return true;
    }

    /**
     * Constructor para la cancelación una reserva existente
     *
     * @param idReserva Identificador de la reserva a cancelar
     * @return true si la reserva se canceló con éxito, false si no se encontró la reserva
     */
    public boolean cancelarReserva(int idReserva) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getIdPista() == idReserva) {
                reservas.remove(i);
                return true;
            }
        }
        return false; // No se encontró la reserva
    }

    /**
     * Verifica la disponibilidad de una pista en una fecha y hora específicas
     *
     * @param idPista Identificador de la pista a verificar
     * @param fecha Fecha para la cual se verifica la disponibilidad
     * @param hora Hora para la cual se verifica la disponibilidad
     * @return true si la pista está disponible, false en caso contrario o si el ID de pista es inválido
     */
    public boolean verificarDisponibilidad(int idPista, LocalDateTime fecha, String hora) {
        if (idPista < 0 || idPista >= MAX_PISTAS) {
            return false; // ID de pista inválido
        }
        for (Reserva r : reservas) {
            if (r.getIdPista() == idPista && esFechaDisponible(fecha, r)) { //Cambiamos el equals y creamos un metodo llamado esFechaDisponible y se rempleza tambien en reservarpista
                return false; // La pista no está disponible en esa fecha
            }
        }
        return true; // La pista está disponible
    }

	private boolean esFechaDisponible(LocalDateTime fecha, Reserva r) {
		return r.getFecha().equals(fecha);
	}
}