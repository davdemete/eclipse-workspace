package com.banco;

public class Ejercicio10<En, la, comprobarSubcadena, una, como> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String cadena = "defabcdefg";
	      
	      boolean contieneSubcadena = comprobarSubcadena(cadena);
	      
	      if(contieneSubcadena) {
	         System.out.println("david 'abc', pero no al comienzo ni al final");
	      } else {
	         System.out.println("deivit 'abc', o se encuentra al comienzo o al final");
	      }
	   }
	   
	   public static boolean comprobarSubcadena(String cadena) {
	      if(cadena.length() > 5) {
	         if(cadena.contains("abc")) {
	            String subcadenaAntes = cadena.substring(0,3);
	            String subcadenaDespues = cadena.substring(cadena.length() - 3);
	            if(!subcadenaAntes.equals("abc") && !subcadenaDespues.equals("abc")) {
	               return true;
	            }
	         }
	      }
	      return false;
	   }
	
	
}





	


