package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainspring {

	public static <Entrenador> void main(String[] args) {
		// TODO Auto-generated method stub
		// abre el contexto a partir del archivo de configuración 
		ClassPathXmlApplicationContext context =
		new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		obtiene el bean, donde:
		- el primer parámetro es el identificador del bean
		- el segundo parámetro es la interfaz que implementa el bean a recibir, realizando 
		una especie casting
		*/
		Entrenador entrenador = context.getBean("mientrenador", Entrenador.class); 
		System.out.println(entrenador).getEntrenamiento());
		// cierra el contexto 
		context.close();
		}
		}
		
	


