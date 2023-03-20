package com.clase.info;

public class Ejercicio5examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
	    int num2 = 5;
	    int num3 = 20;
	    int num4 = 15;

	    int mayor = num1; // Asignamos el primer número como el mayor inicialmente

	    // Comparamos cada número con el actual mayor para determinar si hay un nuevo mayor
	    if (num2 > mayor) {
	      mayor = num2;
	    }
	    if (num3 > mayor) {
	      mayor = num3;
	    }
	    if (num4 > mayor) {
	      mayor = num4;
	    }

	    System.out.println("El mayor número es: " + mayor);
	  }
	
	}


