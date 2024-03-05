package co.edu.uptc.controller;

import co.edu.uptc.ejemplo1.enlazadas.UptcList;
import co.edu.uptc.model.Persons;
import co.edu.uptc.service.PeopleService;

public class MessageController {
    PeopleService peopleService = new PeopleService();

    public MessageController() {
    }

    public UptcList<Persons> getPersons() {
        showInfo(peopleService.getPeople());
        return peopleService.getPeople();
    }

    public UptcList<Persons> orderByName() {
        UptcList<Persons> list = peopleService.getPeople();
        showInfo(peopleService.orderByName(list));
        return peopleService.orderByName(list);
    }

    public UptcList<Persons> orderByLastName() {
        UptcList<Persons> list = peopleService.getPeople();
        showInfo(peopleService.orderByLastName(list));
        return peopleService.orderByLastName(list);
    }

    public <T> void testPersons() {
        PeopleService peopleService = new PeopleService();
        UptcList<Persons> people = peopleService.createPeople();
        showInfo(people);
    }

    public void showInfo(UptcList<Persons> list) {
        for (Persons persons : list) {
            System.out.println(persons.getName());
            System.out.println(persons.getLastName() + "\n");
        }
    }

    public void testArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array.length);
            Persons persons = (Persons) array[i];
            System.out.println(persons.getName());
            System.out.println(persons.getLastName());
        }
    }
}
