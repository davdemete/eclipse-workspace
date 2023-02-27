
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Otro ejercicio");
        // Suma número
        Scanner keyboard = new Scanner(System.in);
        int numero= keyboard.nextInt();
        System.out.printf("Escribe en pantalla un número: %d ",numero).println();
        for(int i2 = numero-1;i2>0;i2--){
            System.out.printf("%d + %d = %d",numero, i2, numero+i2)
            .println();
            numero+=i2;
        }
        System.out.printf("El resultado final es: %d", numero).println();
    }

	}


