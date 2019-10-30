package ar.com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {

    @RequestMapping(value = "/hola", method = RequestMethod.GET)
    public String holaMundo(){
        return "Hola mundo";
    }

    @RequestMapping(value = "/hola/{nombre}", method = RequestMethod.GET)
    public String holaNombre(@PathVariable String nombre){
        return "Hola " + nombre;
    }
}
