package services;

import domain.City;
import resources.CityResource;

import java.util.Map;

public class CityService {

    private CityResource cityResource;

    public CityService(CityResource cityResource){this.cityResource = cityResource;}

    public Map<String, City> getAllCities(){
        return cityResource.getALL();
    }
}
