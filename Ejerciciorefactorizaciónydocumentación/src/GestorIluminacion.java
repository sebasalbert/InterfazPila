
public class GestorIluminacion {
	/** Array que representa el estado de iluminación de cada pista */
	public boolean[] iluminacion;

	public GestorIluminacion() {
	}

	/**
	 * Activa la iluminación de una pista específica
	 *
	 * @param sistemaReservasDeportivas TODO
	 * @param idPista Identificador de la pista cuya iluminación se encenderá
	 * @return true si se activó la iluminación con éxito, false si el ID de pista es inválido
	 */
	public boolean encenderLuces(SistemaReservasDeportivas sistemaReservasDeportivas, int idPista) {
	    if (idPista < 0 || idPista >= SistemaReservasDeportivas.MAX_PISTAS) {
	        return false; // ID de pista inválido
	    }
	    iluminacion[idPista] = true;
	    return true;
	}

	/**
	 * Constructor que desactiva la iluminación de una pista específica
	 *
	 * @param sistemaReservasDeportivas TODO
	 * @param idPista Identificador de la pista cuya iluminación se desactivará
	 * @return true si se desactivó la iluminación con éxito o false si el ID de pista es inválido
	 */
	public boolean apagarLuces(SistemaReservasDeportivas sistemaReservasDeportivas, int idPista) {
	    if (idPista < 0 || idPista >= SistemaReservasDeportivas.MAX_PISTAS) {
	        return false; // ID de pista inválido
	    }
	    iluminacion[idPista] = false;
	    return true;
	}

}
