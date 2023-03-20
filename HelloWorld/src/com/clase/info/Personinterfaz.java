package com.clase.info;


public abstract class Personinterfaz {
	public class Persona  {
	    private String nombre;
	    private int id;

	    public Persona(String nombre, int id) {
	        this.nombre = nombre;
	        this.id = id;
	    }

	    public void mostrarID() {
	        System.out.println("El ID de " + nombre + " es " + id);
	    }
	}

}
