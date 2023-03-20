
public class Examenfinal1 {
	@RestController
	@RequestMapping("/controller")
	public class Controller {

	    @PostMapping("/post")
	    public String postEjemplo(@RequestBody String data) {
	        return "Datos recibidos: " + data;
	    }

	    @GetMapping("/get")
	    public String getEjemplo(@RequestParam String nombre) {
	        return "Hola " + nombre + "!";
	    }
	}

}
