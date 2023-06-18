package domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class City {

    private String id;
    private String location;
    private Set <City> incomingRouteLocations = new HashSet<>();
    private Set <City> outgoingRouteLocations = new HashSet<>();

    public City(String id, String location){
        this.id = id;
        this.location = location;
    }

    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    public String getLocation() {return location;}

    public void setLocation(String location) {this.location = location;}

    public Set<City> getIncomingRouteLocations() {return incomingRouteLocations;}

    public void setIncomingRouteLocations(Set<City> incomingRouteLocations){
        this.incomingRouteLocations = incomingRouteLocations;
    }
    public Set<City> getOutgoingRouteLocations() {return outgoingRouteLocations;}

    public void addIncomingRouteLocation(City city){incomingRouteLocations.add(city);}

    public void addOutgoingRouteLocation(City city){outgoingRouteLocations.add(city);}

    public void setOutgoingRouteLocations(Set<City> outgoingRouteLocations){
        this.outgoingRouteLocations = outgoingRouteLocations;
    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", location='" + location + '\'' +
                ", incomingRouteLocations=" + incomingRouteLocations.size() +
                ", outgoingRouteLocations=" + outgoingRouteLocations.size() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City city)) return false;
        return Objects.equals(id, city.id) && Objects.equals(location, city.location) && Objects.equals(incomingRouteLocations, city.incomingRouteLocations) && Objects.equals(outgoingRouteLocations, city.outgoingRouteLocations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, location);
    }
}
