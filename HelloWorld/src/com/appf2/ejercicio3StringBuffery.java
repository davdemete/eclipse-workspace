package com.appf2;

public class ejercicio3StringBuffery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("abcdefghij");
	      
	      for(int i = 3; i < sb.length(); i += 4) {
	         sb.insert(i, 'b');
	      }
	      
	      System.out.println("Resultado: " + sb);
	   }
	






	}


