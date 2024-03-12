package co.edu.uptc.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
        person.setName("BJuan");
        person.setLastName("XMartine");
        person.setAddres(null);
        person.setGender(null);
        person.setBirthData(LocalDate.of(1990, 12, 1));
        people.add(person);

        person = new Persons();
        person.setName("ARaul");
        person.setLastName("BRamire");
        person.setAddres(null);
        person.setGender(null);
        people.add(person);

        person = new Persons();
        person.setName("CSebastian");
        person.setLastName("ARamire");
        person.setAddres(null);
        person.setGender(null);
        people.add(person);

        person = new Persons();
        person.setName("ECamila");
        person.setLastName("RRamire");
        person.setAddres(null);
        person.setGender(null);
        people.add(person);

        person = new Persons();
        person.setName("DLaura");
        person.setLastName("SRamire");
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
