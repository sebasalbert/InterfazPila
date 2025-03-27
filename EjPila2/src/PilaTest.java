
public class PilaTest {

	public static void main(String[] args) {
	
		PilaInterfaz<String> pilat = new PilaLista<String>();
		
		System.out.println(" A) Test Pila con Array ");
		pilat.push("Hola");
		pilat.push("Luis");
		pilat.push("Adios");
		System.out.println(" Primer elemento "+pilat.peek());
		pilat.pop();
		System.out.println(" Tamaño: "+ pilat.size()+ ":"+ pilat);
		
		
		System.out.println(" A) Test Pila lista encadenada ");
		PilaArray<String> pilal = new PilaArray<String>();
		pilal.push("Hola");
		pilal.push("Luis");
		pilal.push("Adios");
		System.out.println(" Primer elemento "+pilal.peek());
		pilal.pop();
		System.out.println(" Tamaño: "+ pilal.size()+ ":"+ pilal);
		
		

	}

}
