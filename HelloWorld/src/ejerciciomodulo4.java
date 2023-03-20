
public class ejerciciomodulo4 {
	public class Gestor {
	    private int id;
	    private String nombre;
	    private String correoElectronico;
	    private String telefono;

	    public Gestor(int id, String nombre, String correoElectronico, String telefono) {
	        this.id = id;
	        this.nombre = nombre;
	        this.correoElectronico = correoElectronico;
	        this.telefono = telefono;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getCorreoElectronico() {
	        return correoElectronico;
	    }

	    public String getTelefono() {
	        return telefono;
	    }
	}

	public class Cliente {
	    private int id;
	    private String nombre;
	    private String correoElectronico;
	    private String direccion;

	    public Cliente(int id, String nombre, String correoElectronico, String direccion) {
	        this.id = id;
	        this.nombre = nombre;
	        this.correoElectronico = correoElectronico;
	        this.direccion = direccion;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getCorreoElectronico() {
	        return correoElectronico;
	    }

	    public String getDireccion() {
	        return direccion;
	    }
	}

}
