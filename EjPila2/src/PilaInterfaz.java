
public interface PilaInterfaz <T> {
    
	// Introduce un valor en la pila
	boolean push(T valor);
	
	// Extrae un valor de la pila o null si está vacia
	T pop ();
	
	// Obtiene el primer elemento sin borrarlo o null si está vacia
	T peek ();
	
	// devuelve el número de elementos almacenados
	int size();
}
