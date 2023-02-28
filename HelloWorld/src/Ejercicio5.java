
public class Ejercicio5 {

	public static void main(String[] args) {
		// Atributos
	    private int id;
	    private int edad;
	    private String telefono;
	    private int numeroDeNotas;
	    private double sumaDeNotas;
	    private double notaMedia;

	    // Constructor
	    
	        this.id = id;
	        this.edad = edad;
	        this.telefono = telefono;
	        this.numeroDeNotas = 0;
	        this.sumaDeNotas = 0.0;
	        this.notaMedia = 0.0;
	    }

	    // Métodos
	    public void mostrarInfo() {
	        System.out.println("ID: " + id);
	        System.out.println("Edad: " + edad);
	        System.out.println("Teléfono: " + telefono);
	        System.out.println("Número de notas: " + numeroDeNotas);
	        System.out.println("Nota media: " + notaMedia);
	    }

	    public void agregarNuevaNota(double nota) {
	        sumaDeNotas += nota;
	        numeroDeNotas++;
	        notaMedia = sumaDeNotas / numeroDeNotas;
	}

}
