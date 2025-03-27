
public class GestorIluminacion {
	public boolean[] iluminacion;

	public GestorIluminacion() {
	}

	/**
	 * Activa la iluminación de una pista deportiva.
	 * 
	 * @param sistemaReservasDeportivas TODO
	 * @param idPista El ID de la pista a la que se le desea activar la iluminación.
	 * @return true si la iluminación fue activada exitosamente, false si el ID de
	 *         la pista es inválido.
	 */
	
	public boolean encenderLuces (SistemaReservasDeportivas sistemaReservasDeportivas, int idPista) {
	    if (idPista < 0 || idPista >= SistemaReservasDeportivas.MAX_PISTAS) {
	        return false; // ID de pista inválido
	    }
	    iluminacion[idPista] = true;
	    return true;
	}

	/**
	 * Desactiva la iluminación de una pista deportiva.
	 * 
	 * @param sistemaReservasDeportivas TODO
	 * @param idPista El ID de la pista a la que se le desea desactivar la
	 *                iluminación.
	 * @return true si la iluminación fue desactivada exitosamente, false si el ID
	 *         de la pista es inválido.
	 */
	
	public boolean apagarLuces (SistemaReservasDeportivas sistemaReservasDeportivas, int idPista) {
	    if (idPista < 0 || idPista >= SistemaReservasDeportivas.MAX_PISTAS) {
	        return false; // ID de pista inválido
	    }
	    iluminacion[idPista] = false;
	    return true;
	}
}