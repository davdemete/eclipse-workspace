package com.appf2;

public class Ejercicio5StringBuffery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringBuilder sb = new StringBuilder("StringBuilder");
	      
	      int start = 0;
	      for(int i = 0; i < sb.length(); i++) {
	         char c = sb.charAt(i);
	         
	         if(Character.isWhitespace(c)) {
	            invertirPalabra(sb, start, i-1);
	            start = i+1;
	         }
	      }
	      
	      invertirPalabra(sb, start, sb.length()-1);
	      
	      System.out.println("Resultado: " + sb);
	   }
	   
	   public static void invertirPalabra(StringBuilder sb, int start, int end) {
	      while(start < end) {
	         char temp = sb.charAt(start);
	         sb.setCharAt(start, sb.charAt(end));
	         sb.setCharAt(end, temp);
	         start++;
	         end--;
	      }
	   }
	
	}


