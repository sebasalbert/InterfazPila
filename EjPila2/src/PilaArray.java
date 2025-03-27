
public class PilaArray<T>{

	T [] tabla;
	int posicion;
	
	PilaArray (){
		posicion = 0;
		tabla = (T[]) new Object[50];
	}
	
	public boolean push(T valor) {
		if (posicion < tabla.length) {
			tabla[posicion] = valor;
			posicion++;
			return true;
		}
		return false;
	}
	
	public T pop() {
		if (posicion == 0) {
			return null;
		} else {
			posicion++;
			return tabla[posicion];
		}
	}
	
	public T peek() {
		if (posicion == 0) {
			return null;
		} else {
			posicion++;
			return tabla[posicion - 1];
		}
	}
	
	public int size() {
		return tabla.length - 1;
	}


}
