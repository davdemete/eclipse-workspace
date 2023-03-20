package com.appf2;

public class Ejercicio2Stringbuffery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringBuilder sb = new StringBuilder("Hola Mundo");
	      
	      // Eliminando el último carácter
	      sb.deleteCharAt(sb.length() - 1);
	      
	      System.out.println("Resultado: " + sb);
	   }
	
	}


