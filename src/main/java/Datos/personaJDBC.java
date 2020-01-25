package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Domain.persona;

public class personaJDBC {

	private static final String SQL_SELECT = "SELECT * FROM datos";
	/*private static final String SQL_INSERT = "INSERT INTO PERSONA VALUES(?,?,?)";
	private static final String SQL_UPADTE = "UPDATE PERSONA SET NOMBRE=?, CORREO=?, TELEFONO=?";
	private static final String SQL_DELETE = "DELETE FROM PERSONA WHERE ID_PERSONA=?";*/
	
	public List<persona> select(){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		persona Persona = null;
		List<persona> personas = new ArrayList<persona>();
		
		try {
			conn = datos.getConnection();
			ps   = conn.prepareStatement(SQL_SELECT);
			rs	 = ps.executeQuery();
			while (rs.next()) {
				int id_persona = rs.getInt(1);
				String nombre = rs.getString("nombre");	
				String correo = rs.getString("correo");
				int telefono  = rs.getInt(4);
				Persona = new persona();
				Persona.setId_persona(id_persona);
				Persona.setNombre(nombre);
				Persona.setCorreo(correo);
				Persona.setTelefono(telefono);				
				personas.add(Persona);
			}
		} catch (SQLException e) {			
			e.printStackTrace();
		}	
		finally {
			datos.close(conn);
			datos.close(ps);
			datos.close(rs);
		}
		return personas;
	} 
}
