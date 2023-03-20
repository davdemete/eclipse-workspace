package com.appf2;

public class Ejercicio4StringBuffery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			   
			      StringBuilder sb = new StringBuilder("StringBuilder");
			      
			      boolean capitalizar = true;
			      for(int i = 0; i < sb.length(); i++) {
			         char c = sb.charAt(i);
			         
			         if(Character.isWhitespace(c)) {
			            capitalizar = true;
			         }
			         else if(capitalizar) {
			            sb.setCharAt(i, Character.toUpperCase(c));
			            capitalizar = false;
			         }
			      }
			      
			      System.out.println("Resultado: " + sb);
			   }
			

	}


