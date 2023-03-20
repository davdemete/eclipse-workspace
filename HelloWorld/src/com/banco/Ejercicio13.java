package com.banco;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String cadena = "sometemos";
	      
	      if(esPalindromo(cadena)) {
	         System.out.println("La cadena '" + cadena + "' es un palíndromo");
	      } else {
	         System.out.println("La cadena '" + cadena + "' no es un palíndromo");
	      }
	   }
	   
	   public static boolean esPalindromo(String cadena) {
	      int longitud = cadena.length();
	      for(int i = 0; i < longitud/2; i++) {
	         if(cadena.charAt(i) != cadena.charAt(longitud - 1 - i)) {
	            return false;
	         }
	      }
	      return true;
	   }
	
	}


