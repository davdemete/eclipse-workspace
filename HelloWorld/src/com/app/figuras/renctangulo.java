package com.app.figuras;
public class Renctangulo extends Figura implements Dibujable  {
//Constructor
	public Renctangulo() {
		   super();
	}
	public Renctangulo(int base) {
		   super();
		   this.base = base;
	}
	public void Rectangulo(int base,int altura) {
		
	}
	
	//Atributos
	private int base;
	private int altura;
	
	//Metodos
	@Override
	public double area() {
		   return base*altura;
	}
	@Override
	public void dibujar() {
		System.out.println("Dibujando el rectangulo");
	}
	
	//Getters y setters
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}


	       
	
	
	
	
	
	
	
	
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}

}
