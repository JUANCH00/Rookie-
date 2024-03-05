package co.edu.uptc.service;

import java.util.Comparator;

import co.edu.uptc.model.Persons;

public class ComparatorService {

    public static Comparator<Persons> personNameComparator() {
        return new Comparator<Persons>() {

            @Override
            public int compare(Persons o1, Persons o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
    }

    public static Comparator<Persons> personLastNameComparator() {
        return new Comparator<Persons>() {

            @Override
            public int compare(Persons o1, Persons o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        };
    }
}
