package com.banco;

public static void main(String[] args) {
	// TODO Auto-generated method stub
	String cadena1 = "ho";
      String cadena2 = "ho";
      
      boolean sonIguales = compararDosCadenas(cadena1, cadena2);
      
      if(sonIguales) {
         System.out.println("son iguales");
      } else {
         System.out.println("son diferentes");
      }
   }
   
   public static boolean compararDosCadenas(String cadena1, String cadena2) {
      if(cadena1.length() >= 4 && cadena2.length() >= 4) {
         String primerosCaracteres1 = cadena1.substring(0,2);
         String primerosCaracteres2 = cadena2.substring(0,2);
         String ultimosCaracteres1 = cadena1.substring(cadena1.length() - 2);
         String ultimosCaracteres2 = cadena2.substring(cadena2.length() - 2);
         
         return primerosCaracteres1.equals(primerosCaracteres2) &&
        		 ultimosCaracteres1.equals(ultimosCaracteres2);
      } else {
         return false;
          }
	          }
	      
	   }
	   
	
	


