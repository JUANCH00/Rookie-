package co.edu.uptc.service;

import java.util.ArrayList;
import java.util.List;

import co.edu.uptc.model.City;

public class CityService {
    List<City> cities = new ArrayList<City>();

    public CityService() {

    }

    public void createCity() {
        City city = new City();
        city.setName("Tunja");
        city.setCodeDane("15001");
        cities.add(city);

        city = new City();
        city.setName("Bogota");
        city.setCodeDane("15001");
        cities.add(city);
    }

    public List<City> getCities() {
        return this.cities;
    }
}
