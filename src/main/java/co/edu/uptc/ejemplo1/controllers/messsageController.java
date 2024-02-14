package co.edu.uptc.ejemplo1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uptc.ejemplo1.enlazadas.Nodo;
import co.edu.uptc.ejemplo1.enlazadas.UptcList;
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

    @GetMapping("/saludos")
    public String getMessager() {
        UptcList<Persons> uptcList = new UptcList();

        Persons p = new Persons();
        p.setName("Juanito");
        p.setLastName("Perez");
        uptcList.add(p);

        p = new Persons();
        p.setName("Benito");
        p.setLastName("Martine");

        uptcList.add(p);
        uptcList.remove();
        showInfo(uptcList);
        return "Hola Mundo";

    }

    public void showInfo(UptcList<Persons> uptcList) {
        Nodo<Persons> nodel = uptcList.getHeader();

        while (nodel != null) {
            System.out.println(nodel.getInfo().getName() + " " + nodel.getInfo().getLastName());
            nodel = nodel.getNext();
        }
    }
}
