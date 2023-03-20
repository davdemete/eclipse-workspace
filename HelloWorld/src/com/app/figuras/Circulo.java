package com.app.figuras;
import Dibujable;

public abstract class Circulo extends figura implements Dibujable {

	//Artibutos
	public Circulo() {
		    super();
	}
	public Circulo(float radio) {
		super();
		this.radio = radio;
	}

	//Artibutos
	private float radio;
	
	//Metodos
	@Override
	public void dibujar() {
		//TODO Auto-generated method stub
		System.out.println("Dibujando el circulo");
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return pi * Math.pow(radio, 2);
	}
	//Getters y setters
	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}
	
}
	
		
	}


