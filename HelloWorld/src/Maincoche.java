

public class Maincoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche audi = new Coche();
		//método si que es público
		System.out.println(audi.getVelocidad());
		//no es público el atributo
//		audi.velocidad = 150.0f; 
		//No se puede porque no es "static"
//		System.out.println(Coche.getVelocidad());
		float kw = Coche.convertirCvKw(200.0f);
		System.out.printf("%f Kw",kw).println();
		float cv = Coche.convertirKwCv(kw);
		System.out.printf("%f CV",cv).println();
		
		//Instacia opel
		Coche opel = new Coche(100.0f,150.0f,7,4);
		System.out.println(opel.get.Velocidad);
		
	}
	
}

	


