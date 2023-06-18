package resources;

import domain.City;
import domain.Route;

import java.util.HashMap;
import java.util.Map;

public class CityResource {

    private HashMap<String, City> cities = new HashMap<>();

    public CityResource() {
        City lub = new City("LUB", "Lublin (Poland)");
        City waw = new City("WAW", "Warszawa (Poland)");
        City poz = new City("POZ", "Poznan (Poland)");
        City wrc = new City("WRC", "Wroclaw (Poland)");
        City ber = new City("BER", "Berlin (Germany)");
        City par = new City("PAR", "Paris (France)");

        cities.put("LUB", lub);
        cities.put("WAW", waw);
        cities.put("POZ", poz);
        cities.put("WRC", wrc);
        cities.put("BER", ber);
        cities.put("PAR", par);

        addRoute(new Route(lub, waw));
        addRoute(new Route(waw, lub));
        addRoute(new Route(lub, wrc));
        addRoute(new Route(wrc, lub));
        addRoute(new Route(waw, ber));
        addRoute(new Route(ber, waw));
        addRoute(new Route(waw, par));
        addRoute(new Route(par, waw));
    }
        public void addRoute(Route route){
            City from = route.getFrom();
            City to = route.getTo();

            cities.get(from.getId()).addOutgoingRouteLocation(to);
            cities.get(to.getId()).addIncomingRouteLocation(from);
        }

        public Map<String, City> getALL(){return cities;}
    }

