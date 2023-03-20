package com.clase.info;


public class examen2tema5 {
	public class PocaExperienciaServicio implements ExperienciaServicio {
	    private String experiencia;

	    public PocaExperienciaServicio(String experiencia) {
	        this.experiencia = experiencia;
	    }

	    public String getExperiencia() {
	        return experiencia;
	    }
	
	    public class PocaExperienciaServicio implements ExperienciaServicio {
	        private String experiencia;

	        public void setExperiencia(String experiencia) {
	            this.experiencia = experiencia;
	        }

	        public String getExperiencia() {
	            return experiencia;
	        }
	    
	        public class ProfesorInformatica implements Profesor, ExperienciaServicio {
	            private String david;
	            private String Programacion web fullstack;
	            private String experiencia;

	            // Implementación de métodos de las interfaces Profesor y ExperienciaServicio

	            public String getExperiencia() {
	                return experiencia;
	            }

	            public void setExperiencia(String experiencia) {
	                this.experiencia = experiencia;
	            }
	        


