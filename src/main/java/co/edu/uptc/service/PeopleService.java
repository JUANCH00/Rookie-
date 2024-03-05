package co.edu.uptc.service;

import java.util.Collections;

import co.edu.uptc.ejemplo1.enlazadas.UptcList;
import co.edu.uptc.model.Persons;

public class PeopleService {
    UptcList<Persons> people = new UptcList<Persons>();

    public PeopleService() {
        createPeople();
    }

    public UptcList<Persons> createPeople() {

        Persons person = new Persons();
        person.setName("Juan");
        person.setLastName("Martine");
        person.setAge(25);
        person.setAddres(null);
        person.setGender(null);
        people.add(person);

        person = new Persons();
        person.setName("ARaul");
        person.setLastName("Ramire");
        person.setAge(34);
        person.setAddres(null);
        person.setGender(null);
        people.add(person);

        person = new Persons();
        person.setName("Sebastian");
        person.setLastName("Ramire");
        person.setAge(34);
        person.setAddres(null);
        person.setGender(null);
        people.add(person);

        person = new Persons();
        person.setName("Camila");
        person.setLastName("Ramire");
        person.setAge(34);
        person.setAddres(null);
        person.setGender(null);
        people.add(person);

        person = new Persons();
        person.setName("Laura");
        person.setLastName("Ramire");
        person.setAge(34);
        person.setAddres(null);
        person.setGender(null);
        people.add(person);

        return people;
    }

    public UptcList<Persons> getPeople() {
        UptcList<Persons> list = new UptcList<>();
        for (Persons person : this.people) {
            list.add(person);
        }
        return list;
    }

    public UptcList<Persons> orderByName(UptcList<Persons> list) {
        Collections.sort(list, ComparatorService.personNameComparator());
        return list;
    }

    public UptcList<Persons> orderByLastName(UptcList<Persons> list) {
        Collections.sort(list, ComparatorService.personLastNameComparator());
        return list;
    }
}
