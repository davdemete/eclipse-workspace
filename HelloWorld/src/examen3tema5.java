import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import Experenciaservicio.ExperienciaServicio;

public class examen3tema5 {
	@ComponentScan
	public class PocaExperienciaServicio implements ExperienciaServicio {
	    private String experiencia;

	    @Autowired
	    public PocaExperienciaServicio(@Value("Poca experiencia en la materia") String experiencia) {
	        this.experiencia = experiencia;
	    }

	    public String getExperiencia() {
	        return experiencia;
	    }
	}
	@Component
	public class PocaExperienciaServicio implements ExperienciaServicio {
	    private String experiencia;

	    public void setExperiencia(String experiencia) {
	        this.experiencia = experiencia;
	    }

	    public String getExperiencia() {
	        return experiencia;
	    }
	}
	@Component
	public class ProfesorInformatica implements Profesor, ExperienciaServicio {
	    private String nombre;
	    private String curso;
	    private String experiencia;

	    // Implementación de métodos de las interfaces Profesor y ExperienciaServicio

	    public String getExperiencia() {
	        return experiencia;
	    }

	    public void setExperiencia(String experiencia) {
	        this.experiencia = experiencia;
	    }
	}
	@Component
	public class PocaExperienciaServicio implements ExperienciaServicio {
	    private String experiencia;

	    public void setExperiencia(String experiencia) {
	        this.experiencia = experiencia;
	    }

	    public String getExperiencia() {
	        return experiencia;
	    }
	}
	@Component
	public class OtraClase {
	    private ExperienciaServicio experienciaServicio;

	    @Autowired
	    public OtraClase(@Value("${experienciaServicio.experiencia}"));
	}

