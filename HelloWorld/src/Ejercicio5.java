
public class Ejercicio5 {

	public static void main(String[] args) {
		// Atributos
	    int id;
	    int edad;
	    int telefono;
	    int numeroDeNotas;
	    int sumaDeNotas;
	    float notaMedia;

	    // Constructor
	    
	        this.id = id;
	        this.edad = edad;
	        this.telefono = telefono;
	        this.numeroDeNotas = 0;
	        this.sumaDeNotas = 0.0;
	        this.notaMedia = 0.0;
	    }

	    // Métodos
	    public void mostrarInfo() 
			System.out.println("ID: " + id)
			System.out.println("Edad: " + edad);
	        System.out.println("Teléfono: " + telefono);
	        System.out.println("Número de notas: " + numeroDeNotas);
	        System.out.println("Nota media: " + notaMedia);
	    

	    public void agregarNuevaNota(double nota) {
	        sumaDeNotas += nota;
	        numeroDeNotas++;
	        notaMedia = sumaDeNotas / numeroDeNotas;
	}

}
