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
	private String contrase�a;
	
	public BaseDeDatos() {
		
		usuario="";
		contrase�a="";
		
	}
	
	public void setUsuario(String usuario) {
		
		this.usuario=usuario;
		
	}
	public String getUsuario() {
		
		return usuario;
		
	}
	public void setContrase�a(String contrase�a) {
		
		this.contrase�a=contrase�a;
		
	}
	public String getContrase�a() {
		
		return contrase�a;
		
	}
	
}
