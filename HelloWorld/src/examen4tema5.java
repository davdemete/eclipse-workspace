import org.springframework.stereotype.Component;

public class examen4tema5 {
	@Component
	public class Bean {
	    private String mensaje;

	    @PostConstruct
	    public void init() {
	        System.out.println("Inicializando bean");
	        mensaje = "Hola, mundo!";
	    }

	    @PreDestroy
	    public void destroy() {
	        System.out.println("Destruyendo bean");
	    }

	    public String getMensaje() {
	        return mensaje;
	    }
	}

}
