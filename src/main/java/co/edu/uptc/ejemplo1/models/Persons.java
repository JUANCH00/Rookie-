package co.edu.uptc.ejemplo1.models;

public class Persons {

    private String name;
    private String lastName;
    private int weight;

    public Persons() {
    }

    public Persons(String name, String lastName, int weight) {
        this.name = name;
        this.lastName = lastName;
        this.weight = weight;
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

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
