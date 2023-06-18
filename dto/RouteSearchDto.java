package dto;

import domain.Route;

import java.util.List;

public class RouteSearchDto {

    private Route directRoute;

    private List<Route> jointRoutes;

    public RouteSearchDto(final Route directRoute, final List<Route> jointRoutes){
        this.directRoute = directRoute;
        this.jointRoutes = jointRoutes;
    }

    public Route getDirectRoute(){return directRoute;}

    public List<Route> getJointRoutes(){return jointRoutes;}
}
