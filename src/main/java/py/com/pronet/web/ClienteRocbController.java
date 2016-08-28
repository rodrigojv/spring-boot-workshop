package py.com.pronet.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClienteRocbController {

	private static final String URL = "http://localhost:9081/api/notsecure/saludoprueba";
	
	@RequestMapping(value = "/api/saludorocb/{nombre}")
	public String saludar(@PathVariable String nombre) {
		
		RestTemplate template = new RestTemplate();
		
		ResponseEntity<String> respuesta = template.getForEntity(URL + "/" + nombre, String.class);
		String saludoRocb = respuesta.getBody();
		
		return saludoRocb;
	}
	
}
