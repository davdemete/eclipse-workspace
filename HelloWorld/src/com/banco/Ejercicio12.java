package com.banco;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "abracadabra";
	      
	      int segundaOcurrencia = cadena.indexOf('a', cadena.indexOf('a') + 1);
	      int terceraOcurrencia = cadena.indexOf('a', segundaOcurrencia + 1);
	      
	      System.out.println("La segunda ocurrencia de 'a' está en el índice " + segundaOcurrencia);
	      System.out.println("La tercera ocurrencia de 'a' está en el índice " + terceraOcurrencia);
	   }
	
	}


