package ManejoDeDatos;

import java.util.List;
import Datos.personaJDBC;
import Domain.persona;

public class manejoDeDatos {
	
	public static void main(String []args) {
		personaJDBC persona = new personaJDBC();
		List<persona> personas = persona.select();
		
		for (persona persona2 : personas) {
			System.out.println("Persona: "+persona2);
		}
	}

}
