package br.com.mouawad.estudos.spring.seguranca.resources;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Igor M. Mouawad
 */
@RestController
@RequestMapping(value="/cliente")
public class ClienteResource {
    

    

    	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> loginOK() {
        String r = "{\n"
                + "\"status\" : \"Usuario logado\"\n"
                + "}" ;

		return ResponseEntity.ok().body(r);
	}
    
}
