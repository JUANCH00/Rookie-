package co.edu.uptc.ejemplo1.models;

public class Persons {

    private String name;
    private String lastName;

    public Persons() {
    }

    public Persons(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
