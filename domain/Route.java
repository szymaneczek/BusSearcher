package domain;

import java.util.Objects;

public class Route {

    private City from;

    private City to;

    public Route(City from, City to){
        this.from = from;
        this.to = to;
    }

    public City getFrom() {return from;}

    public void setFrom(City from) {this.from = from;}

    public City getTo(){return to;}

    public void setTo(City to) {this.to = to;}

    @Override
    public String toString() {
        return "Route{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Route route)) return false;
        return Objects.equals(from, route.from) && Objects.equals(to, route.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }
}
