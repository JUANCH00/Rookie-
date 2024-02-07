package co.edu.uptc.ejemplo1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uptc.ejemplo1.models.Persons;
import co.edu.uptc.ejemplo1.services.PersonService;

@RestController
@RequestMapping("messages")
public class messsageController {

    @GetMapping("/msg")
    public String getMessage() {
        return "Bom dia";
    }

    @GetMapping("/person")
    public Persons getPerson() {
        PersonService personService = new PersonService();
        return personService.generatePersons();
    }
}
