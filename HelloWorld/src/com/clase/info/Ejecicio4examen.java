package com.clase.info;
import java.io.Closeable;

import Scanner;

public class Ejecicio4examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el primer ángulo: ");
        int angulo1 = scanner.nextInt();
        
        System.out.print("Ingresa el segundo ángulo: ");
        int angulo2 = scanner.nextInt();
        
        System.out.print("Ingresa el tercer ángulo: ");
        int angulo3 = scanner.nextInt();
        
        int sumaAngulos = angulo1 + angulo2 + angulo3;
        
        if (sumaAngulos == 180) {
            System.out.println("Los ángulos pueden formar un triángulo.");
        } else {
            System.out.println("Los ángulos no pueden formar un triángulo.");
        }
        
	
    


