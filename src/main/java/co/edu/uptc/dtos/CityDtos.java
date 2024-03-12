package co.edu.uptc.dtos;

public class CityDtos {
    private String name;
    private String codeDane;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodeDane() {
        return this.codeDane;
    }

    public void setCodeDane(String codeDane) {
        this.codeDane = codeDane;
    }

    public static CityDtos fromCity() {
        CityDtos cityDto = new CityDtos();
        return cityDto;
    }
}
