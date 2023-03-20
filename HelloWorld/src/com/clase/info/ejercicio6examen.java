package com.clase.info;

public class ejercicio6examen {
	

	// Clase abstracta Animales
	public abstract class Animales implements SeresVivos {
	    protected int edad;

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }

	    public abstract void emitirSonido();
	}

	// Interfaz SeresVivos
	interface SeresVivos {
	    String habitat = "Tierra";

	    void respirar();
	}

	// Clase Colibri
	public class Colibri extends Animales {
	    private String color;
	    private int velocidad;

	    public Colibri(String color, int velocidad) {
	        this.color = color;
	        this.velocidad = velocidad;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setVelocidad(int velocidad) {
	        this.velocidad = velocidad;
	    }

	    public int getVelocidad() {
	        return velocidad;
	    }

	    @Override
	    public void emitirSonido() {
	        System.out.println("El colibrí emite un sonido agudo");
	    }

	    @Override
	    public void respirar() {
	        System.out.println("El colibrí respira oxígeno");
	    }
	}

	// Clase Delfin
	public class Delfin extends Animales {
	    private int peso;
	    private String tipoAgua;

	    public Delfin(int peso, String tipoAgua) {
	        this.peso = peso;
	        this.tipoAgua = tipoAgua;
	    }

	    public void setPeso(int peso) {
	        this.peso = peso;
	    }

	    public int getPeso() {
	        return peso;
	    }

	    public void setTipoAgua(String tipoAgua) {
	        this.tipoAgua = tipoAgua;
	    }

	    public String getTipoAgua() {
	        return tipoAgua;
	    }

	    @Override
	    public void emitirSonido() {
	        System.out.println("El delfín emite un sonido de clic");
	    }

	    @Override
	    public void respirar() {
	        System.out.println("El delfín respira aire");
	    }
	}

	// Clase Leopardo
	public abstract class Leopardo extends Animales {
	    private String tipoPiel;
	    private int longitudCola;

	    public Leopardo(String tipoPiel, int longitudCola) {
	        this.tipoPiel = tipoPiel;
	        this.longitudCola = longitudCola;
	    }

	    public void setTipoPiel(String tipoPiel) {
	        this.tipoPiel = tipoPiel;
	    }

	    public String getTipoPiel() {
	        return tipoPiel;
	    }

	    public void setLongitudCola(int longitudCola) {
	        this.longitudCola = longitudCola;
	    }

	    public int getLongitudCola() {
	        return longitudCola;
	    }

	    @Override
	    public void emitirSonido() {
	    
	    }


