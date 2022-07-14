package rest;

import model.Cripto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.CriptoService;

@RestController
@RequestMapping("/api/v1/cripto/")
public class RestCostumerControllerV1 {
    @Autowired
    private CriptoService criptoService;
    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    /*public ResponseEntity<Cripto> getCripto(){

    }*/
}
