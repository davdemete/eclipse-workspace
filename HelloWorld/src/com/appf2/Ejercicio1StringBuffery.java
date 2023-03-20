package com.appf2;

public class Ejercicio1StringBuffery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb1 = new StringBuilder("Hola");
	      StringBuilder sb2 = new StringBuilder("Mundo");
	      
	      // Usando el método append
	      sb1.append(sb2);
	      System.out.println("Resultado con append: " + sb1);
	      
	      // Usando el operador de concatenación
	      StringBuilder sb3 = new StringBuilder("Hola");
	      StringBuilder sb4 = new StringBuilder("Mundo");
	      
	      sb3 = sb3.append(sb4);
	      System.out.println("Resultado con operador +: " + sb3);
	   }
	






	}


