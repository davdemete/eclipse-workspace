package com.banco;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "hola mundo";
	      int indice = 4;
	      
	      boolean mismoCaracter = comprobarCaracter(cadena, indice);
	      
	      if(mismoCaracter) {
	         System.out.println("El carácter en el índice " + indice + "antes y después de él");
	      } else {
	         System.out.println("El carácter en el índice " + indice + "antes y después de él");
	      }
	   }
	   
	   public static boolean comprobarCaracter(String cadena, int indice) {
	      if(indice > 0 && indice < cadena.length() - 1) {
	         char caracterAntes = cadena.charAt(indice - 1);
	         char caracterDespues = cadena.charAt(indice + 1);
	         
	         return caracterAntes == caracterDespues;
	      } else {
	         return false;
	      }
	   }
	
}


