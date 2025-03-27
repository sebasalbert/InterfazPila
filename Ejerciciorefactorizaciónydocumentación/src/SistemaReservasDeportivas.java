
import java.time.LocalDateTime;
import java.util.ArrayList;

import java.util.List;

import entidades.Reserva;

/**
 * Clase que representa el sistema de reservas para pistas deportivas.
 * Gestiona las reservas, la iluminación de las pistas y la disponibilidad de las mismas.
 */

public class SistemaReservasDeportivas {

    private List<Reserva> reservas;
    GestorIluminacion data = new GestorIluminacion();
	static final int MAX_PISTAS = 10; // Asumimos un máximo de 10 pistas
    
    /**
     * Constructor del sistema de reservas deportivas.
     * Inicializa las reservas y el estado de iluminación de las pistas.
     */

    public SistemaReservasDeportivas() {
        reservas = new ArrayList<>();
        data.iluminacion = new boolean[MAX_PISTAS];
    }
    
    /**
     * Reserva una pista deportiva en una fecha y duración específica.
     * @param reserva TODO
     * 
     * @return true si la reserva fue exitosa, false si la pista ya está reservada
     *         en esa fecha o si el ID de la pista es inválido.
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
     * Cancela una reserva existente.
     * 
     * @param idReserva El ID de la reserva a cancelar.
     * @return true si la reserva fue cancelada exitosamente, false si no se encontró
     *         la reserva con el ID especificado.
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
     * Verifica si una pista deportiva está disponible en una fecha y hora
     * específica.
     * 
     * @param idPista El ID de la pista que se desea verificar.
     * @param fecha La fecha en la que se desea verificar la disponibilidad.
     * @param hora La hora en la que se desea verificar la disponibilidad.
     * @return true si la pista está disponible en esa fecha y hora, false si la
     *         pista ya está reservada.
     */

    public boolean verificarDisponibilidad(int idPista, LocalDateTime fecha, String hora) {
        if (idPista < 0 || idPista >= MAX_PISTAS) {
            return false; // ID de pista inválido
        }
        for (Reserva r : reservas) {
            if (r.getIdPista() == idPista && esFechaDisponible(fecha, r)) {
                return false; // La pista no está disponible en esa fecha
            }
        }
        return true; // La pista está disponible
    }

	private boolean esFechaDisponible(LocalDateTime fecha, Reserva r) {
		return r.getFecha().equals(fecha);
	}
}