package com.appf2;
public class ArrayInt {
    public static void main(String[] args) {
        int[] numeros = new int[6];
        
        // Rellenar el array con números aleatorios entre 1 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
        }
        
        // Mostrar los valores del array en pantalla
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor " + (i+1) + ": " + numeros[i]);
        }
    }
}
