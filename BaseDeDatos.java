/**
 * 
 */

/**
 * @author Destructor X
 *
 */
import java.util.ArrayList;

public class BaseDeDatos {
	
	private String usuario;
	private String contraseña;
	
	public BaseDeDatos() {
		
		usuario="";
		contraseña="";
		
	}
	
	public void setUsuario(String usuario) {
		
		this.usuario=usuario;
		
	}
	public String getUsuario() {
		
		return usuario;
		
	}
	public void setContraseña(String contraseña) {
		
		this.contraseña=contraseña;
		
	}
	public String getContraseña() {
		
		return contraseña;
		
	}
	
	public Connection conexionBaseDatosRegistrar(String Usuario , String Contraseña) {
		
		Connection conecion=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conecion= DriverManager.getConnection("jdbc:mysql://localhost:3306/fmathdatabase", "root", "Lolo1234");
			
			
			String query="INSERT INTO usuarios (Usuario,Clave) values('"+Usuario+"','"+Contraseña+"')";
			
			Statement stm =conecion.createStatement();
			
			stm.executeUpdate(query);
			
			JOptionPane.showMessageDialog(null, "¡Tarea compleatada con exito!");
			
		} catch (ClassNotFoundException e) {
			
			JOptionPane.showMessageDialog(null, "¡Error al cargar el controlador!");
			
			e.printStackTrace();
		}
		catch (SQLException e) {
			
			JOptionPane.showMessageDialog(null, "¡Error de Conexion!");
			
			e.printStackTrace();
			
		}
		
		return conecion;
		
	}
	
}
