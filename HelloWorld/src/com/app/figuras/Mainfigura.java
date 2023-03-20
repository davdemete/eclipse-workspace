package com.app.figuras;
public class Mainfigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instancia rectangulo y uso de area(), dibujar(), y getters
		System.out.println("Calculo del area y dibujando el rectangulo");
        Rectangulo rect = new Rectangulo(4,6);
        System.out.printf("La base es %d y la altura es %d por lo tanto"
        		+"el area es:",rectan.getBase(),rectan.getAltura());
        System.out.println(rectan.area());
        rectan.dibujar();
        //Instancia circulo y uso de area
        System.out.println("Calculo del area y dibujando el circulo:");
        Circulo circ = new Circulo(5);
        System.out.println(circ.area());
        circ.dibujar();
	}

}
