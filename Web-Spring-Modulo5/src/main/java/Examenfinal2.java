
public class Examenfinal2 {
	@RestController
	@RequestMapping("/mapping")
	public class EjemploController {
	    //...
		
	}
	@PostMapping("/post")
	public String postEjemplo(@RequestBody String data, @RequestHeader("User-Agent") String userAgent) {
	    System.out.println("Datos recibidos en el body: " + data);
	    System.out.println("User-Agent recibido en la cabecera: " + userAgent);
	    return "Datos recibidos en el body: " + data + ", User-Agent recibido en la cabecera: " + userAgent;
	}

}
