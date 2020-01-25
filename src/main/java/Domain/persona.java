package Domain;

public class persona {
	
	private int id_persona;
	private String nombre;
	private String correo;
	private int telefono;
	
	public persona() {
		
	}
	
	public persona(int id_persona, String nombre, String correo, int telefono) {
		this.id_persona = id_persona;
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
	}
	

	public int getId_persona() {
		return id_persona;
	}

	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}

	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setCorreo(String correo) {
		this.correo=correo;
	}
	
	public String getCorreo() {
		return correo;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "persona [id_persona=" + id_persona + ", nombre=" + nombre + ", correo=" + correo + ", telefono="
				+ telefono + "]";
	}

	
	

}
