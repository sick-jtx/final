package pe.upc.edu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(path = "/api/autos")
public class AutoController {

    @RequestMapping
    public String prueba(){
        return new Date().toString();
    }
}
