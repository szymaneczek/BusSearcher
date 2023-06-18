package services;

import domain.City;
import domain.Route;
import dto.RouteSearchDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RouteSearchService {

    private CityService cityService;

    private Map<String, City> cities;

    public RouteSearchService(CityService cityService){
        this.cityService = cityService;
        cities = cityService.getAllCities();
    }

    public RouteSearchDto findRoutes(String from, String to){
        City cityFrom = cities.get(from.toUpperCase());
        City cityTo = cities.get(to.toUpperCase());

        Route directRoute = null;
        List<Route> jointRoutes = new ArrayList<>();

        if (cityFrom.getOutgoingRouteLocations().contains(cityTo)){
            directRoute = new Route(cityFrom, cityTo);
        }

        cityFrom.getOutgoingRouteLocations().stream()
                .filter(city -> city.getOutgoingRouteLocations().contains(cityTo))
                .forEach(city -> {
                    jointRoutes.add(new Route(cityFrom, city));
                    jointRoutes.add(new Route(city, cityTo));
                });
        return new RouteSearchDto(directRoute, jointRoutes);
    }
}
