package co.edu.uptc.ejemplo1.services;

import co.edu.uptc.ejemplo1.models.Persons;

public class PersonService {

    public Persons generatePersons() {
        Persons person = new Persons();
        person.setName("John Doe");
        person.setLastName("Gonzales");
        return person;
    }
}
