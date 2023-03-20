package com.banco;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena1 = "hola";
	      String cadena2 = "hi";
	      
	      boolean sonIguales = compararDosCadenas(cadena1, cadena2);
	      
	      if(sonIguales) {
	         System.out.println("Los dos primeros caracteres son iguales");
	      } else {
	         System.out.println("Los dos primeros caracteres son diferentes");
	      }
	   }
	   
	   public static boolean compararDosCadenas(String cadena1, String cadena2) {
	      if(cadena1.length() >= 2 && cadena2.length() >= 2) {
	         return cadena1.substring(0,2).equals(cadena2.substring(0,2));
	      } else {
	         return false;
	      }
	   }
	
	}


