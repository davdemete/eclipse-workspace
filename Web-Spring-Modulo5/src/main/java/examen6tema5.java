
public class examen6tema5 {
	
	public class FormularioController {

	    
	    public String mostrarFormulario(Model model) {
	        model.addAttribute("persona", new Persona());
	        return "formulario";
	    }

	    @PostMapping("/procesarFormulario")
	    public String procesarFormulario(@ModelAttribute Persona persona, Model model) {
	        model.addAttribute("nombre", persona.getNombre());
	        model.addAttribute("edad", persona.getEdad());
	        return "resultado";
	    }

	}

}
